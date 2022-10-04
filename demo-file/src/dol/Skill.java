package dol;

import java.util.UUID;

public class Skill {
	private UUID id;
	private String name;
	public Skill() {
		super();
		id = UUID.randomUUID();
	}
	public Skill(String name) {
		super();
		id = UUID.randomUUID();
		this.name = name;
	}
	
	public UUID getId() {
		return id;
	}
	public void setId(UUID id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
