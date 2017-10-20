package iastate;

public class PeerReview {

	private String eligibleFactors;
	@SuppressWarnings("unused")
	private String stakeholders;
	@SuppressWarnings("unused")
	private String modelObjectives;
	
	public PeerReview(ModelPurpose modelPurpose, 
			WeakFiltering weakFiltering,
			ClusterAnalysis clusterAnalysis) {
		
		// If this is the first loop, then get factors from weak filtering
		// otherwise get factors from previous cluster analysis
		if(clusterAnalysis.getRemainingFactors() != null) {
			this.eligibleFactors = clusterAnalysis.getRemainingFactors();
		} else {
			this.eligibleFactors = weakFiltering.getEligibleFactors();

		}
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
