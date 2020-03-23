package com.polsource.BackEndDeveloperAssignment.Miscellaneous;

public class NoteNotFoundException extends RuntimeException {

    NoteNotFoundException(Long id){
        super("Could not find note with id equal " + id);
    }

}
