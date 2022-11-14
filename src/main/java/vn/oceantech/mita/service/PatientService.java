package vn.oceantech.mita.service;

import org.springframework.data.domain.Page;
import vn.oceantech.mita.dto.PatientDto;
import vn.oceantech.mita.dto.search.SearchDto;

public interface PatientService {
    Page<PatientDto> search(SearchDto searchDto);
}
