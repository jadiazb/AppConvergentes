package co.sg_sst.jpa.model;

import org.springframework.data.annotation.Id;

public class ReportConditionsEntity {

	@Id
	public String id;
	private String condition;
	private String description;
	private String controlProposal;
	private String photo;
	
	public ReportConditionsEntity() {
		super();
	}

	public ReportConditionsEntity(String id, String condition, String description, String controlProposal,
			String photo) {
		super();
		this.id = id;
		this.condition = condition;
		this.description = description;
		this.controlProposal = controlProposal;
		this.photo = photo;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCondition() {
		return condition;
	}

	public void setCondition(String condition) {
		this.condition = condition;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getControlProposal() {
		return controlProposal;
	}

	public void setControlProposal(String controlProposal) {
		this.controlProposal = controlProposal;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}
	
	

}
