package vn.oceantech.mita.domain;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@XmlRootElement
@Table(
        name = "tbl_lab_test"
)
@Entity
public class LabTest implements Serializable {
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

    @OneToMany(mappedBy = "labTest")
    private Set<LabTestItem> labTestItems;

    @ManyToOne
    @JoinColumn(name = "patient_id")
    private Patient patient;

    public LabTest() {
    }

    public LabTest(Long id, String heathOrganization, Date dateSpecified, String doctorSpecified, Set<LabTestItem> labTestItems) {
        this.id = id;
        this.heathOrganization = heathOrganization;
        this.dateSpecified = dateSpecified;
        this.doctorSpecified = doctorSpecified;
        this.labTestItems = labTestItems;
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

    public Set<LabTestItem> getLabTestItems() {
        return labTestItems;
    }

    public void setLabTestItems(Set<LabTestItem> labTestItems) {
        this.labTestItems = labTestItems;
    }
}
