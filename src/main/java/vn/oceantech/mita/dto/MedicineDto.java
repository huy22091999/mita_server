package vn.oceantech.mita.dto;

import vn.oceantech.mita.domain.Medicine;

import java.io.Serializable;


public class MedicineDto implements Serializable {

    private static final long serialVersionUID = 6318192070978248463L;

    private Long id;

    private String name;

    private String howUse;


    private String userManual;

    private Integer amount;


    private PrescriptionDto prescription;

    public MedicineDto() {
    }

    public MedicineDto(Medicine entity) {
        this.id = entity.getId();
        this.name = entity.getName();
        this.userManual = entity.getUserManual();
        this.howUse = entity.getHowUse();
        this.amount = entity.getAmount();
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

    public PrescriptionDto getPrescription() {
        return prescription;
    }

    public void setPrescription(PrescriptionDto prescription) {
        this.prescription = prescription;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


}
