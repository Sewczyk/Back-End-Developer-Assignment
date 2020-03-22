package com.polsource.BackEndDeveloperAssignment.DataAccessObjects;

import com.polsource.BackEndDeveloperAssignment.Model.Note;

import java.util.List;

public interface NoteDAOInterface {

    public void insertNote(Note note);
    public void modifyNote(Note note);
    public void deleteNote(Note note);
    public Note readNote(Note note);
    public List<Note> readAllNotes();

}
