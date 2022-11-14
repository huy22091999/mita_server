package vn.oceantech.mita.dto;


import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.util.ObjectUtils;
import vn.oceantech.mita.domain.Document;
import vn.oceantech.mita.domain.Patient;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;


public class PatientDto implements Serializable {
    private static final long serialVersionUID = 4572941405687566992L;

    private Long id;

    private String displayName;

    private String code;

    private Integer status;

    private Integer type;

    private Integer objectType;

    private String address;

    private String gender;

    private String diagnostic;

    private Date dob;

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    private Set<DocumentDto> documents;

    public PatientDto() {
    }

    public PatientDto(Patient entity) {
        this.id = entity.getId();
        this.address = entity.getAddress();
        this.code = entity.getCode();
        this.displayName = entity.getDisplayName();
        this.gender = entity.getGender();
        this.status = entity.getStatus();
        this.type = entity.getType();
        this.diagnostic = entity.getDiagnostic();
        this.objectType = entity.getObjectType();
        this.dob = entity.getDob();
        if (!ObjectUtils.isEmpty(entity.getDocuments())) {
            this.documents = new HashSet<>();
            for (Document item : entity.getDocuments()) {
                this.documents.add(new DocumentDto(item));
            }
        }

    }


    public Integer getObjectType() {
        return objectType;
    }

    public void setObjectType(Integer objectType) {
        this.objectType = objectType;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDiagnostic() {
        return diagnostic;
    }

    public void setDiagnostic(String diagnostic) {
        this.diagnostic = diagnostic;
    }

    public Set<DocumentDto> getDocuments() {
        return documents;
    }

    public void setDocuments(Set<DocumentDto> documents) {
        this.documents = documents;
    }
}
