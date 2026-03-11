package simpleNote.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import simpleNote.Model.Note;

@Repository
public interface NoteRepository extends JpaRepository<Note, Integer> {
}