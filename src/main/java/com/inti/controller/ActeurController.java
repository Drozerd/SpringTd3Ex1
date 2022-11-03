package com.inti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.inti.service.ActeurRepository;

@RestController
@RequestMapping ("/acteur")
public class ActeurController {

	@Autowired
	ActeurRepository ary;
}
