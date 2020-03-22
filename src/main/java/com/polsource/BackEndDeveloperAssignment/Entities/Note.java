package com.polsource.BackEndDeveloperAssignment.Entities;

import java.sql.Date;
import java.util.UUID;


public class Note {
    private UUID uuid;
    private String Title;
    private String Content;
    private Date Created;
    private Date Modified;

    public Note(String title, String content, Date created, Date modified) {
        this.Title = title;
        this.Content = content;
        this.Created = created;
        this.Modified = modified;
    }

    public String getTitle() {
        return Title;
    }

    public String getContent() {
        return Content;
    }

    public Date getCreated() {
        return Created;
    }

    public Date getModified() {
        return Modified;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public void setContent(String content) {
        Content = content;
    }
}
