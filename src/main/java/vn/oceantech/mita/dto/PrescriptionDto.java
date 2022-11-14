package vn.oceantech.mita.dto;

import org.springframework.util.ObjectUtils;
import vn.oceantech.mita.domain.Medicine;
import vn.oceantech.mita.domain.Prescription;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class PrescriptionDto implements Serializable {

    private static final long serialVersionUID = 6318192070978248463L;
    private Long id;
    private String doctorSpecified;

    private Date dateSpecified;


    private String heathOrganization;


    private List<MedicineDto> medicines;


    private PatientDto patient;

    public PrescriptionDto() {
    }

    public PrescriptionDto(Prescription entity) {
        this.id = entity.getId();
        this.dateSpecified = entity.getDateSpecified();
        this.doctorSpecified = entity.getDoctorSpecified();
        this.heathOrganization = entity.getHeathOrganization();
        if (entity.getPatient() != null) {
            this.patient = new PatientDto();
        }
        if (!ObjectUtils.isEmpty(entity.getMedicines())) {
            this.medicines = new ArrayList<>();
            for (Medicine item : entity.getMedicines()) {
                this.medicines.add(new MedicineDto(item));
            }
        }
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

    public List<MedicineDto> getMedicines() {
        return medicines;
    }

    public void setMedicines(List<MedicineDto> medicines) {
        this.medicines = medicines;
    }

    public PatientDto getPatient() {
        return patient;
    }

    public void setPatient(PatientDto patient) {
        this.patient = patient;
    }
}
