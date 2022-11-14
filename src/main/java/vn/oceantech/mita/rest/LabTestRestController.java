package vn.oceantech.mita.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import vn.oceantech.mita.dto.LabTestDto;
import vn.oceantech.mita.service.LabTestService;

import java.util.List;

@RestController
@RequestMapping("/lab-tests")
public class LabTestRestController {
    @Autowired
    private LabTestService service;

    @GetMapping("/{id}")
    public ResponseEntity<List<LabTestDto>> getByPatientId(@PathVariable(value = "id") long id) {
        return new ResponseEntity<List<LabTestDto>>(service.getByPatientId(id), HttpStatus.OK);
    }


}
