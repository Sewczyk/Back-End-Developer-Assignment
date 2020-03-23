package com.polsource.BackEndDeveloperAssignment.Controllers;

import com.polsource.BackEndDeveloperAssignment.Domain.Note;
import com.polsource.BackEndDeveloperAssignment.Repository.NoteRepository;
import com.polsource.BackEndDeveloperAssignment.Services.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

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



    @PostMapping("/notes/{id}")
    public Note modifyExistingNote(@PathVariable(value = "id") @Valid @RequestBody Note note){
        return noteService.modifyExistingNote(note);
    }

}
