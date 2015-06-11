
public class District {

	private Integer id;
	private Integer parentId;

	public District(Integer id, Integer parentId) {
		this.id = id;
		this.parentId = parentId;
	}

	public Integer getId() {
		return id;
	}

	public Integer getParentId() {
		return parentId;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}
}
