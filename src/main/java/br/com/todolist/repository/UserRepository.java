package br.com.todolist.repository;

import br.com.todolist.model.entity.User;
import org.apache.kafka.common.Uuid;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Uuid> {
}
