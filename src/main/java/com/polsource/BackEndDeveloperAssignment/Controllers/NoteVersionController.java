package com.polsource.BackEndDeveloperAssignment.Controllers;

import com.polsource.BackEndDeveloperAssignment.Domain.Note;
import com.polsource.BackEndDeveloperAssignment.Services.NoteVersionService;
import org.aspectj.weaver.ast.Not;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
public class NoteVersionController {
    @Autowired
    private final NoteVersionService noteVersionService;

    public NoteVersionController(NoteVersionService noteVersionService) {
        this.noteVersionService = noteVersionService;
    }

    @GetMapping("/versioning/getAllNotes")
    List<Note>getAllNotes() {
        return noteVersionService.getAllNotes();
    }

    @GetMapping("/versioning/notes/{id}")
    Optional<Note> getNoteByID(@PathVariable(value = "id") @Valid Long id) {
        return noteVersionService.getNoteByID(id);
    }

    @GetMapping("/versioning/historyByID/{id}")
    List<Note>getNoteHistoryByID(@PathVariable(value = "id") Long id){
        return noteVersionService.getNoteHistoryByID(id);
    }
}

