package vn.oceantech.mita.dto;

import org.springframework.util.ObjectUtils;
import vn.oceantech.mita.domain.LabTestItem;
import vn.oceantech.mita.domain.LabTestItemDetail;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class LabTestItemDto implements Serializable {

    private static final long serialVersionUID = 6318192070978248463L;

    private Long id;

    private String name;


    private Date dateResult;


    private String doctorResult;


    private LabTestDto labTest;


    private List<LabTestItemDetailDto> labTestItemDetails;

    public LabTestItemDto() {
    }

    public LabTestItemDto(LabTestItem entity) {
        this.id = entity.getId();
        this.name = entity.getName();
        this.dateResult = entity.getDateResult();
        this.doctorResult = entity.getDoctorResult();
        if (!ObjectUtils.isEmpty(entity.getDateResult())){
            this.labTestItemDetails = new ArrayList<>();
            for (LabTestItemDetail item:entity.getLabTestItemDetails()) {
                this.labTestItemDetails.add(new LabTestItemDetailDto(item));
            }
        }


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

    public LabTestDto getLabTest() {
        return labTest;
    }

    public void setLabTest(LabTestDto labTest) {
        this.labTest = labTest;
    }

    public List<LabTestItemDetailDto> getLabTestItemDetails() {
        return labTestItemDetails;
    }

    public void setLabTestItemDetails(List<LabTestItemDetailDto> labTestItemDetails) {
        this.labTestItemDetails = labTestItemDetails;
    }
}
