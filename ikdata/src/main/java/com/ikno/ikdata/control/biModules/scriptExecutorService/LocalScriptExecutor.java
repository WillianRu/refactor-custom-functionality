package com.ikno.ikdata.control.biModules.scriptExecutorService;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import com.ikno.ikdata.control.biModules.exceptions.ScriptExecutionException;
import com.ikno.ikdata.dtos.batchObjects.BatchJsonDTO;

@Component
@Primary
public class LocalScriptExecutor implements IScriptExecutor{
    @Override
    public void executeScript(String scriptName, BatchJsonDTO batchJsonDTO, String workingPath) throws ScriptExecutionException {
        System.out.println("Executing local script: " + scriptName);
    }
}
