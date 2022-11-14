package vn.oceantech.mita.domain;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

@XmlRootElement
@Table(
        name = "tbl_lab_test_x_ray_item_detail"
)
@Entity
public class LabTestXRayItemDetail implements Serializable {
    @Transient
    private static final long serialVersionUID = 6318192070978248463L;
    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    private Long id;
    @Column(
            name = "name",
            nullable = false
    )
    private String name;

    @Column(name = "conclusion")
    private String conclusion;

    @ManyToOne
    @JoinColumn(name = "lab_test_x_ray_item_id")
    private LabTestXRayItem labTestXRayItem;

    public LabTestXRayItemDetail() {
    }

    public LabTestXRayItemDetail(Long id, String name, String conclusion, LabTestXRayItem labTestXRayItem) {
        this.id = id;
        this.name = name;
        this.conclusion = conclusion;
        this.labTestXRayItem = labTestXRayItem;
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

    public LabTestXRayItem getLabTestXRayItem() {
        return labTestXRayItem;
    }

    public void setLabTestXRayItem(LabTestXRayItem labTestXRayItem) {
        this.labTestXRayItem = labTestXRayItem;
    }
}
