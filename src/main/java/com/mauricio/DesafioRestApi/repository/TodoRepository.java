package com.mauricio.DesafioRestApi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.mauricio.DesafioRestApi.entity.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long>{

}
