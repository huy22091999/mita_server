package vn.oceantech.mita.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import vn.oceantech.mita.domain.LabTest;
import vn.oceantech.mita.dto.LabTestAssignDto;
import vn.oceantech.mita.dto.LabTestDto;

import java.util.List;

@Repository
public interface LabTestRepository extends JpaRepository<LabTest, Long> {
    @Query("SELECT new vn.oceantech.mita.dto.LabTestDto(entity) FROM LabTest entity WHERE entity.patient.id LIKE ?1")
    List<LabTestDto> getByPatientId(long id);


}
