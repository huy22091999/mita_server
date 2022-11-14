package vn.oceantech.mita.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.oceantech.mita.dto.LabTestXRayDto;
import vn.oceantech.mita.repository.LabTestXRayRepository;
import vn.oceantech.mita.service.LabTestXRayService;

import java.util.List;


@Service
public class LabTestXRayServiceImpl implements LabTestXRayService {
    @Autowired
    private LabTestXRayRepository repository;


    @Override
    public List<LabTestXRayDto> getByPatientId(long id) {
        return repository.getByPatientId(id);
    }
}
