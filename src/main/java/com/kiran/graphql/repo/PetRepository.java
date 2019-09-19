
package com.kiran.graphql.repo;
    
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import com.kiran.graphql.entity.Pet;

@Transactional(readOnly = true)
public interface PetRepository extends JpaRepository<Pet, Long> {
	
}