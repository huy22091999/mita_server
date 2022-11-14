package vn.oceantech.mita.service;

import org.springframework.data.domain.Page;
import vn.oceantech.mita.dto.LabTestXRayDto;
import vn.oceantech.mita.dto.PatientDto;
import vn.oceantech.mita.dto.PrescriptionDto;
import vn.oceantech.mita.dto.search.SearchDto;

import java.util.List;

public interface LabTestXRayService {
    List<LabTestXRayDto> getByPatientId(long id);
}
