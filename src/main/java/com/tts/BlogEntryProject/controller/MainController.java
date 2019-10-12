package com.tts.BlogEntryProject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tts.BlogEntryProject.model.BlogEntry;
import com.tts.BlogEntryProject.service.BlogEntryServiceImpl;

@RestController
public class MainController {
	@Autowired
	BlogEntryServiceImpl blogEntryServiceImpl;
	
	@CrossOrigin
	@GetMapping("/")
	public String index() {
		return "Blog Entry Project";
	}
	@CrossOrigin
	@PostMapping("/entry")
	public void saveEntry(@RequestBody BlogEntry blogEntry) {
		blogEntryServiceImpl.saveEntry(blogEntry);
	}
	@CrossOrigin
	@GetMapping("/entries")
	public List<BlogEntry> getAllEntries(){
		return blogEntryServiceImpl.getAllEntries();
	}
	@CrossOrigin
	@GetMapping("/entry/{id}")
	public BlogEntry getEntryById(@PathVariable Long id) {
		return blogEntryServiceImpl.getEntryById(id);
	}
	@CrossOrigin
	@DeleteMapping("/entry/{id}")
	public void deleteEntryById(@PathVariable Long id) {
		blogEntryServiceImpl.deleteEntry(id);
	}
	@CrossOrigin
	@PutMapping("/entry/{id}")
	public void updateEntryById(@RequestBody BlogEntry blogEntry, @PathVariable Long id) {
		blogEntryServiceImpl.updateEntry(blogEntry, id);
	}
}
