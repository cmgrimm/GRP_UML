package iastate;

public class DefiningTheUniverse {
	
	@SuppressWarnings("unused")
	private String modelUniverse;
	@SuppressWarnings("unused")
	private String modelObjectives;
	
	private String regionSectorDefinition;
	private String stocksPerModel;

	public DefiningTheUniverse(ModelPurpose modelPurpose) {
		this.modelUniverse = modelPurpose.getModelUniverse();
		this.modelObjectives = modelPurpose.getModelObjectives();
	}
	
	public String getRegionSectorDefinition() {
		return regionSectorDefinition;
	}

	public void setRegionSectorDefinition(String regionSectorDefinition) {
		this.regionSectorDefinition = regionSectorDefinition;
	}

	public String getStocksPerModel() {
		return stocksPerModel;
	}

	public void setStocksPerModel(String stocksPerModel) {
		this.stocksPerModel = stocksPerModel;
	}

}
