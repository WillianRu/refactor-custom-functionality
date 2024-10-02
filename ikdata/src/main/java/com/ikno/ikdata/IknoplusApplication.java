package com.ikno.ikdata;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ikno.ikdata.control.biModules.enums.WorkFlowPhase;
import com.ikno.ikdata.control.biModules.services.CustomFunctionality;
import com.ikno.ikdata.dtos.batchObjects.BatchJsonDTO;

@SpringBootApplication
public class IknoplusApplication implements CommandLineRunner {

	@Autowired
	private CustomFunctionality customFunctionality;

	public static void main(String[] args) {
		SpringApplication.run(IknoplusApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

        // Dummy BatchJsonDTO
        BatchJsonDTO batchJsonDTO = new BatchJsonDTO();
        batchJsonDTO.setBatchId("12345");
        batchJsonDTO.setProjectName("ProyectoDemo");

		// Dummy link
        String workingPath = "/ruta/de/trabajo"; 

        // Execute a specific phase
        BatchJsonDTO result = customFunctionality.executePhase(WorkFlowPhase.PRE_CLASSIFY, batchJsonDTO, workingPath);

        // Print result
        System.out.println("Resultado de la fase:");
        System.out.println(result);
    }

}
