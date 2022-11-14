package vn.oceantech.mita.domain;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@XmlRootElement
@Table(
        name = "tbl_lab_test_x_ray_item"
)
@Entity
public class LabTestXRayItem implements Serializable {
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

    @Column(name = "date_result")
    private Date dateResult;

    @Column(name = "doctor_result")
    private String doctorResult;

    @ManyToOne
    @JoinColumn(name = "lab_test_x_ray_id")
    private LabTestXRay labTestXRay;

    @OneToMany(mappedBy = "labTestXRayItem")
    private Set<LabTestXRayItemDetail> labTestXRayItemDetails;

    public LabTestXRayItem() {
    }

    public LabTestXRayItem(Long id, String name, Date dateResult, String doctorResult, LabTestXRay labTestXRay, Set<LabTestXRayItemDetail> labTestXRayItemDetails) {
        this.id = id;
        this.name = name;
        this.dateResult = dateResult;
        this.doctorResult = doctorResult;
        this.labTestXRay = labTestXRay;
        this.labTestXRayItemDetails = labTestXRayItemDetails;
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

    public LabTestXRay getLabTestXRay() {
        return labTestXRay;
    }

    public void setLabTestXRay(LabTestXRay labTestXRay) {
        this.labTestXRay = labTestXRay;
    }

    public Set<LabTestXRayItemDetail> getLabTestXRayItemDetails() {
        return labTestXRayItemDetails;
    }

    public void setLabTestXRayItemDetails(Set<LabTestXRayItemDetail> labTestXRayItemDetails) {
        this.labTestXRayItemDetails = labTestXRayItemDetails;
    }
}
