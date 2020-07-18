package com.fwtec.joblisting.rest;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.fwtec.joblisting.entity.Categoria;

@RepositoryRestResource(collectionResourceRel = "categorias", path = "categorias")
public interface CategoriaRest extends PagingAndSortingRepository<Categoria, Integer> {

}
