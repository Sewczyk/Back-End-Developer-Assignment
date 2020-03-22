package com.polsource.BackEndDeveloperAssignment.Model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.polsource.BackEndDeveloperAssignment.Miscellaneous.Constants;

import javax.validation.constraints.NotBlank;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.UUID;


public class Note {
    private UUID uuid;
    private UUID parentNote;
    @NotBlank
    private String title;
    private String content;
    private Timestamp created;
    private Timestamp modified;

    public Note(String title, String content) {
        this.uuid = UUID.randomUUID();
        this.parentNote = Constants.DEFAULT_UUID;
        this.title = title;
        this.content = content;

    }

    public Note(UUID uuid, UUID parentNote, @JsonProperty("Title") @NotBlank String title,
                @JsonProperty("Content") String content) {
        this.uuid = uuid;
        this.parentNote = parentNote;
        this.title = title;
        this.content = content;
        this.created = null;
        this.created = null;
    }

    public Note(UUID uuid, UUID parentNote, @JsonProperty("Title") @NotBlank String title,
                @JsonProperty("Content") String content, Timestamp created, Timestamp modified) {
        this.uuid = uuid;
        this.parentNote = parentNote;
        this.title = title;
        this.content = content;
        this.created = created;
        this.modified = modified;
    }

    public UUID getUuid() {
         return uuid;
    }

    public UUID getParentNote() { return parentNote; }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }
/*
    public Timestamp getCreated() {return created; }

    public Timestamp getModified() {
        return modified;
    }

 */
}
