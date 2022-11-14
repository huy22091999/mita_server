package vn.oceantech.mita.domain;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

@XmlRootElement
@Table(name = "tbl_lab_test_item_detail_template")
@Entity
public class LabTestItemDetailTemplate implements Serializable {
    @Transient
    private static final long serialVersionUID = 6318192070978248463L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "reference_number_max", nullable = false)
    private Float referenceNumberMax;

    @Column(name = "reference_number_min", nullable = false)
    private Float referenceNumberMin;
    @Column(name = "name", nullable = false)
    private String name;

    public LabTestItemDetailTemplate() {
    }

    public LabTestItemDetailTemplate(Long id, Float referenceNumberMax, Float referenceNumberMin, String name) {
        this.id = id;
        this.referenceNumberMax = referenceNumberMax;
        this.referenceNumberMin = referenceNumberMin;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
