package com.polsource.BackEndDeveloperAssignment.Repository;

import com.polsource.BackEndDeveloperAssignment.Domain.Note;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface NoteRepository extends JpaRepository<Note,Long> {

   @Query("SELECT n FROM Note n WHERE n.id = :id OR n.parentNoteID = :id")
   List<Note>getNoteHistoryByID(@Param("id") Long id);

   @Query("SELECT n FROM Note n WHERE n.isDeleted = FALSE")
   List<Note>getAllNonDeletedNotes();
   @Query("SELECT n FROM Note n WHERE n.id = :id AND n.isDeleted = FALSE")
   Note getOneNoteByID(Long id);
}
