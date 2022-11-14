package vn.oceantech.mita.domain;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@XmlRootElement
@Table(
        name = "tbl_lab_test_item"
)
@Entity
public class LabTestItem implements Serializable {
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
    @JoinColumn(name = "lab_test_id")
    private LabTest labTest;

    @OneToMany(mappedBy = "labTestItem")
    private Set<LabTestItemDetail> labTestItemDetails;

    public LabTestItem() {
    }

    public LabTestItem(Long id, String name, Date dateResult, String doctorResult, LabTest labTest, Set<LabTestItemDetail> labTestItemDetails) {
        this.id = id;
        this.name = name;
        this.dateResult = dateResult;
        this.doctorResult = doctorResult;
        this.labTest = labTest;
        this.labTestItemDetails = labTestItemDetails;
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

    public LabTest getLabTest() {
        return labTest;
    }

    public void setLabTest(LabTest labTest) {
        this.labTest = labTest;
    }

    public Set<LabTestItemDetail> getLabTestItemDetails() {
        return labTestItemDetails;
    }

    public void setLabTestItemDetails(Set<LabTestItemDetail> labTestItemDetails) {
        this.labTestItemDetails = labTestItemDetails;
    }
}
