package com.inti.service;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inti.model.Acteur;

@Repository
@Transactional
public interface ActeurRepository extends  JpaRepository<Acteur, Long>{

}
