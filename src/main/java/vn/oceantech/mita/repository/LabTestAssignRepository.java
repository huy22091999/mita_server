package vn.oceantech.mita.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import vn.oceantech.mita.domain.LabTest;
import vn.oceantech.mita.domain.LabTestAssign;
import vn.oceantech.mita.dto.LabTestAssignDto;
import vn.oceantech.mita.dto.LabTestDto;

import java.util.List;

@Repository
public interface LabTestAssignRepository extends JpaRepository<LabTestAssign, Long> {
    @Query("SELECT new vn.oceantech.mita.dto.LabTestAssignDto(entity) FROM LabTestAssign entity WHERE entity.patient.id = ?1")
    List<LabTestAssignDto> getDtoByPatientId(long id);
    List<LabTestAssign> getByPatientId(long id);

    @Query("SELECT new vn.oceantech.mita.dto.LabTestAssignDto(entity) FROM LabTestAssign entity ")
    List<LabTestAssignDto> getAll();

    @Query("SELECT new vn.oceantech.mita.dto.LabTestAssignDto(entity) FROM LabTestAssign entity WHERE entity.id= ?1 and entity.patient.id =?2")
    LabTestAssign getById(long id, long patientId);

}
