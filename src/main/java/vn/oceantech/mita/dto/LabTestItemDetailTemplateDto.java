package vn.oceantech.mita.dto;

import vn.oceantech.mita.domain.LabTestItemDetailTemplate;

import java.io.Serializable;


public class LabTestItemDetailTemplateDto implements Serializable {

    private static final long serialVersionUID = 6318192070978248463L;

    private Long id;

    private Float referenceNumberMax;
    private Float referenceNumberMin;

    private String name;

    public LabTestItemDetailTemplateDto() {
    }

    public LabTestItemDetailTemplateDto(LabTestItemDetailTemplate entity) {
        this.id = entity.getId();
        this.name = entity.getName();
        this.referenceNumberMax=entity.getReferenceNumberMax();
        this.referenceNumberMin=entity.getReferenceNumberMin();
    }

    public Float getReferenceNumberMax() {
        return referenceNumberMax;
    }

    public void setReferenceNumberMax(Float referenceNumberMax) {
        this.referenceNumberMax = referenceNumberMax;
    }

    public Float getReferenceNumberMin() {
        return referenceNumberMin;
    }

    public void setReferenceNumberMin(Float referenceNumberMin) {
        this.referenceNumberMin = referenceNumberMin;
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
}
