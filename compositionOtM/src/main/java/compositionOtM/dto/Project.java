package compositionOtM.dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Project {
	@Id
	private int projectId;
	private String projectName;
	private String projManager;
	private String domain;
	@OneToMany
	List<Employee> listOfEmployee;

	public int getProjectId() {
		return projectId;
	}

	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getProjManager() {
		return projManager;
	}

	public void setProjManager(String projManager) {
		this.projManager = projManager;
	}

	public String getDomain() {
		return domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

	public List<Employee> getListOfEmployee() {
		return listOfEmployee;
	}

	public void setListOfEmployee(List<Employee> listOfEmployee) {
		this.listOfEmployee = listOfEmployee;
	}
	
	

}
