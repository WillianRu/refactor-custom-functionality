package com.ikno.ikdata.control.biModules.scriptExecutorService;

import com.ikno.ikdata.control.biModules.exceptions.ScriptExecutionException;
import com.ikno.ikdata.dtos.batchObjects.BatchJsonDTO;

public interface IScriptExecutor {
    void executeScript(String scriptName, BatchJsonDTO batchJsonDTO, String workingPath) throws ScriptExecutionException;
}
