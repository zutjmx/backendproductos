package com.zutjmx.curso.spring.jpabackend.backendproductos.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.zutjmx.curso.spring.jpabackend.backendproductos.entities.Producto;

@RepositoryRestResource(path = "productos")
public interface ProductoRepository extends CrudRepository<Producto, Long> {

}
