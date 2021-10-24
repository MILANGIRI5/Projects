package org.milan.sbrest.dao;

import org.milan.sbrest.model.StudentVO;
import org.springframework.data.repository.CrudRepository;

public interface StudentDAO extends CrudRepository<StudentVO, Integer> {

	// in this method CrudRepository is the predefined class, and in the first tab
	// we need to provide the Entity class, here our entity class is StudentVO
	// Second tab we need to provide the Primary key type, here id is the primary
	// key and it's type is Integer
}
