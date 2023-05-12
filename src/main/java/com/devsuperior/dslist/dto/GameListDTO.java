package com.devsuperior.dslist.dto;

import org.springframework.beans.BeanUtils;

import com.devsuperior.dslist.entities.GameList;

public class GameListDTO {
	
	private Long Id;
	private String name;
	
	public GameListDTO() {		
	}
	
	public GameListDTO(GameList entity) {
		BeanUtils.copyProperties(entity, this);
	}

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
