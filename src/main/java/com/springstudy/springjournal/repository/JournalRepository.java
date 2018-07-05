package com.springstudy.springjournal.repository;

import com.springstudy.springjournal.domain.Journal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JournalRepository extends JpaRepository<Journal, Long> {
}
