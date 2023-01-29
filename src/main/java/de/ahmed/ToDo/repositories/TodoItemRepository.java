package de.ahmed.ToDo.repositories;

import de.ahmed.ToDo.models.TodoItem;
import org.springframework.data.repository.CrudRepository;

public interface TodoItemRepository extends CrudRepository<TodoItem, Long> {
}
