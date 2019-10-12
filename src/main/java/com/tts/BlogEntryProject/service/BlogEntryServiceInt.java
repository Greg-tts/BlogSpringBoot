package com.tts.BlogEntryProject.service;

import java.util.List;

import com.tts.BlogEntryProject.model.BlogEntry;

public interface BlogEntryServiceInt {
	public void saveEntry(BlogEntry blogEntry);
	public List<BlogEntry> getAllEntries();
	public BlogEntry getEntryById(Long id);
	public void deleteEntry(Long id);
	public void updateEntry(BlogEntry blogEntry, Long id);
}
