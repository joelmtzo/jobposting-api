package com.fwtec.joblisting.rest;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.fwtec.joblisting.entity.Vacante;

@RepositoryRestResource(collectionResourceRel = "vacantes", path = "vacantes")
public interface VacanteRest extends PagingAndSortingRepository<Vacante, Integer> {

}
