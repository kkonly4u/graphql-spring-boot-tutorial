package com.kiran.graphql.resolvers;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.kiran.graphql.entity.Owner;
import com.kiran.graphql.entity.Pet;
import com.kiran.graphql.repo.OwnerRepository;

import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class PetResolver implements GraphQLResolver<Pet>{
	
	@Autowired
	private OwnerRepository ownerRepo;
	
	public Owner getOwner(Pet pet) {
		Optional<Owner> optional = ownerRepo.findById(pet.getOwnerid());
		Owner o = null;
		if(optional.isPresent()) {
			o = optional.get();
		}
		return o;
		
	}
}
