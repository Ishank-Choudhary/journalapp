package net.engineeringDigest.journalApp.entity;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class JournalEntry {

    private long Id;
    private String title;
    private String content;

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
