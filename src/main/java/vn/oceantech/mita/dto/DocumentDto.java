package vn.oceantech.mita.dto;


import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.util.ObjectUtils;
import vn.oceantech.mita.domain.Document;
import vn.oceantech.mita.domain.Image;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class DocumentDto implements Serializable {
    private static final long serialVersionUID = 4572941405687566992L;

    private Long id;

    private String name;

    private Date dateXRay;

    private List<String> images;
    private PatientDto patient;

    public DocumentDto() {
    }

    public DocumentDto(Document entity) {
        this.id = entity.getId();
        this.name = entity.getName();
        this.dateXRay = entity.getDateXRay();
        this.patient = new PatientDto();
        if (!ObjectUtils.isEmpty(entity.getImages())) {
            this.images = new ArrayList<>();
            for (Image item : entity.getImages())
                this.images.add(item.getName());
        }
    }

    public List<String> getImages() {
        return images;
    }

    public void setImages(List<String> images) {
        this.images = images;
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

    public Date getDateXRay() {
        return dateXRay;
    }

    public void setDateXRay(Date dateXRay) {
        this.dateXRay = dateXRay;
    }

    public PatientDto getPatient() {
        return patient;
    }

    public void setPatient(PatientDto patient) {
        this.patient = patient;
    }
}
