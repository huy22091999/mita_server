package vn.oceantech.mita.domain;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

@XmlRootElement
@Table(name = "tbl_lab_test_assign")
@Entity
public class LabTestAssign implements Serializable {
    @Transient
    private static final long serialVersionUID = 6318192070978248463L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "patient_id")
    private Patient patient;

    @OneToOne
    @JoinColumn(name = "lab_test_assign_template")
    private LabTestAssignTemplate labTestAssignTemplate;

    public LabTestAssign() {
    }

    public LabTestAssign(Long id, Patient patient, LabTestAssignTemplate labTestAssignTemplate) {
        this.id = id;
        this.patient = patient;
        this.labTestAssignTemplate = labTestAssignTemplate;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public LabTestAssignTemplate getLabTestAssignTemplate() {
        return labTestAssignTemplate;
    }

    public void setLabTestAssignTemplate(LabTestAssignTemplate labTestAssignTemplate) {
        this.labTestAssignTemplate = labTestAssignTemplate;
    }
}
