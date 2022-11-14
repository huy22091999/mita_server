package vn.oceantech.mita.domain;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@XmlRootElement
@Table(
        name = "tbl_document"
)
@Entity
public class Document implements Serializable {
    @Transient
    private static final long serialVersionUID = 6318192070978248463L;
    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    private Long id;
    @Column(
            name = "name",
            length = 150,
            nullable = false
    )
    private String name;
    @Column(name = "date_x_ray")
    private Date dateXRay;

    @ManyToOne
    @JoinColumn(name = "patient_id")
    private Patient patient;

    @OneToMany(mappedBy = "document",cascade = CascadeType.ALL)
    private Set<Image> images;

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Set<Image> getImages() {
        return images;
    }

    public void setImages(Set<Image> images) {
        this.images = images;
    }

    public Document() {
    }

    public Document(Long id, String name, Date dateXRay,Set<Image> images) {
        this.id = id;
        this.name = name;
        this.dateXRay = dateXRay;
        this.images=images;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Date getDateXRay() {
        return dateXRay;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDateXRay(Date dateXRay) {
        this.dateXRay = dateXRay;
    }
}
