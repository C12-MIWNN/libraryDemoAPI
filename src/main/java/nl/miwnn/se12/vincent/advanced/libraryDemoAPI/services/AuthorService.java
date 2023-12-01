package nl.miwnn.se12.vincent.advanced.libraryDemoAPI.services;

import nl.miwnn.se12.vincent.advanced.libraryDemoAPI.dtos.AuthorInfoDTO;

import java.util.List;

/**
 * @author Vincent Velthuizen <v.r.velthuizen@pl.hanze.nl>
 * Interface for all the ways we want to access authors
 */
public interface AuthorService {

    List<AuthorInfoDTO> findAll();

    void addAuthor(AuthorInfoDTO author);

    void deleteAuthor(Long authorId);

}
