package com.generation.lojaDeGames.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Categoria extends JpaRepository<Categoria, Long>{

}
