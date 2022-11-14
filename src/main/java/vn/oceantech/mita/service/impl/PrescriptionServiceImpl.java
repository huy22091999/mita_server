package vn.oceantech.mita.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.oceantech.mita.dto.PrescriptionDto;
import vn.oceantech.mita.repository.PrescriptionRepository;
import vn.oceantech.mita.service.PrescriptionService;

import java.util.List;


@Service
public class PrescriptionServiceImpl implements PrescriptionService {
    @Autowired
    private PrescriptionRepository repository;


    @Override
    public List<PrescriptionDto> getByPatientId(long id) {
        return repository.getByPatientId(id);
    }
}
