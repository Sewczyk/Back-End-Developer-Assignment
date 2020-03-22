package com.polsource.BackEndDeveloperAssignment.DataAccessObjects;

import com.polsource.BackEndDeveloperAssignment.Model.Note;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.UUID;

@Repository("h2notedatabase")
public class NoteDataAccess implements NoteDAOInterface {

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public NoteDataAccess(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public void insertNote(Note note) {

    }

    @Override
    public void modifyNote(Note note) {

    }

    @Override
    public void deleteNote(Note note) {

    }

    @Override
    public Note readNote(Note note) {
        return null;
    }

    @Override
    public List<Note> readAllNotes() {
        String query = "SELECT uuid, parentNote, title, content FROM notes";
        List<Note> notes = jdbcTemplate.query(query, ((resultSet, i) -> {
            UUID uuid = UUID.fromString(resultSet.getString("UUID"));
            UUID parentNote = UUID.fromString(resultSet.getString("parentNote"));
            String title = resultSet.getString("title");
            String content = resultSet.getString("content");
            return new Note(uuid,parentNote,title,content);
        }));
        return notes;
    }
}

/*        this.uuid = uuid;
        this.parentNote = parentNote;
        this.title = title;
        this.content = content;
        this.created = created;
        this.modified = modified;

 */