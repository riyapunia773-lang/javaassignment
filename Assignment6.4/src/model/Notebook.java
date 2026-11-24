package model;

import java.util.ArrayList;

public class Notebook {

    private ArrayList<Note> notes = new ArrayList<>();

    public void addNote(Note note) {
        notes.add(note);
    }

    public ArrayList<Note> getNotes() {
        return notes;
    }

    public void deleteNote(Note note) {
        notes.remove(note);
    }
}