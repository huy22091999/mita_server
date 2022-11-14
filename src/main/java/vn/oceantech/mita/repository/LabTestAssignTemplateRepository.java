package vn.oceantech.mita.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import vn.oceantech.mita.domain.LabTestAssign;
import vn.oceantech.mita.dto.LabTestAssignDto;
import vn.oceantech.mita.dto.LabTestAssignTemplateDto;
import vn.oceantech.mita.service.LabTestAssignService;

import java.util.List;

@Repository
public interface LabTestAssignTemplateRepository extends JpaRepository<LabTestAssign, Long> {

    @Query("SELECT new vn.oceantech.mita.dto.LabTestAssignTemplateDto(entity) FROM LabTestAssignTemplate entity ")
    List<LabTestAssignTemplateDto> getAll();


}
