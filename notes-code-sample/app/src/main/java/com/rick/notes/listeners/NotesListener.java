package com.rick.notes.listeners;

import com.rick.notes.entities.Note;

public interface NotesListener {
    void onNoteClicked(Note note, int position);
}
