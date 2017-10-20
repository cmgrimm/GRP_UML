package iastate;

public class FinalPeerReview {

	@SuppressWarnings("unused")
	private String remainingFactors;
	@SuppressWarnings("unused")
	private String stakeholders;
	@SuppressWarnings("unused")
	private String modelObjectives;
	
	public FinalPeerReview(ClusterAnalysis clusterAnalysis,
			ModelPurpose modelPurpose) {
		this.remainingFactors = clusterAnalysis.getRemainingFactors();
		this.stakeholders = modelPurpose.getStakeholders();
		this.modelObjectives = modelPurpose.getModelObjectives();
	}
	
	public String getRemainingFactors() {
		return remainingFactors;
	}
	
}
