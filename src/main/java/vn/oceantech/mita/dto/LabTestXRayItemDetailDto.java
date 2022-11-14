package vn.oceantech.mita.dto;

import vn.oceantech.mita.domain.LabTestXRayItemDetail;

import java.io.Serializable;


public class LabTestXRayItemDetailDto implements Serializable {

    private static final long serialVersionUID = 6318192070978248463L;

    private Long id;

    private String name;


    private String conclusion;


    private LabTestXRayItemDto labTestXRayItem;

    public LabTestXRayItemDetailDto() {
    }

    public LabTestXRayItemDetailDto(LabTestXRayItemDetail entity) {
        this.id = entity.getId();
        this.name = entity.getName();
        this.conclusion = entity.getConclusion();
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

    public String getConclusion() {
        return conclusion;
    }

    public void setConclusion(String conclusion) {
        this.conclusion = conclusion;
    }

    public LabTestXRayItemDto getLabTestXRayItem() {
        return labTestXRayItem;
    }

    public void setLabTestXRayItem(LabTestXRayItemDto labTestXRayItem) {
        this.labTestXRayItem = labTestXRayItem;
    }
}
