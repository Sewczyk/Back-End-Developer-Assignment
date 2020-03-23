package com.polsource.BackEndDeveloperAssignment.Services;

import com.polsource.BackEndDeveloperAssignment.Domain.Note;
import com.polsource.BackEndDeveloperAssignment.Repository.NoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.List;
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

    public void deleteNote(Long id){
        Note toDelete = noteRepository.getOne(id);
        toDelete.setDeleted(true);
        noteRepository.save(toDelete);
    }

    public List<Note> getAllNonDeletedNotes(){
        return noteRepository.getAllNonDeletedNotes();
    }

    public Note getNoteByID(Long id){
        return noteRepository.getOneNoteByID(id);
    }

    public Note modifyExistingNote(Long id, Note note){
        Note previousVersion = noteRepository.getOne(id);
        Note toSave = new Note(id,note.getTitle(),note.getContent(),previousVersion.getCreated(),previousVersion.getVersion()+1);
        return noteRepository.save(toSave);
    }
}
