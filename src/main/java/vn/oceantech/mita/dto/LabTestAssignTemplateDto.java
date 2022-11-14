package vn.oceantech.mita.dto;

import vn.oceantech.mita.domain.LabTestAssign;
import vn.oceantech.mita.domain.LabTestAssignTemplate;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;


public class LabTestAssignTemplateDto implements Serializable {

    private static final long serialVersionUID = 6318192070978248463L;
    private Long id;
    private String name;
    private Long price;

    public LabTestAssignTemplateDto() {
    }

    public LabTestAssignTemplateDto(Long id, String name, Long price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public LabTestAssignTemplateDto(LabTestAssignTemplate entity) {
        this.id = entity.getId();
        this.name = entity.getName();
        this.price = entity.getPrice();
    }

    public LabTestAssignTemplate toEntity() {
        return new LabTestAssignTemplate(id, name, price);
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
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
