package iastate;

public class WeakFiltering {

	@SuppressWarnings("unused")
	private String modelObjectives;
	@SuppressWarnings("unused")
	private String factorData;
	@SuppressWarnings("unused")
	private String regionSectorDefinitions;
	
	private String eligibleFactors;
	
	public WeakFiltering(ModelPurpose modelPurpose, AlphaTester alphaTester, 
			DefiningTheUniverse universe1, 
			CrossSectionalRelativeClusterAnalysis universe2) {
		
		this.modelObjectives = modelPurpose.getModelObjectives();
		this.factorData = alphaTester.getFactorData();
		
		if(universe2.getRegionSectorDefinition() != null) {
			this.regionSectorDefinitions = universe2.getRegionSectorDefinition();
		} else {
			this.regionSectorDefinitions = universe1.getRegionSectorDefinition();
		}
		
	}

	public String getEligibleFactors() {
		return eligibleFactors;
	}

	public void setEligibleFactors(String eligibleFactors) {
		this.eligibleFactors = eligibleFactors;
	}
	
	
}
