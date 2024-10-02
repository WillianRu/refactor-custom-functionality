package com.ikno.ikdata.dtos.batchObjects;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BatchJsonClassificationDTO {
    private String classificationName;
    private long docTypeId;
    private String segment;
    private double confidence;
    private String imageFileName;
    private double configConfidence;

    public BatchJsonClassificationDTO(String classificationName, long docTypeId, double confidence, String segment,
            double configConfidence) {
        this.classificationName = classificationName;
        this.docTypeId = docTypeId;
        this.confidence = confidence;
        this.segment = segment;
        this.configConfidence = configConfidence;
    }

    public BatchJsonClassificationDTO() {
    }
}
