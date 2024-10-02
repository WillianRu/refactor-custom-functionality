package com.ikno.ikdata.dtos.batchObjects;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BatchJsonDataFieldDTO {

    private long fieldId;
    private String label;
    private String key;
    private double kFuzziness;
    private double kX0;
    private double kY0;
    private double kX1;
    private double kY1;
    private String value;
    private double vConfidence;
    private double vX0;
    private double vY0;
    private double vX1;
    private double vY1;
    private boolean required;
    private boolean multiLine;
    private int kRotation;
    private int extractionPriority;
    private String replacementList;
    private String confirmationValue;
    private String fieldMessage;
    private String validateRegExp;
    private boolean hidden;
    private String docunetIndex;

    private double limiter_x0;
    private double limiter_y0;
    private double limiter_x1;
    private double limiter_y1;
    private String limiter;

    private double top_limiter_x0;
    private double top_limiter_y0;
    private double top_limiter_x1;
    private double top_limiter_y1;
    private String top_limiter;

    private double configConfidence;
    private boolean markField;

    private String extractionUsed;

    private boolean skipReport;

    private boolean skipExport;

    private boolean doubleExtraction;

    public BatchJsonDataFieldDTO() {
        this.vConfidence = -1;
        this.kFuzziness = 101;
        this.extractionPriority = Integer.MAX_VALUE;
        this.replacementList = null;
        this.confirmationValue = null;
        this.fieldMessage = "";
        this.configConfidence = 80;
        this.extractionUsed = "";
        this.validateRegExp = ".*";
        this.extractionUsed = "";
        this.skipReport = false;
        this.hidden = false;
        this.skipExport = false;
    }

    public BatchJsonDataFieldDTO(BatchJsonDataFieldDTO dto) {
        this.vConfidence = -1;
        this.kFuzziness = 101;
        this.extractionPriority = Integer.MAX_VALUE;
        this.replacementList = null;
        this.confirmationValue = null;
        this.fieldMessage = "";
        this.configConfidence = 80;
        this.extractionUsed = "";
        this.validateRegExp = ".*";
        this.extractionUsed = "";
        this.extractionUsed = dto.getExtractionUsed();
        this.docunetIndex = dto.getDocunetIndex();
        this.skipReport = dto.isSkipReport();
        this.hidden = dto.isHidden();
        this.skipExport = dto.isSkipExport();
    }
}
