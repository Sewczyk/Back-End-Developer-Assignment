package com.polsource.BackEndDeveloperAssignment.Services;

import com.polsource.BackEndDeveloperAssignment.DataAccessObjects.NoteDAOInterface;
import com.polsource.BackEndDeveloperAssignment.Model.Note;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NoteService {
    @Autowired
    private final NoteDAOInterface noteDAOInterface;

    public NoteService(@Qualifier("h2notedatabase") NoteDAOInterface noteDAOInterface) {
        this.noteDAOInterface = noteDAOInterface;
    }

    public void insertNote(Note note) {
        noteDAOInterface.insertNote(note);
    }


    public void modifyNote(Note note) {
        noteDAOInterface.insertNote(note);
    }

    public void deleteNote(Note note) {
        noteDAOInterface.deleteNote(note);
    }

    public void readNote(Note note) {
        noteDAOInterface.readNote(note);
    }

    public List<Note> getAllNotes(){
        return noteDAOInterface.readAllNotes();
    }

}
