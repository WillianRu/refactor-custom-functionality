package com.ikno.ikdata.control.biModules.fileService;

import org.springframework.stereotype.Service;

import com.ikno.ikdata.control.biModules.exceptions.FileServiceException;
import com.ikno.ikdata.dtos.batchObjects.BatchJsonDTO;

@Service
public class BatchJsonFileService implements IBatchJsonFileService{
    @Override
    public void saveBatchJson(BatchJsonDTO batchJsonDTO, String workingPath) throws FileServiceException {
        System.out.println("Saving BatchJsonDTO to path: " + workingPath);
    }

    @Override
    public BatchJsonDTO readBatchJson(String batchId, String workingPath) throws FileServiceException {
        System.out.println("Reading BatchJsonDTO with ID: " + batchId);
        return new BatchJsonDTO();
    }
}
