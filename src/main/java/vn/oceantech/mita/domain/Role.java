package vn.oceantech.mita.domain;

import org.springframework.security.core.GrantedAuthority;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

@XmlRootElement
@Table(
        name = "tbl_role"
)
@Entity
public class Role implements GrantedAuthority, Serializable {
    @Transient
    private static final long serialVersionUID = 6318192070978248463L;
    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    private Long id;
    @Column(
            name = "role_name",
            length = 150,
            nullable = false
    )
    private String name;
    @Column(
            name = "role_description",
            length = 512,
            nullable = true
    )
    private String description;

    public Role() {
    }

    @Transient
    public String getAuthority() {
        return this.name;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Transient
    public String toString() {
        return String.format("Role: %s, %s", this.name, this.description);
    }
}
