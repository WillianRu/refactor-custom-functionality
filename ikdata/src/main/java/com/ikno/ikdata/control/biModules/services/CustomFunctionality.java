package com.ikno.ikdata.control.biModules.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ikno.ikdata.control.biModules.enums.WorkFlowPhase;
import com.ikno.ikdata.control.biModules.exceptions.ScriptExecutionException;
import com.ikno.ikdata.control.biModules.fileService.IBatchJsonFileService;
import com.ikno.ikdata.control.biModules.scriptExecutorService.IScriptExecutor;
import com.ikno.ikdata.dtos.batchObjects.BatchJsonDTO;

@Service
public class CustomFunctionality {
    private final IScriptExecutor scriptExecutor;
    private final IBatchJsonFileService fileService;

    @Autowired
    public CustomFunctionality(IScriptExecutor scriptExecutor, IBatchJsonFileService fileService) {
        this.scriptExecutor = scriptExecutor;
        this.fileService = fileService;
    }

    public BatchJsonDTO executePhase(WorkFlowPhase phase, BatchJsonDTO batchJsonDTO, String workingPath) throws Exception {
        fileService.saveBatchJson(batchJsonDTO, workingPath);

        try {
            scriptExecutor.executeScript(phase.getScriptName(), batchJsonDTO, workingPath);
        } catch (ScriptExecutionException e) {
            System.err.println("Error executing script: " + e.getMessage());
            throw e;
        }

        BatchJsonDTO updatedBatchJsonDTO = fileService.readBatchJson(batchJsonDTO.getBatchId(), workingPath);

        return updatedBatchJsonDTO;
    }
}
