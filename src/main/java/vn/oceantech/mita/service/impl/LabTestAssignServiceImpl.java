package vn.oceantech.mita.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;
import vn.oceantech.mita.domain.LabTestAssign;
import vn.oceantech.mita.domain.Patient;
import vn.oceantech.mita.dto.LabTestAssignDto;
import vn.oceantech.mita.dto.LabTestAssignTemplateDto;
import vn.oceantech.mita.dto.LabTestDto;
import vn.oceantech.mita.repository.LabTestAssignRepository;
import vn.oceantech.mita.repository.LabTestAssignTemplateRepository;
import vn.oceantech.mita.repository.LabTestRepository;
import vn.oceantech.mita.repository.PatientRepository;
import vn.oceantech.mita.service.LabTestAssignService;
import vn.oceantech.mita.service.LabTestService;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


@Service
public class LabTestAssignServiceImpl implements LabTestAssignService {
    @Autowired
    private LabTestAssignRepository repository;

    @Autowired
    private PatientRepository patientRepository;

    @Autowired
    private LabTestAssignTemplateRepository labTestAssignTemplateRepository;

    @Override
    public List<LabTestAssignDto> getByPatientId(long id) {
        return repository.getDtoByPatientId(id);
    }

    @Override
    public List<LabTestAssignDto> getAll() {
        return repository.getAll();
    }

    public List<LabTestAssignTemplateDto> getTemplates() {
        return labTestAssignTemplateRepository.getAll();
    }

    public List<LabTestAssignDto> save(List<LabTestAssignDto> dtos, long patientId) {
        if (!ObjectUtils.isEmpty(dtos)) {
            Patient patient = patientRepository.getReferenceById(patientId);
            if (patient != null) {
                List<LabTestAssign> result = new ArrayList<>();
                for (LabTestAssignDto item : dtos) {
                    LabTestAssign entity;
                    if (item.getId() == null) {
                        entity = new LabTestAssign();
                        entity.setPatient(patient);
                        if (item.getLabTestAssignTemplate() != null) {
                            entity.setLabTestAssignTemplate(item.getLabTestAssignTemplate().toEntity());
                            result.add(repository.save(entity));
                        }
                    } else {
                        entity = repository.getReferenceById(item.getId());
                        if (entity != null) {
                            result.add(entity);
                        }
                    }

                }
                List<LabTestAssign> listOld = repository.getByPatientId(patientId);
                dtos.clear();
                for (LabTestAssign item : listOld) {
                    if (!result.contains(item)) {
                        repository.delete(item);
                    } else dtos.add(new LabTestAssignDto(item));
                }
                return dtos;
            }
        }
        return null;
    }


}
