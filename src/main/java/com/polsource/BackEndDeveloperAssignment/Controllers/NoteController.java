package com.polsource.BackEndDeveloperAssignment.Controllers;

import com.polsource.BackEndDeveloperAssignment.Domain.Note;
import com.polsource.BackEndDeveloperAssignment.Repository.NoteRepository;
import com.polsource.BackEndDeveloperAssignment.Services.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.security.PermitAll;
import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
public class NoteController {
    @Autowired
    private final NoteService noteService;

    public NoteController(NoteService noteService) {
        this.noteService = noteService;
    }

    @PostMapping("/notes")
    public Note insertNewNote(@Valid @RequestBody Note note)
    {
        return noteService.insertNewNote(note);
    }
/*
    @GetMapping("/notes")
    public List<Note>getAllNotes()
    {
        return
    }
*/
    @PutMapping("/notes/{id}")
    public void deleteNote(@PathVariable(value = "id") @Valid Long id){
         noteService.deleteNote(id);
    }

    @GetMapping("/notes")
    List<Note>getAllNonDeletedNotes(){
        return noteService.getAllNonDeletedNotes();
    }

    @PostMapping("/notes/{id}")
    public Note modifyExistingNote(@PathVariable(value = "id") Long id, @Valid @RequestBody Note modifiedNote){
        return noteService.modifyExistingNote(id, modifiedNote);
    }

    @GetMapping("/notes/{id}")
    Note getNoteByID(@PathVariable(value = "id") @Valid Long id) {
        return noteService.getNoteByID(id);
    }
}
