package vn.oceantech.mita.service;

import vn.oceantech.mita.dto.LabTestAssignDto;
import vn.oceantech.mita.dto.LabTestAssignTemplateDto;
import vn.oceantech.mita.dto.LabTestDto;

import java.util.List;

public interface LabTestAssignService {
    List<LabTestAssignDto> getByPatientId(long id);

    List<LabTestAssignDto> getAll();

    List<LabTestAssignDto> save(List<LabTestAssignDto> dtos, long patientId);

    List<LabTestAssignTemplateDto> getTemplates();
}
