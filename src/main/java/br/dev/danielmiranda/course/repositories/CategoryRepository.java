package br.dev.danielmiranda.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.dev.danielmiranda.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
