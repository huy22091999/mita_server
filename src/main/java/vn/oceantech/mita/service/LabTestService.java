package vn.oceantech.mita.service;

import org.springframework.data.domain.Page;
import vn.oceantech.mita.dto.LabTestDto;
import vn.oceantech.mita.dto.PatientDto;
import vn.oceantech.mita.dto.PrescriptionDto;
import vn.oceantech.mita.dto.search.SearchDto;

import java.util.List;

public interface LabTestService {
    List<LabTestDto> getByPatientId(long id);
}
