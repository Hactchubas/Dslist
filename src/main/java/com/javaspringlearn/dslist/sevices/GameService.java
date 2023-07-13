package com.javaspringlearn.dslist.sevices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.javaspringlearn.dslist.dto.GameDTO;
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
	
	@Transactional(readOnly = true)
	public GameDTO findById(Long id) {
		Game result = gameRepository.findById(id).get();
		return  new GameDTO(result);
	}
}
