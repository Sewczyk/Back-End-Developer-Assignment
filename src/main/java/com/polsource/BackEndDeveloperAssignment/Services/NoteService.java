package com.polsource.BackEndDeveloperAssignment.Services;

import com.polsource.BackEndDeveloperAssignment.Domain.Note;
import com.polsource.BackEndDeveloperAssignment.Repository.NoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class NoteService {
    @Autowired
    private final NoteRepository noteRepository;

    public NoteService(NoteRepository noteRepository) {
        this.noteRepository = noteRepository;
    }

    public Note insertNewNote(Note note){
        Note toSave = new Note(note.getTitle(),note.getContent());
        return noteRepository.save(toSave);
    }

    public Note modifyExistingNote(Note note){
        Note toSave = new Note(note.getNoteID(),note.getTitle(),note.getContent(),note.getCreated(),note.getVersion()+1);
        return noteRepository.save(toSave);
    }
}
