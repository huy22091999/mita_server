package vn.oceantech.mita.repository;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import vn.oceantech.mita.domain.Document;
import vn.oceantech.mita.domain.Role;

@Repository
public interface DocumentRepository extends JpaRepository<Document, Long> {

}
