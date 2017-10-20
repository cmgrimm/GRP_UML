package iastate;

public class CrossSectionalRelativeClusterAnalysis {
	
	private String regionSectorDefinition;
	private String stocksPerModel;
	@SuppressWarnings("unused")
	private String modelObjectives;

	public CrossSectionalRelativeClusterAnalysis(ModelPurpose modelPurpose, DefiningTheUniverse universe) {
		this.regionSectorDefinition = universe.getRegionSectorDefinition();
		this.stocksPerModel = universe.getStocksPerModel();
		this.modelObjectives = modelPurpose.getModelObjectives();
	}

	public String getRegionSectorDefinition() {
		return regionSectorDefinition;
	}

	public void setNewRegionSectorDefinition(String newRegionSectorDefinition) {
		this.regionSectorDefinition = newRegionSectorDefinition;
	}
	
	public String getStocksPerModel() {
		return stocksPerModel;
	}
	
	public void setNewStocksPerModel(String newStocksPerModel) {
		this.stocksPerModel = newStocksPerModel;
	}

}
