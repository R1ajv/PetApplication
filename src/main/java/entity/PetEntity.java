package entity;

@Entity
public class PetEntity {
	
	private int id;
	private String name ;
	private String description;
	private boolean required;
	private String color;
	
	public PetEntity(int id, String name, String description, boolean required, String color) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.required = required;
		this.color = color;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "PetEntity [id=" + id + ", name=" + name + ", description=" + description + ", required=" + required
				+ ", color=" + color + "]";
	}
	
}
