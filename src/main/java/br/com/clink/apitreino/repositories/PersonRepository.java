package br.com.clink.apitreino.repositories;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.clink.apitreino.model.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {}