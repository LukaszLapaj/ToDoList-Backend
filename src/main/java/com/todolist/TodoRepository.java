package com.todolist;

import com.todolist.Todo;
import org.springframework.data.jpa.repository.JpaRepository;


public interface TodoRepository extends JpaRepository<Todo, Long>, TodoRepositoryCustom {
}
