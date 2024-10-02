package com.ikno.ikdata.dtos.batchObjects;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BatchJsonSinglePageDTO {
    private String imageFileName;
    private int pageID;
    private double originalImageWidth;
    private double originalImageHeight;
    private List<BatchJsonClassificationDTO> searchClassification;

    public BatchJsonSinglePageDTO(String imageFileName, int pageID,
            List<BatchJsonClassificationDTO> searchClassification, double imageWidth, double imageHeight) {
        this.imageFileName = imageFileName;
        this.pageID = pageID;
        this.searchClassification = searchClassification;

        this.originalImageWidth = imageWidth;
        this.originalImageHeight = imageHeight;

    }
}
