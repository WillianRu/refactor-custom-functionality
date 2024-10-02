package com.ikno.ikdata.dtos.batchObjects;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BatchJsonMultiPageDocumentDTO {

    private String id;
    private String multiPageDocType;
    private List<BatchJsonDocumentDTO> documents;

    public BatchJsonMultiPageDocumentDTO(String id, String multiPageDocType, List<BatchJsonDocumentDTO> documents) {
        this.id = id;
        this.multiPageDocType = multiPageDocType;
        this.documents = documents;
    }
}
