package vn.oceantech.mita.domain;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

@XmlRootElement
@Table(
        name = "tbl_lab_test_item_detail"
)
@Entity
public class LabTestItemDetail implements Serializable {
    @Transient
    private static final long serialVersionUID = 6318192070978248463L;
    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    private Long id;
    @Column(
            name = "result_number",
            nullable = false
    )
    private Float resultNumber;

    @ManyToOne
    @JoinColumn(name = "lab_test_item_id")
    private LabTestItem labTestItem;

    @OneToOne
    @JoinColumn(name = "lab_test_item_template_id")
    private LabTestItemDetailTemplate labTestItemDetailTemplate;

    public LabTestItemDetail() {
    }

    public LabTestItemDetail(Long id, Float resultNumber, LabTestItem labTestItem, LabTestItemDetailTemplate labTestItemDetailTemplate) {
        this.id = id;
        this.resultNumber = resultNumber;
        this.labTestItem = labTestItem;
        this.labTestItemDetailTemplate = labTestItemDetailTemplate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Float getResultNumber() {
        return resultNumber;
    }

    public void setResultNumber(Float resultNumber) {
        this.resultNumber = resultNumber;
    }

    public LabTestItem getLabTestItem() {
        return labTestItem;
    }

    public void setLabTestItem(LabTestItem labTestItem) {
        this.labTestItem = labTestItem;
    }

    public LabTestItemDetailTemplate getLabTestItemDetailTemplate() {
        return labTestItemDetailTemplate;
    }

    public void setLabTestItemDetailTemplate(LabTestItemDetailTemplate labTestItemDetailTemplate) {
        this.labTestItemDetailTemplate = labTestItemDetailTemplate;
    }
}
