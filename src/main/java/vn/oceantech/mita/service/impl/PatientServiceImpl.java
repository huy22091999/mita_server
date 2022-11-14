package vn.oceantech.mita.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import vn.oceantech.mita.dto.PatientDto;
import vn.oceantech.mita.dto.search.SearchDto;
import vn.oceantech.mita.repository.PatientRepository;
import vn.oceantech.mita.service.PatientService;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;


@Service
public class PatientServiceImpl implements PatientService {
    @Autowired
    private PatientRepository repository;

    @Autowired
    private EntityManager entityManager;

    @Override
    public Page<PatientDto> search(SearchDto dto) {
        int pageIndex = dto.getPageIndex();
        if (pageIndex > 0) {
            pageIndex--;
        } else {
            pageIndex = 0;
        }

        int pageSize = dto.getSize();

        StringBuilder whereClause = new StringBuilder();
        String orderBy = " ORDER BY entity.id ASC";
        String sqlCount = "select count(entity.id) from Patient as entity where (1=1) ";
        String sql = "select new vn.oceantech.mita.dto.PatientDto(entity) from Patient as entity where (1=1) ";
        if (StringUtils.hasText(dto.getKeyWord())) {
            whereClause.append(" AND entity.displayName LIKE :text ");
        }
        if (dto.getStatus() != 0) {
            whereClause.append(" AND entity.status = :status ");
        }
        sql += whereClause + orderBy;
        sqlCount += whereClause;
        Query q = entityManager.createQuery(sql, PatientDto.class);
        Query qCount = entityManager.createQuery(sqlCount);
        if (StringUtils.hasText(dto.getKeyWord())) {
            q.setParameter("text", '%' + dto.getKeyWord().trim() + '%');
            qCount.setParameter("text", '%' + dto.getKeyWord().trim() + '%');
        }
        if (dto.getStatus() != 0) {
            q.setParameter("status", dto.getStatus());
            qCount.setParameter("status", dto.getStatus());
        }
        int startPosition = pageIndex * pageSize;
        q.setFirstResult(startPosition);
        q.setMaxResults(pageSize);
        List<PatientDto> dtos = q.getResultList();
        long count = (long) qCount.getSingleResult();
        Pageable pageable = PageRequest.of(pageIndex, pageSize);
        return new PageImpl<>(dtos, pageable, count);
    }

}
