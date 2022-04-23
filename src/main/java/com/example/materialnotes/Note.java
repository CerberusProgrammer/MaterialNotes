package com.example.materialnotes;

import org.joda.time.DateTime;

public class Note {

    DateTime dateTime;

    String title;
    String content;

    public Note(String title, String content) {

        DateTime dt = new DateTime();

        int year = dt.getYear();
        int month = dt.getMonthOfYear();
        int day = dt.getDayOfMonth();

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
