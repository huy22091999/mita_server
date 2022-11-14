package vn.oceantech.mita.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import vn.oceantech.mita.domain.Document;
import vn.oceantech.mita.domain.LabTestXRay;
import vn.oceantech.mita.dto.LabTestXRayDto;
import vn.oceantech.mita.dto.PrescriptionDto;

import java.util.List;

@Repository
public interface LabTestXRayRepository extends JpaRepository<LabTestXRay, Long> {
    @Query("SELECT new vn.oceantech.mita.dto.LabTestXRayDto(entity) FROM LabTestXRay entity WHERE entity.patient.id LIKE ?1")
    List<LabTestXRayDto> getByPatientId(long id);
}
