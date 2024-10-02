package com.ikno.ikdata.dtos.batchObjects;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BatchJsonDocumentDTO {
    private int docId;
    private String docType;
    private long docTypeId;
    private double confidence;
    private List<BatchJsonSinglePageDTO> pages;
    private List<BatchJsonDataFieldDTO> dataFields;
    private BatchJsonTableDTO table;
    private boolean needsReview;
    private String validationMessage;
    private String businessRulesMessage;
    private double configConfidence;
    private boolean filledMarkField;
    private String colorMarkField;
    private String docunetSerie;
    private String docunetSubSerie;

    public BatchJsonDocumentDTO(){}

    public BatchJsonDocumentDTO(int docId, long docTypeId, String docType, double confidence,
            List<BatchJsonSinglePageDTO> pages,
            double configConfidence, boolean filledMarkField, String colorMarkField) {
        this.docTypeId = docTypeId;
        this.docId = docId;
        this.docType = docType;
        this.confidence = confidence;
        this.pages = pages;
        this.needsReview = false;
        this.validationMessage = "";
        this.businessRulesMessage = "";
        this.configConfidence = configConfidence;
        this.filledMarkField = filledMarkField;
        this.colorMarkField = colorMarkField;
        this.docunetSerie = "";
        this.docunetSubSerie = "";
    }

    public BatchJsonDocumentDTO(int docId, long docTypeId, String docType, double confidence,
            List<BatchJsonSinglePageDTO> pages,
            double configConfidence, boolean filledMarkField, String colorMarkField, String docunetSerie,
            String docunetSubSerie) {
        this.docTypeId = docTypeId;
        this.docId = docId;
        this.docType = docType;
        this.confidence = confidence;
        this.pages = pages;
        this.needsReview = false;
        this.validationMessage = "";
        this.businessRulesMessage = "";
        this.configConfidence = configConfidence;
        this.filledMarkField = filledMarkField;
        this.colorMarkField = colorMarkField;
        this.docunetSerie = docunetSerie;
        this.docunetSubSerie = docunetSubSerie;
    }
}
