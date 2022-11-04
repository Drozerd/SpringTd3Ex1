package com.inti.service;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.inti.model.Acteur;

@Repository
@Transactional
public interface ActeurRepository extends  JpaRepository<Acteur, Long>{
	
	Acteur findByNom(String nom);
	
	@Query (value = "select count (*) from acteur", nativeQuery = true)
	int getActorCount();
	
	@Modifying
	@Query(value = "update Acteur set nom=:nom where id=:id", nativeQuery = true)
	void changeName (@Param ("nom") String nom, @Param ("id") long id);

}
