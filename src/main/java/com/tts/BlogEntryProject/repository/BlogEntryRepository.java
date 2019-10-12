package com.tts.BlogEntryProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tts.BlogEntryProject.model.BlogEntry;

@Repository
public interface BlogEntryRepository extends JpaRepository<BlogEntry, Long> {
	public BlogEntry findBlogEntryById(Long id);
}
