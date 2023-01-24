package com.capgemini.start.api.resource.impl;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;

import com.capgemini.start.api.dto.input.GeneroInputDTO;
import com.capgemini.start.api.dto.output.GeneroDTO;
import com.capgemini.start.api.resource.GeneroResource;

public class GeneroResourceImpl implements GeneroResource{

	@Override
	public ResponseEntity<GeneroDTO> findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<GeneroDTO> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<GeneroDTO> insert(@Valid GeneroInputDTO genero) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<GeneroDTO> findById(Long id, @Valid GeneroInputDTO genero) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<Void> delete(Long id) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
