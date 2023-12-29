package com.mauricio.DesafioRestApi.service;

import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;


import com.mauricio.DesafioRestApi.entity.Todo;
import com.mauricio.DesafioRestApi.repository.TodoRepository;

import java.util.List;
@Service
public class TodoService {
	
	private TodoRepository todoRespository;
	
	public TodoService(TodoRepository todoRespository) {
		this.todoRespository = todoRespository;
	}
	
	public List<Todo> create(Todo todo){
		todoRespository.save(todo);
		return list();
		
	}
	public List<Todo> list(){
		
		Sort sort = Sort.by("prioridade").descending().and(
				Sort.by("nome").ascending()
				);
		
		
		return todoRespository.findAll(sort);
		
	}
	public List<Todo> update(Todo todo){
		todoRespository.save(todo);
		return list();
		
	}
	
	
	public List<Todo> delete( Long id){
		todoRespository.deleteById(id);
		return list();
		
	}
	
	

}
