package vn.oceantech.mita.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import vn.oceantech.mita.dto.PatientDto;
import vn.oceantech.mita.dto.search.SearchDto;
import vn.oceantech.mita.service.PatientService;

@RestController
@RequestMapping("/patients")
public class PatientRestController {
    @Autowired
    private PatientService patientService;

    @PostMapping("/search")
    public ResponseEntity<Page<PatientDto>> search(@RequestBody SearchDto dto) {
        return new ResponseEntity<Page<PatientDto>>(patientService.search(dto), HttpStatus.OK);
    }
}
