package vn.oceantech.mita.domain;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@XmlRootElement
@Table(
        name = "tbl_lab_test_x_ray"
)
@Entity
public class LabTestXRay implements Serializable {
    @Transient
    private static final long serialVersionUID = 6318192070978248463L;
    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    private Long id;
    @Column(
            name = "heath_organization",
            nullable = false
    )
    private String heathOrganization;

    @Column(name = "date_specified")
    private Date dateSpecified;

    @Column(name = "doctor_specified")
    private String doctorSpecified;

    @OneToMany(mappedBy = "labTestXRay")
    private Set<LabTestXRayItem> labTestXRayItem;

    @ManyToOne
    @JoinColumn(name = "patient_id")
    private Patient patient;

    public LabTestXRay() {
    }

    public LabTestXRay(Long id, String heathOrganization, Date dateSpecified, String doctorSpecified, Set<LabTestXRayItem> labTestXRayItem, Patient patient) {
        this.id = id;
        this.heathOrganization = heathOrganization;
        this.dateSpecified = dateSpecified;
        this.doctorSpecified = doctorSpecified;
        this.labTestXRayItem = labTestXRayItem;
        this.patient = patient;
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

    public Set<LabTestXRayItem> getLabTestXRayItem() {
        return labTestXRayItem;
    }

    public void setLabTestXRayItem(Set<LabTestXRayItem> labTestXRayItem) {
        this.labTestXRayItem = labTestXRayItem;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }
}
