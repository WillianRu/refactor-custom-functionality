package com.ikno.ikdata.control.biModules.fileService;

import com.ikno.ikdata.control.biModules.exceptions.FileServiceException;
import com.ikno.ikdata.dtos.batchObjects.BatchJsonDTO;

public interface IBatchJsonFileService {
    void saveBatchJson(BatchJsonDTO batchJsonDTO, String workingPath) throws FileServiceException;
    BatchJsonDTO readBatchJson(String batchId, String workingPath) throws FileServiceException;
}
