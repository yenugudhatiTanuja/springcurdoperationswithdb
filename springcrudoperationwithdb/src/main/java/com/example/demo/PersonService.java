package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {
	@Autowired
	private PersonRepository personRepository;

	public List<Person> getPersonList() {
		return personRepository.findAll();
	}

	public Person AddPerson(Person p) {
		return personRepository.save(p);
	}
	public Optional<Person> searchPersonWithId(int personId)
	{
		return personRepository.findById(personId);
	}
	public String removePersondetails(int personId)
	{
		personRepository.deleteById(personId);
		return "Deleted Successfully";
	}
		
	//Update
	public Person updatePerson(Person person)
	{
		return personRepository.save(person);
	}

}