package com.fwtec.joblisting.rest;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.fwtec.joblisting.entity.Candidato;

@RepositoryRestResource(collectionResourceRel = "candidatos", path = "candidatos")
public interface CandidatoRest extends PagingAndSortingRepository<Candidato, Integer> {

}
