package com.javaspringlearn.dslist.sevices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.javaspringlearn.dslist.dto.GamesListDTO;
import com.javaspringlearn.dslist.entities.GameList;
import com.javaspringlearn.dslist.repositories.GamesListsRepository;


@Service
public class GamesListsService {
	
	@Autowired
	private GamesListsRepository gamesListRepository;
	
	@Transactional(readOnly = true)
	public List<GamesListDTO> findAll(){
		List<GameList> result = gamesListRepository.findAll();
		return result.stream().map(x -> new GamesListDTO(x)).toList();	
	}
	
	@Transactional(readOnly = true)
	public GamesListDTO findById(Long id) {
		GameList result = gamesListRepository.findById(id).get();
		return new GamesListDTO(result);
	}
	
}
