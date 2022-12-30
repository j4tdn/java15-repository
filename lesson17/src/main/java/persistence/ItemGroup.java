package persistence;

public class ItemGroup {
	private Integer igId;
	private String igName;

	public ItemGroup() {
		// TODO Auto-generated constructor stub
	}

	public ItemGroup(String igName) {
		this.igName = igName;
	}
	
	public ItemGroup(Integer igId, String igName) {
		super();
		this.igId = igId;
		this.igName = igName;
	}

	public Integer getIgId() {
		return igId;
	}

	public void setIgId(Integer igId) {
		this.igId = igId;
	}

	public String getIgName() {
		return igName;
	}

	public void setIgName(String igName) {
		this.igName = igName;
	}

	@Override
	public String toString() {
		return "ItemGroup [igId=" + igId + ", igName=" + igName + "]";
	}
	
}
