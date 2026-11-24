package controller;

import model.Note;
import model.Notebook;

import javafx.fxml.FXML;
import javafx.scene.control.*;

public class NoteController {

    @FXML
    private TextField titleField;

    @FXML
    private TextArea contentArea;

    @FXML
    private ListView<Note> notesList;

    @FXML
    private Label messageLabel;

    private Notebook notebook = new Notebook();

    @FXML
    public void initialize() {

        notesList.getSelectionModel()
                .selectedItemProperty()
                .addListener((observable, oldNote, newNote) -> {

                    if (newNote != null) {
                        titleField.setText(newNote.getTitle());
                        contentArea.setText(newNote.getContent());
                    }
                });
    }

    @FXML
    private void addNote() {

        String title = titleField.getText().trim();
        String content = contentArea.getText().trim();

        if (title.isEmpty() || content.isEmpty()) {
            messageLabel.setText("Please enter title and content.");
            return;
        }

        Note note = new Note(title, content);

        notebook.addNote(note);

        notesList.getItems().setAll(notebook.getNotes());

        clearFields();

        messageLabel.setText("Note added successfully.");
    }

    @FXML
    private void editNote() {

        Note selectedNote =
                notesList.getSelectionModel().getSelectedItem();

        if (selectedNote == null) {
            messageLabel.setText("Please select a note.");
            return;
        }

        String title = titleField.getText().trim();
        String content = contentArea.getText().trim();

        if (title.isEmpty() || content.isEmpty()) {
            messageLabel.setText("Please enter title and content.");
            return;
        }

        selectedNote.setTitle(title);
        selectedNote.setContent(content);

        notesList.refresh();

        clearFields();

        messageLabel.setText("Note updated successfully.");
    }

    @FXML
    private void deleteNote() {

        Note selectedNote =
                notesList.getSelectionModel().getSelectedItem();

        if (selectedNote == null) {
            messageLabel.setText("Please select a note.");
            return;
        }

        notebook.deleteNote(selectedNote);

        notesList.getItems().setAll(notebook.getNotes());

        clearFields();

        messageLabel.setText("Note deleted successfully.");
    }

    private void clearFields() {

        notesList.getSelectionModel().clearSelection();

        titleField.clear();
        contentArea.clear();
    }
}
