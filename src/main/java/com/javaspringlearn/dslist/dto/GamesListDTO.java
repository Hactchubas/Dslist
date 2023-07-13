package com.javaspringlearn.dslist.dto;

import java.util.Objects;

import com.javaspringlearn.dslist.entities.GameList;

public class GamesListDTO {
	
	private Long id;
	private String name;
	
	public GamesListDTO(){
	}

	public GamesListDTO(GameList entity) {
		this.id = entity.getId();
		this.name = entity.getName();
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		GamesListDTO other = (GamesListDTO) obj;
		return Objects.equals(id, other.id);
	}

	
}
