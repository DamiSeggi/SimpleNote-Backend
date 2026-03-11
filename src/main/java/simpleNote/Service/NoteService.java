package simpleNote.Service;


import org.springframework.stereotype.Service;

import simpleNote.Model.Note;
import simpleNote.Model.NoteDTO;
import simpleNote.Repository.NoteRepository;

import java.util.List;

@Service
public class NoteService {

    private final NoteRepository noteRepository;

    public NoteService(NoteRepository noteRepository) {
        this.noteRepository = noteRepository;
    }

    public List<Note> getAllNotes() {
        return noteRepository.findAll();
    }

    public Note getNoteById(int id) {
        return noteRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Note not found with id: " + id));
    }

    public Note createNote(NoteDTO dto) {
        Note note = new Note(dto.getTitle(), dto.getContent());
        return noteRepository.save(note);
    }

    public Note updateNote(int id, NoteDTO dto) {
        Note note = getNoteById(id);
        note.setTitle(dto.getTitle());
        note.setContent(dto.getContent());
        return noteRepository.save(note);
    }

    public void deleteNote(int id) {
        noteRepository.deleteById(id);
    }
}