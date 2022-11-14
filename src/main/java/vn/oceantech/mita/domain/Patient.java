package vn.oceantech.mita.domain;


import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Entity
@Table(
        name = "tbl_patient"
)
@XmlRootElement
public class Patient implements Serializable {
    private static final long serialVersionUID = 4572941405687566992L;
    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    private Long id;

    @Column(name = "displayName")
    private String displayName;

    @Column(name = "code", unique = true)
    private String code;

    @Column(name = "status")//1 đang điều trị, 0 kết thúc điều trị
    private Integer status;

    @Column(name = "type")
    private Integer type;

    @Column(name = "address")
    private String address;

    @Column(name = "dob")
    private Date dob;
    @Column(
            name = "gender",
            nullable = true
    )
    private String gender;
    @Column(
            name = "diagnostic",
            nullable = true
    )
    private String diagnostic;
    private Integer objectType; //0 bhyt, 1 viện phí
    @OneToMany(mappedBy = "patient", cascade = CascadeType.ALL)
    private Set<Document> documents;

    public Patient() {
    }

    public Patient(Long id, String displayName, String code, Integer status, Integer type, String address, Date dob, String gender, String diagnostic, Integer objectType, Set<Document> documents) {
        this.id = id;
        this.displayName = displayName;
        this.code = code;
        this.status = status;
        this.type = type;
        this.address = address;
        this.dob = dob;
        this.gender = gender;
        this.diagnostic = diagnostic;
        this.objectType = objectType;
        this.documents = documents;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public Integer getObjectType() {
        return objectType;
    }

    public void setObjectType(Integer objectType) {
        this.objectType = objectType;
    }

    public String getDiagnostic() {
        return diagnostic;
    }

    public void setDiagnostic(String diagnostic) {
        this.diagnostic = diagnostic;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Set<Document> getDocuments() {
        return documents;
    }

    public void setDocuments(Set<Document> documents) {
        this.documents = documents;
    }
}
