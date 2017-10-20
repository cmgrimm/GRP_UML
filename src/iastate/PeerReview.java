package iastate;

public class PeerReview {

	private String eligibleFactors;
	@SuppressWarnings("unused")
	private String stakeholders;
	@SuppressWarnings("unused")
	private String modelObjectives;
	
	public PeerReview(ModelPurpose modelPurpose, WeakFiltering weakFiltering) {
		this.eligibleFactors = weakFiltering.getEligibleFactors();
		this.stakeholders = modelPurpose.getStakeholders();
		this.modelObjectives = modelPurpose.getModelObjectives();
	}
	
	public void setNewEligibleFactors(String eligibleFactors) {
		this.eligibleFactors = eligibleFactors;
	}
	
	public String getEligibleFactors() {
		return eligibleFactors;
	}
	
}
