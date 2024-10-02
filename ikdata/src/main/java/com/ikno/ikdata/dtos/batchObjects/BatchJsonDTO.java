package com.ikno.ikdata.dtos.batchObjects;

import java.time.LocalDateTime;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BatchJsonDTO {

    private String batchId;
    private String batchName;
    private String status;
    private int priority;
    private String projectId;
    private String projectName;
    private String importDate;
    private String modifiedDate;
    private List<BatchJsonDocumentDTO> documents;
    private List<BatchJsonMultiPageDocumentDTO> multiPageDocuments;
    private String exportPath;
    private String validateConfidenceView;

    public BatchJsonDTO(String batchId, String batchName, String status, int priority, String projectId,
            String projectName, LocalDateTime importDate, LocalDateTime modifiedDate, String validateConfidenceView) {
        this.batchId = batchId;
        this.batchName = batchName;
        this.status = status;
        this.priority = priority;
        this.projectId = projectId;
        this.projectName = projectName;
        this.importDate = importDate.toString();
        this.modifiedDate = modifiedDate.toString();
        this.validateConfidenceView = validateConfidenceView;
    }
}
