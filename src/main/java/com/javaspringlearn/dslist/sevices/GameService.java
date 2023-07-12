package com.javaspringlearn.dslist.sevices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaspringlearn.dslist.dto.GameMinDTO;
import com.javaspringlearn.dslist.entities.Game;
import com.javaspringlearn.dslist.repositories.GameRepositorie;

@Service
public class GameService {
	
	@Autowired
	private GameRepositorie gameRepository;
	
	public List<GameMinDTO> findAll(){
		List<Game> result = gameRepository.findAll();
		return result.stream().map(x -> new GameMinDTO(x)).toList();	
	}
}
