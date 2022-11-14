package vn.oceantech.mita.dto;

import org.springframework.util.ObjectUtils;
import vn.oceantech.mita.domain.LabTestXRayItem;
import vn.oceantech.mita.domain.LabTestXRayItemDetail;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;


public class LabTestXRayItemDto implements Serializable {

    private static final long serialVersionUID = 6318192070978248463L;

    private Long id;

    private String name;


    private Date dateResult;


    private String doctorResult;


    private LabTestXRayDto labTestXRay;

    private List<LabTestXRayItemDetailDto> labTestXRayItemDetailDtos;

    public LabTestXRayItemDto() {
    }

    public LabTestXRayItemDto(LabTestXRayItem entity) {
        this.id=entity.getId();
        this.name=entity.getName();
        this.dateResult=entity.getDateResult();
        this.doctorResult=entity.getDoctorResult();
        if (!ObjectUtils.isEmpty(entity.getLabTestXRayItemDetails())){
            this.labTestXRayItemDetailDtos=new ArrayList<>();
            for (LabTestXRayItemDetail item:entity.getLabTestXRayItemDetails()) {
                this.labTestXRayItemDetailDtos.add(new LabTestXRayItemDetailDto(item));
            }
        }
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDateResult() {
        return dateResult;
    }

    public void setDateResult(Date dateResult) {
        this.dateResult = dateResult;
    }

    public String getDoctorResult() {
        return doctorResult;
    }

    public void setDoctorResult(String doctorResult) {
        this.doctorResult = doctorResult;
    }

    public LabTestXRayDto getLabTestXRay() {
        return labTestXRay;
    }

    public void setLabTestXRay(LabTestXRayDto labTestXRay) {
        this.labTestXRay = labTestXRay;
    }

    public List<LabTestXRayItemDetailDto> getLabTestXRayItemDetails() {
        return labTestXRayItemDetailDtos;
    }

    public void setLabTestXRayItemDetails(List<LabTestXRayItemDetailDto> labTestXRayItemDetailDtos) {
        this.labTestXRayItemDetailDtos = labTestXRayItemDetailDtos;
    }
}
