package com.kiran.graphql.resolvers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.kiran.graphql.entity.Pet;
import com.kiran.graphql.repo.PetRepository;

import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class QueryResolver implements GraphQLQueryResolver {

	@Autowired
	private final PetRepository petRepository;

	
	public List<Pet> pets() {
		return (List<Pet>) petRepository.findAll();
	}
}