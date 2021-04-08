package eci.ieti.data;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

import eci.ieti.data.model.Todo;

public interface TodoRepository extends CrudRepository<Todo, Long>{

	Page<Todo> findByDescriptionContaining(String description, Pageable pageable);
	Page<Todo> findByPriorityContaining(Integer priority, Pageable pageable);
	Page<Todo> findByDueDateContaining(String dueDate, Pageable pageable);
	Page<Todo> findByResponsibleContaining(String responsible, Pageable pageable);
	Page<Todo> findByStatusContaining(String status, Pageable pageable);
	
}
