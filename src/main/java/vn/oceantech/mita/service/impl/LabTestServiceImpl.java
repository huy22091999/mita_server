package vn.oceantech.mita.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.oceantech.mita.dto.LabTestDto;
import vn.oceantech.mita.repository.LabTestRepository;
import vn.oceantech.mita.service.LabTestService;

import java.util.List;


@Service
public class LabTestServiceImpl implements LabTestService {
    @Autowired
    private LabTestRepository repository;


    @Override
    public List<LabTestDto> getByPatientId(long id) {
        return repository.getByPatientId(id);
    }
}
