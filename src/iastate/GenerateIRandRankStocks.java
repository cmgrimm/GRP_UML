package iastate;

public class GenerateIRandRankStocks {

	@SuppressWarnings("unused")
	private String remainingFactors;
	
	private String rankedStocks;
	private String informationRatio;
	
	public GenerateIRandRankStocks(FinalPeerReview finalPeerReview) {
		this.remainingFactors = finalPeerReview.getRemainingFactors();
	}
	
	public String getRankedStocks() {
		return rankedStocks;
	}
	public void setRankedStocks(String rankedStocks) {
		this.rankedStocks = rankedStocks;
	}
	public String getInformationRatio() {
		return informationRatio;
	}
	public void setInformationRatio(String informationRatio) {
		this.informationRatio = informationRatio;
	}
	
}
