package br.com.todolist.repository;

import br.com.todolist.model.entity.Task;
import org.apache.kafka.common.Uuid;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TaskRepository extends MongoRepository<Task, Uuid> {
}
