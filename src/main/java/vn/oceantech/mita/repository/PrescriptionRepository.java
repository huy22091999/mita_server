package vn.oceantech.mita.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import vn.oceantech.mita.domain.Prescription;
import vn.oceantech.mita.dto.PrescriptionDto;

import java.util.List;

@Repository
public interface PrescriptionRepository extends JpaRepository<Prescription, Long> {
    @Query("SELECT new vn.oceantech.mita.dto.PrescriptionDto(entity) FROM Prescription entity WHERE entity.patient.id LIKE ?1")
    List<PrescriptionDto> getByPatientId(long id);

}
