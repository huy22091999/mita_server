package vn.oceantech.mita.domain;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

@XmlRootElement
@Table(
        name = "tbl_medicine"
)
@Entity
public class Medicine implements Serializable {
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
    @Column(
            name = "how_use",
            nullable = false
    )
    private String howUse;

    @Column(
            name = "user_manual",
            nullable = false
    )
    private String userManual;
    @Column(
            name = "amount",
            nullable = false
    )
    private Integer amount;

    @ManyToOne
    @JoinColumn(name = "prescription_id")
    private Prescription prescription;

    public Medicine() {
    }

    public Medicine(Long id, String name, String howUse, String userManual, Integer amount, Prescription prescription) {
        this.id = id;
        this.name = name;
        this.howUse = howUse;
        this.userManual = userManual;
        this.amount = amount;
        this.prescription = prescription;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHowUse() {
        return howUse;
    }

    public void setHowUse(String howUse) {
        this.howUse = howUse;
    }

    public String getUserManual() {
        return userManual;
    }

    public void setUserManual(String userManual) {
        this.userManual = userManual;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Prescription getPrescription() {
        return prescription;
    }

    public void setPrescription(Prescription prescription) {
        this.prescription = prescription;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


}
