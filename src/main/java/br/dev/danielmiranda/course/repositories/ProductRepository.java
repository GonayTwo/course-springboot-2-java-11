package br.dev.danielmiranda.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.dev.danielmiranda.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
