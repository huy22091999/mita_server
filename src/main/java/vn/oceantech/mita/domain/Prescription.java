package vn.oceantech.mita.domain;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@XmlRootElement
@Table(
        name = "tbl_prescription"
)
@Entity
public class Prescription implements Serializable {
    @Transient
    private static final long serialVersionUID = 6318192070978248463L;
    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    private Long id;
    @Column(
            name = "doctor_specified",
            nullable = false
    )
    private String doctorSpecified;
    @Column(
            name = "date_specified",
            nullable = false
    )
    private Date dateSpecified;

    @Column(
            name = "heath_organization",
            nullable = false
    )
    private String heathOrganization;

    @OneToMany(mappedBy = "prescription")
    private Set<Medicine> medicines;

    @ManyToOne
    @JoinColumn(name = "patient_id")
    private Patient patient;

    public Prescription() {
    }

    public Prescription(Long id, String doctorSpecified, Date dateSpecified, String heathOrganization, Set<Medicine> medicines, Patient patient) {
        this.id = id;
        this.doctorSpecified = doctorSpecified;
        this.dateSpecified = dateSpecified;
        this.heathOrganization = heathOrganization;
        this.medicines = medicines;
        this.patient = patient;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDoctorSpecified() {
        return doctorSpecified;
    }

    public void setDoctorSpecified(String doctorSpecified) {
        this.doctorSpecified = doctorSpecified;
    }

    public Date getDateSpecified() {
        return dateSpecified;
    }

    public void setDateSpecified(Date dateSpecified) {
        this.dateSpecified = dateSpecified;
    }

    public String getHeathOrganization() {
        return heathOrganization;
    }

    public void setHeathOrganization(String heathOrganization) {
        this.heathOrganization = heathOrganization;
    }

    public Set<Medicine> getMedicines() {
        return medicines;
    }

    public void setMedicines(Set<Medicine> medicines) {
        this.medicines = medicines;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }
}
