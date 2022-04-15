package br.dev.danielmiranda.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.dev.danielmiranda.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
