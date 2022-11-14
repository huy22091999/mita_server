package vn.oceantech.mita.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import vn.oceantech.mita.domain.LabTestXRay;
import vn.oceantech.mita.dto.LabTestDto;
import vn.oceantech.mita.dto.LabTestXRayDto;
import vn.oceantech.mita.dto.PatientDto;
import vn.oceantech.mita.dto.search.SearchDto;
import vn.oceantech.mita.service.LabTestXRayService;
import vn.oceantech.mita.service.PatientService;

import java.util.List;

@RestController
@RequestMapping("/lab-test-x-rays")
public class LabTestXRayRestController {
    @Autowired
    private LabTestXRayService service;

    @GetMapping("/{id}")
    public ResponseEntity<List<LabTestXRayDto>> getByPatientId(@PathVariable(value = "id") long id) {
        return new ResponseEntity<List<LabTestXRayDto>>(service.getByPatientId(id), HttpStatus.OK);
    }
}
