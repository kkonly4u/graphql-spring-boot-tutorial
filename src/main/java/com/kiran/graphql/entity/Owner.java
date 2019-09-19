package com.kiran.graphql.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="owner")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Owner {
	
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private Long oid;
	private String name;
	private String address;

}
