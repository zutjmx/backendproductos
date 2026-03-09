package com.zutjmx.curso.spring.jpabackend.backendproductos.repositories;

import org.springframework.data.repository.CrudRepository;

import com.zutjmx.curso.spring.jpabackend.backendproductos.entities.Producto;

public interface ProductoRepository extends CrudRepository<Producto, Long> {

}
