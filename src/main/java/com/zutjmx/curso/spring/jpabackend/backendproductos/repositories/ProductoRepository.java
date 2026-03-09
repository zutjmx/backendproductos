package com.zutjmx.curso.spring.jpabackend.backendproductos.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.zutjmx.curso.spring.jpabackend.backendproductos.entities.Producto;

@CrossOrigin(originPatterns = "*")
@RepositoryRestResource(path = "productos")
public interface ProductoRepository extends CrudRepository<Producto, Long> {

}
