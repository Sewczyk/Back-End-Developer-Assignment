package com.polsource.BackEndDeveloperAssignment.Services;

import com.polsource.BackEndDeveloperAssignment.Domain.Note;
import com.polsource.BackEndDeveloperAssignment.Repository.NoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class NoteVersionService {
    @Autowired
    private final NoteRepository noteRepository;

    public NoteVersionService(NoteRepository noteRepository) {
        this.noteRepository = noteRepository;
    }

    public List<Note> getAllNotes(){
        return noteRepository.findAll();
    }

    public Optional<Note> getNoteByID(Long id){
        return noteRepository.findById(id);
    }


}
