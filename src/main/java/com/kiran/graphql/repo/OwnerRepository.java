package com.kiran.graphql.repo;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import com.kiran.graphql.entity.Owner;

@Transactional(readOnly = true)
public interface OwnerRepository extends JpaRepository<Owner, Long> {

}
