package vn.oceantech.mita.dto;

import org.springframework.util.ObjectUtils;
import vn.oceantech.mita.domain.LabTest;
import vn.oceantech.mita.domain.LabTestItem;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LabTestDto implements Serializable {
    private static final long serialVersionUID = 6318192070978248463L;

    private Long id;

    private String heathOrganization;

    private Date dateSpecified;

    private String doctorSpecified;

    private List<LabTestItemDto> labTestItems;

    private PatientDto patient;

    public LabTestDto() {
    }

    public LabTestDto(LabTest entity) {
        this.id = entity.getId();
        this.dateSpecified = entity.getDateSpecified();
        this.doctorSpecified = entity.getDoctorSpecified();
        this.heathOrganization = entity.getHeathOrganization();
        if (!ObjectUtils.isEmpty(entity.getLabTestItems())) {
            this.labTestItems=new ArrayList<>();
            for (LabTestItem item : entity.getLabTestItems()) {
                this.labTestItems.add(new LabTestItemDto(item));
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

    public List<LabTestItemDto> getLabTestItems() {
        return labTestItems;
    }

    public void setLabTestItems(List<LabTestItemDto> labTestItemDtos) {
        this.labTestItems = labTestItemDtos;
    }
}
