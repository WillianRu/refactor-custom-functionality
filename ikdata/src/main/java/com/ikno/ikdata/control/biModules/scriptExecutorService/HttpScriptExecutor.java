package com.ikno.ikdata.control.biModules.scriptExecutorService;

import org.springframework.stereotype.Component;

import com.ikno.ikdata.control.biModules.exceptions.ScriptExecutionException;
import com.ikno.ikdata.dtos.batchObjects.BatchJsonDTO;

@Component
public class HttpScriptExecutor implements IScriptExecutor {
    @Override
    public void executeScript(String scriptName, BatchJsonDTO batchJsonDTO, String workingPath) throws ScriptExecutionException {
        System.out.println("Executing http script: " + scriptName);
    }
}
