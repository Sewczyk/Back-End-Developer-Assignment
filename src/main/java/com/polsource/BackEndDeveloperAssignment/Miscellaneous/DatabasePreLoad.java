package com.polsource.BackEndDeveloperAssignment.Miscellaneous;


import com.polsource.BackEndDeveloperAssignment.Domain.Note;
import com.polsource.BackEndDeveloperAssignment.Repository.NoteRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DatabasePreLoad {
    @Bean
    CommandLineRunner initialiseNoteDB(NoteRepository NoteDB){
        return args -> {NoteDB.save(new Note("Some Title", "Some test content"));
        NoteDB.save(new Note("Some Another Title", "Some another test content"));
        };
    }
}
