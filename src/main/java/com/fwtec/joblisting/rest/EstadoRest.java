package com.fwtec.joblisting.rest;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.fwtec.joblisting.entity.Estado;

@RepositoryRestResource(collectionResourceRel = "estados", path = "estados")
public interface EstadoRest extends PagingAndSortingRepository<Estado, Integer> {

}
