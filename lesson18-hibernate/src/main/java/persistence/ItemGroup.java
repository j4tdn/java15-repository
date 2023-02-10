package persistence;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "LoaiHang")
@NamedQueries({
		@NamedQuery(name = ItemGroup.GET_ITEM_GROUPS,
					query = "select ig from ItemGroup ig where ig.id < :maxIgId")
})

public class ItemGroup {
	public static final String GET_ITEM_GROUPS = "GET_ITEM_GROUPS";
	@Id
	@Column(name = "MaLH")
	private Integer id;
	
	@Column(name = "TenLH")
	private String name;
	
	@OneToMany(mappedBy = "itemGroup")
	List<Item> items;
	/**
	 * Hibernate constructor required
	 */
	public ItemGroup() {
		// TODO Auto-generated constructor stub
	}

	public ItemGroup(Integer id, String name) {
		this.id = id;
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "ItemGroup [id=" + id + ", name=" + name + "]";
	}
	
	
	
}
