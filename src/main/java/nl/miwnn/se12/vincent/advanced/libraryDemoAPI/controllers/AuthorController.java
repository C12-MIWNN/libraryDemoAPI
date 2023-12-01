package nl.miwnn.se12.vincent.advanced.libraryDemoAPI.controllers;

import lombok.RequiredArgsConstructor;
import nl.miwnn.se12.vincent.advanced.libraryDemoAPI.dtos.AuthorInfoDTO;
import nl.miwnn.se12.vincent.advanced.libraryDemoAPI.services.AuthorService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Vincent Velthuizen <v.r.velthuizen@pl.hanze.nl>
 * Provide API endpoints for everything to do with authors
 */

@RestController
@RequiredArgsConstructor
public class AuthorController {

    private final AuthorService authorService;

    @GetMapping("/api/authors")
    public ResponseEntity<List<AuthorInfoDTO>> allAuthors() {
        return ResponseEntity.ok(authorService.findAll());
    }

    @PostMapping("/api/author/new")
    public ResponseEntity<?> saveAuthor(@RequestBody AuthorInfoDTO authorInfoDTO) {
        authorService.addAuthor(authorInfoDTO);
        return ResponseEntity.ok("Author added");
    }

    @PutMapping("/api/author/update")
    public ResponseEntity<?> updateAuthor(@RequestBody AuthorInfoDTO authorInfoDTO) {
        authorService.addAuthor(authorInfoDTO);
        return ResponseEntity.ok("Author updated");
    }

    @DeleteMapping("/api/author/{authorId}")
    public ResponseEntity<?> deleteAuthor(@PathVariable("authorId") Long authorId) {

        authorService.deleteAuthor(authorId);
        return ResponseEntity.ok("Author deleted");
    }
}
