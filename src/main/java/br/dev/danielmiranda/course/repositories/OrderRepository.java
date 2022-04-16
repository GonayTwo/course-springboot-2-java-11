package br.dev.danielmiranda.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.dev.danielmiranda.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
