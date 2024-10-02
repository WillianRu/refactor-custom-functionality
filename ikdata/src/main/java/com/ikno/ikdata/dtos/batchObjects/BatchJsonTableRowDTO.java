package com.ikno.ikdata.dtos.batchObjects;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class BatchJsonTableRowDTO {
    private List<BatchJsonDataFieldDTO> columnFields;

    public BatchJsonTableRowDTO() {
        columnFields = new ArrayList<>();
    }
}
