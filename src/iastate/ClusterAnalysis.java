package iastate;

public class ClusterAnalysis {

	@SuppressWarnings("unused")
	private String categorizedFactors;
	@SuppressWarnings("unused")
	private String eligibleFactors;
	
	private String remainingFactors;

	public ClusterAnalysis(CategorizeFactors categorizeFactors,
			PeerReview peerReview) {
		this.categorizedFactors = categorizeFactors.getCategorizedFactors();
		this.eligibleFactors = peerReview.getEligibleFactors();
	}
	
	public String getRemainingFactors() {
		return remainingFactors;
	}

	public void setRemainingFactors(String remainingFactors) {
		this.remainingFactors = remainingFactors;
	}
	
}
