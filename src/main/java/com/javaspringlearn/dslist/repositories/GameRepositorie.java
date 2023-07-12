package com.javaspringlearn.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javaspringlearn.dslist.entities.Game;

public interface GameRepositorie extends JpaRepository<Game, Long> {
	
}
