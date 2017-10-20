package iastate;

public class ModelPurpose {

	private String stakeholders;
	private String problem;
	
	private String modelUniverse;
	private String modelObjectives;
	
	public ModelPurpose(String stakeholders, String problem) {
		this.setStakeholders(stakeholders);
		this.setProblem(problem);
	}
	
	public void setStakeholders(String stakeholders) {
		this.stakeholders = stakeholders;
	}
	
	public String getStakeholders() {
		return stakeholders;
	}
	
	public void setProblem(String problem) {
		this.problem = problem;
	}
	
	public String getProblem() {
		return problem;
	}

	public String getModelObjectives() {
		return modelObjectives;
	}

	public void setModelObjectives(String modelObjectives) {
		this.modelObjectives = modelObjectives;
	}

	public String getModelUniverse() {
		return modelUniverse;
	}

	public void setModelUniverse(String modelUniverse) {
		this.modelUniverse = modelUniverse;
	}
	
	
	
}
