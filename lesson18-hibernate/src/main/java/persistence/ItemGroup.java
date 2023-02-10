package persistence;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.NamedQueries;
import org.hibernate.annotations.NamedQuery;

// Entity: Java class -> mapping table in database
// JPA : Configuration, Mappring
// Hibernate: Manipulation


// note: thông thường thì việc mapping là của JPA
//		 Query, Select thì của Hibernate
@Entity
@Table(name = "LoaiHang")
@NamedQueries(
		@NamedQuery(name = ItemGroup.GET_ITEM_GROUPS, 
					query = ""
							+ "SELECT ig FROM ItemGroup ig\n"
							+ "WHERE ig.id < :maxIgId"))
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class ItemGroup {

	public static final String GET_ITEM_GROUPS = "GET_ITEM_GROUPS";
	
	@Id
	@Column(name = "MaLH")
	private Integer id;

	@Column(name = "TenLH")
	private String name;
	
	@OneToMany(mappedBy = "itemGroup")
	private List<Item> items;
	
	// Hibernate constructor require
	public ItemGroup() {
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
	
	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

	@Override
	public String toString() {
		return "ItemGroup [id=" + id + ", name=" + name + "]";
	}
	
}
