package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
	public class PersonController {
	@Autowired
	private PersonService personService;
	 @GetMapping("/persondetails")
	public List<Person> getPersonDetails(){
		 return this.personService.getPersonList();
	 }
	 @PostMapping("/addperson")
		public Person addPersonDetails(@RequestBody Person person)
		{
			return this.personService.AddPerson(person);
		}
	 @GetMapping("/search/{personId}")
		public Optional<Person> searchPerson(@PathVariable int personId)
		{
			return this.personService.searchPersonWithId(personId);
		}
	 @DeleteMapping("/delete/{personId}")
		public String deletePerson(@PathVariable int personId)
		{
			return this.personService.removePersondetails(personId);
		}	
     
	@PutMapping("/update/{personId}")
		public Person updatePersonDetails(@RequestBody Person person)
		{
			return this.personService.updatePerson(person);
		}	
     
}
