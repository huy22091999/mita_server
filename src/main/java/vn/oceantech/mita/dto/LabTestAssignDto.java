package vn.oceantech.mita.dto;

import vn.oceantech.mita.domain.LabTestAssign;
import vn.oceantech.mita.domain.Patient;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;


public class LabTestAssignDto implements Serializable {

    private static final long serialVersionUID = 6318192070978248463L;
    private Long id;

    private PatientDto patient;

    private LabTestAssignTemplateDto labTestAssignTemplate;

    public LabTestAssignDto() {
    }

    public LabTestAssignDto(Long id, PatientDto patient, LabTestAssignTemplateDto labTestAssignTemplate) {
        this.id = id;
        this.patient = patient;
        this.labTestAssignTemplate = labTestAssignTemplate;
    }

    public LabTestAssignDto(LabTestAssign entity) {
        this.id = entity.getId();
        if (entity.getPatient() != null) {
            this.patient = new PatientDto(entity.getPatient());
        }
        if (entity.getLabTestAssignTemplate() != null) {
            this.labTestAssignTemplate = new LabTestAssignTemplateDto(entity.getLabTestAssignTemplate());
        }
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public PatientDto getPatient() {
        return patient;
    }

    public void setPatient(PatientDto patient) {
        this.patient = patient;
    }

    public LabTestAssignTemplateDto getLabTestAssignTemplate() {
        return labTestAssignTemplate;
    }

    public void setLabTestAssignTemplate(LabTestAssignTemplateDto labTestAssignTemplate) {
        this.labTestAssignTemplate = labTestAssignTemplate;
    }
}
