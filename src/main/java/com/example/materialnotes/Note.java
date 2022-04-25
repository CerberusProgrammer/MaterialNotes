package com.example.materialnotes;

import org.joda.time.DateTime;

public class Note {

    String date;
    String title;
    String content;

    public Note() {
        DateTime dt = new DateTime();

        int year = dt.getYear();
        int month = dt.getMonthOfYear();
        int day = dt.getDayOfMonth();

        this.date = month + "/" + day + "/" + year;
        this.title = "";
        this.content = "";
    }

    public Note(String title, String content) {
        DateTime dt = new DateTime();

        int year = dt.getYear();
        int month = dt.getMonthOfYear();
        int day = dt.getDayOfMonth();

        this.date = month + "/" + day + "/" + year;
        this.title = title;
        this.content = content;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
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
