package vn.oceantech.mita.dto;

import org.springframework.util.ObjectUtils;
import vn.oceantech.mita.domain.LabTestXRay;
import vn.oceantech.mita.domain.LabTestXRayItem;
import vn.oceantech.mita.domain.Patient;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;


public class LabTestXRayDto implements Serializable {

    private static final long serialVersionUID = 6318192070978248463L;

    private Long id;

    private String heathOrganization;

    private Date dateSpecified;

    private String doctorSpecified;

    private List<LabTestXRayItemDto> labTestXRayItems;


    private PatientDto patient;

    public LabTestXRayDto() {
    }

    public LabTestXRayDto(LabTestXRay entity) {
        this.id=entity.getId();
        this.dateSpecified=entity.getDateSpecified();
        this.doctorSpecified=entity.getDoctorSpecified();
        this.heathOrganization=entity.getHeathOrganization();
        if (!ObjectUtils.isEmpty(entity.getLabTestXRayItem())){
            this.labTestXRayItems=new ArrayList<>();
            for (LabTestXRayItem item: entity.getLabTestXRayItem()){
                this.labTestXRayItems.add(new LabTestXRayItemDto(item));
            }
        }

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getHeathOrganization() {
        return heathOrganization;
    }

    public void setHeathOrganization(String heathOrganization) {
        this.heathOrganization = heathOrganization;
    }

    public Date getDateSpecified() {
        return dateSpecified;
    }

    public void setDateSpecified(Date dateSpecified) {
        this.dateSpecified = dateSpecified;
    }

    public String getDoctorSpecified() {
        return doctorSpecified;
    }

    public void setDoctorSpecified(String doctorSpecified) {
        this.doctorSpecified = doctorSpecified;
    }

    public List<LabTestXRayItemDto> getLabTestXRayItem() {
        return labTestXRayItems;
    }

    public void setLabTestXRayItem(List<LabTestXRayItemDto> labTestXRayItem) {
        this.labTestXRayItems = labTestXRayItem;
    }

    public PatientDto getPatient() {
        return patient;
    }

    public void setPatient(PatientDto patient) {
        this.patient = patient;
    }
}
