package com.brasajava.googletry;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@SpringBootApplication
public class GoogleTryApplication {

	public static void main(String[] args) {
		SpringApplication.run(GoogleTryApplication.class, args);
	}

}
@RepositoryRestResource(collectionResourceRel = "person", path = "person")
interface PersonRepository extends JpaRepository<Person, Long>{}

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
class Person{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String name;
	private int age;

}