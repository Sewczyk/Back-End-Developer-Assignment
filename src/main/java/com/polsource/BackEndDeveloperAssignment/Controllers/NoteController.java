package com.polsource.BackEndDeveloperAssignment.Controllers;

import com.polsource.BackEndDeveloperAssignment.Model.Note;
import com.polsource.BackEndDeveloperAssignment.Services.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RequestMapping("API/Note")
@RestController
public class NoteController {

    private final NoteService noteService;
    @Autowired
    public NoteController(NoteService noteService) {
        this.noteService = noteService;
    }
    @GetMapping("/all")
    public List<Note> getAllNotes(){
        return noteService.getAllNotes();
    }

    public void createNote(@RequestBody Note note){
        noteService.insertNote(note);
    }

}
