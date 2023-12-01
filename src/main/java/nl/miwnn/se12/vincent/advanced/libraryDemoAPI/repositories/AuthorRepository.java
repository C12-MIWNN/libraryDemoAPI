package nl.miwnn.se12.vincent.advanced.libraryDemoAPI.repositories;

import nl.miwnn.se12.vincent.advanced.libraryDemoAPI.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Long> {
}
