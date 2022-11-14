package vn.oceantech.mita.dto;

import vn.oceantech.mita.domain.LabTestItemDetail;

import java.io.Serializable;

public class LabTestItemDetailDto implements Serializable {

    private static final long serialVersionUID = 6318192070978248463L;

    private Long id;

    private Float resultNumber;

    private LabTestItemDto labTestItem;

    private LabTestItemDetailTemplateDto labTestItemDetailTemplate;

    public LabTestItemDetailDto() {
    }

    public LabTestItemDetailDto(LabTestItemDetail entity) {
        this.id = entity.getId();
        this.resultNumber = entity.getResultNumber();
        if (entity.getLabTestItemDetailTemplate() != null) {
            this.labTestItemDetailTemplate = new LabTestItemDetailTemplateDto(entity.getLabTestItemDetailTemplate());
        }
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Float getResulNumber() {
        return resultNumber;
    }

    public void setResultNumber(Float result_number) {
        this.resultNumber = resultNumber;
    }

    public LabTestItemDto getLabTestItem() {
        return labTestItem;
    }

    public void setLabTestItem(LabTestItemDto labTestItemDto) {
        this.labTestItem = labTestItemDto;
    }

    public LabTestItemDetailTemplateDto getLabTestItemDetailTemplate() {
        return labTestItemDetailTemplate;
    }

    public void setLabTestItemDetailTemplate(LabTestItemDetailTemplateDto labTestItemDetailTemplateDto) {
        this.labTestItemDetailTemplate = labTestItemDetailTemplateDto;
    }
}
