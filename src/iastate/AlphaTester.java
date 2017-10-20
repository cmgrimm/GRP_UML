package iastate;

public class AlphaTester {

	@SuppressWarnings("unused")
	private String regionSectorDefinitions;
	
	private String factorData;
	
	public AlphaTester(DefiningTheUniverse universe1, 
			CrossSectionalRelativeClusterAnalysis universe2) {
		
		if(universe2.getRegionSectorDefinition() != null) {
			this.regionSectorDefinitions = universe2.getRegionSectorDefinition();
		} else {
			this.regionSectorDefinitions = universe1.getRegionSectorDefinition();
		}
		
	}

	public String getFactorData() {
		return factorData;
	}

	public void setFactorData(String factorData) {
		this.factorData = factorData;
	}
	
}
