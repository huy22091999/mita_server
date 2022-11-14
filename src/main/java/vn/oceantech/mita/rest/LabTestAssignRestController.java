package vn.oceantech.mita.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import vn.oceantech.mita.domain.LabTestAssign;
import vn.oceantech.mita.dto.LabTestAssignDto;
import vn.oceantech.mita.dto.LabTestAssignTemplateDto;
import vn.oceantech.mita.dto.LabTestDto;
import vn.oceantech.mita.service.LabTestAssignService;
import vn.oceantech.mita.service.LabTestService;
import javafx.util.Pair;

import java.util.List;

@RestController
@RequestMapping("/lab-test-assigns")
public class LabTestAssignRestController {
    @Autowired
    private LabTestAssignService service;

    @GetMapping("/{id}")
    public ResponseEntity<List<LabTestAssignDto>> getByPatientId(@PathVariable(value = "id") long id) {
        return new ResponseEntity<List<LabTestAssignDto>>(service.getByPatientId(id), HttpStatus.OK);
    }

    @PostMapping("/{id}")
    public ResponseEntity<List<LabTestAssignDto>> saveByPatientId(@RequestBody List<LabTestAssignDto> dtos, @PathVariable(value = "id") long id) {
        return new ResponseEntity<List<LabTestAssignDto>>(service.save(dtos, id), HttpStatus.OK);
    }

    @GetMapping("/templates")
    public ResponseEntity<List<LabTestAssignTemplateDto>> getTemplates() {
        return new ResponseEntity<>(service.getTemplates(), HttpStatus.OK);
    }
}
