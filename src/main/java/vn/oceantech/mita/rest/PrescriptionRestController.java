package vn.oceantech.mita.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import vn.oceantech.mita.dto.PrescriptionDto;
import vn.oceantech.mita.service.PrescriptionService;

import java.util.List;

@RestController
@RequestMapping("/prescriptions")
public class PrescriptionRestController {
    @Autowired
    private PrescriptionService service;

    @GetMapping("/{id}")
    public ResponseEntity<List<PrescriptionDto>> getByPatientId(@PathVariable(value = "id") long id) {
        return new ResponseEntity<List<PrescriptionDto>>(service.getByPatientId(id), HttpStatus.OK);
    }
}
