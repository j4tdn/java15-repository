package persistence;

import java.time.LocalTime;

public class ItemDtoV2 {
    private Integer id;
    private String name;
    private LocalTime time;
    
    public ItemDtoV2() {
		// TODO Auto-generated constructor stub
	}

	public ItemDtoV2(Integer id, String name, LocalTime time) {
		super();
		this.id = id;
		this.name = name;
		this.time = time;
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

	public LocalTime getTime() {
		return time;
	}

	public void setTime(LocalTime time) {
		this.time = time;
	}

	@Override
	public String toString() {
		return "ItemDtoV2 [id=" + id + ", name=" + name + ", time=" + time + "]";
	}
    
}
