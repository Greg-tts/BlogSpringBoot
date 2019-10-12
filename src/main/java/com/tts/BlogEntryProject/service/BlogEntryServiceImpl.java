package com.tts.BlogEntryProject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tts.BlogEntryProject.model.BlogEntry;
import com.tts.BlogEntryProject.repository.BlogEntryRepository;

@Service
public class BlogEntryServiceImpl implements BlogEntryServiceInt{
	@Autowired
	BlogEntryRepository blogEntryRepository;
	
	@Override
	public void saveEntry(BlogEntry blogEntry) {
		blogEntryRepository.save(blogEntry);
	}
	@Override
	public List<BlogEntry> getAllEntries() {
		return blogEntryRepository.findAll();
	}
	@Override
	public BlogEntry getEntryById(Long id) {
		return blogEntryRepository.findBlogEntryById(id);
	}
	@Override
	public void deleteEntry(Long id) {
		blogEntryRepository.deleteById(id);
	}
	@Override
	public void updateEntry(BlogEntry blogEntryChanges, Long id) {
		BlogEntry currentEntry = blogEntryRepository.findBlogEntryById(id);
		currentEntry.setAuthor(blogEntryChanges.getAuthor());
		currentEntry.setContent(blogEntryChanges.getContent());
		currentEntry.setTitle(blogEntryChanges.getTitle());
		blogEntryRepository.save(currentEntry);
	}
}
