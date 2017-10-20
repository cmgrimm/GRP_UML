package iastate;

public class CategorizeFactors {

	@SuppressWarnings("unused")
	private String eligibleFactors;
	
	private String categorizedFactors;

	public CategorizeFactors(PeerReview peerReview) {
		this.eligibleFactors = peerReview.getEligibleFactors();
	}
	
	public String getCategorizedFactors() {
		return categorizedFactors;
	}

	public void setCategorizedFactors(String categorizedFactors) {
		this.categorizedFactors = categorizedFactors;
	}
	
}
