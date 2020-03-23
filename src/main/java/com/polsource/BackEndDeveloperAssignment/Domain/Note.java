package com.polsource.BackEndDeveloperAssignment.Domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import java.time.Instant;

@Entity
public class Note {
    private @Id @GeneratedValue Long noteID;
    private Long parentNoteID; // if null then it means it's first note of that kind
    private @NotBlank String title;
    private @NotBlank String content;
    private Instant created;
    private Instant modified;
    private int version; //if it's 1 - original note
    private boolean isDeleted; // false by default, note was not deleted

    Note(){}

    public Note(@NotBlank String title, @NotBlank String content) {
        this.parentNoteID = null;
        this.title = title;
        this.content = content;
        this.created = Instant.now();
        this.modified = Instant.now();
        this.version = 1;
        this.isDeleted = false;

    }

    public Note(Long parentNoteID, @NotBlank String title, @NotBlank String content, Instant created, int version) {
        this.parentNoteID = parentNoteID;
        this.title = title;
        this.content = content;
        this.created = created;
        this.version = version;
    }

    public Long getNoteID() {
        return noteID;
    }

    public Long getParentNoteID() {
        return parentNoteID;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public Instant getCreated() {
        return created;
    }

    public Instant getModified() {
        return modified;
    }

    public int getVersion() {
        return version;
    }

}
