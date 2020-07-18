package com.fwtec.joblisting.rest;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.fwtec.joblisting.entity.Usuario;

@RepositoryRestResource(collectionResourceRel = "usuarios", path = "usuarios")
public interface UsuarioRest extends PagingAndSortingRepository<Usuario, Integer> {

}
