package com.example.materialnotes;

import org.joda.time.DateTime;

public class Notes {

    DateTime dateTime;
    String title;
    String content;

    public Notes(String title, String content) {
        this.dateTime = new DateTime();
        this.title = title;
        this.content = content;
    }

    public DateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(DateTime dateTime) {
        this.dateTime = dateTime;
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
