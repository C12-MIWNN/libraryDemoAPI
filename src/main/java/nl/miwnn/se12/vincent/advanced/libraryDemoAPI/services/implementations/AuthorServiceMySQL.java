package nl.miwnn.se12.vincent.advanced.libraryDemoAPI.services.implementations;

import lombok.RequiredArgsConstructor;
import nl.miwnn.se12.vincent.advanced.libraryDemoAPI.dtos.AuthorInfoDTO;
import nl.miwnn.se12.vincent.advanced.libraryDemoAPI.repositories.AuthorRepository;
import nl.miwnn.se12.vincent.advanced.libraryDemoAPI.services.AuthorService;
import nl.miwnn.se12.vincent.advanced.libraryDemoAPI.services.mappers.AuthorMapper;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Vincent Velthuizen <v.r.velthuizen@pl.hanze.nl>
 * Get Authors from the MySQL database
 */

@Service
@RequiredArgsConstructor
public class AuthorServiceMySQL implements AuthorService {

    private final AuthorRepository authorRepository;
    private final AuthorMapper authorMapper;

    @Override
    public List<AuthorInfoDTO> findAll() {
        return authorMapper.toDtos(authorRepository.findAll());
    }

    @Override
    public void addAuthor(AuthorInfoDTO author) {
        authorRepository.save(authorMapper.toModel(author));
    }

    @Override
    public void deleteAuthor(Long authorId) {
        authorRepository.deleteById(authorId);
    }
}
