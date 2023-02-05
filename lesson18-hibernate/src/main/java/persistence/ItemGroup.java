package persistence;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/*
 Entity: Java class --> mapping 'table' in database
 JPA/Hibernate
	+ JPA: Configuration, Mapping
    + Hibernate: manipulation
*/
@Entity
@Table(name = "LoaiHang")
public class ItemGroup {

	@Id
	@Column(name = "MaLH")
	private Integer id;

	@Column(name = "TenLH")
	private String name;

	// Item#itemGroup
	@OneToMany(mappedBy = "itemGroup")
	List<Item> items;

	/**
	 * Hibernate constructor require
	 */
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