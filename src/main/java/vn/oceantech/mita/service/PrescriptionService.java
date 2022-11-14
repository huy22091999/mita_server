package vn.oceantech.mita.service;

import vn.oceantech.mita.dto.PrescriptionDto;

import java.util.List;

public interface PrescriptionService {
    List<PrescriptionDto> getByPatientId(long id);
}
