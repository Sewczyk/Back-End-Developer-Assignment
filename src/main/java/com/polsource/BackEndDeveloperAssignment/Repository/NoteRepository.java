package com.polsource.BackEndDeveloperAssignment.Repository;

import com.polsource.BackEndDeveloperAssignment.Domain.Note;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface NoteRepository extends JpaRepository<Note,Long> {


}
