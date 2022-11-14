package vn.oceantech.mita.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vn.oceantech.mita.domain.Document;
import vn.oceantech.mita.domain.Patient;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Long> {

}
