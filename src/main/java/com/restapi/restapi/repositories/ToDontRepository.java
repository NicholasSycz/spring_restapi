package com.restapi.restapi.repositories;

import com.restapi.restapi.models.ToDont;
import org.springframework.data.repository.CrudRepository;

public interface ToDontRepository extends CrudRepository 
	<ToDont, String> {
		
		@Override
		ToDont findOne(String id);
		
		@Override
		void delete(ToDont deleted);
	}
