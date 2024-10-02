package com.ikno.ikdata.dtos.batchObjects;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class BatchJsonTableDTO {
    private List<BatchJsonTableRowDTO> tableRows;

    public BatchJsonTableDTO() {
        tableRows = new ArrayList<>();
    }
}
