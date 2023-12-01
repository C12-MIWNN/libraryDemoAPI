package nl.miwnn.se12.vincent.advanced.libraryDemoAPI.services.mappers;

import nl.miwnn.se12.vincent.advanced.libraryDemoAPI.dtos.AuthorInfoDTO;
import nl.miwnn.se12.vincent.advanced.libraryDemoAPI.model.Author;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Vincent Velthuizen <v.r.velthuizen@pl.hanze.nl>
 * Transform Model classes into DTOs and vice-versa
 */
@Component
public class AuthorMapper {

    public List<AuthorInfoDTO> toDtos(List<Author> models) {
        List<AuthorInfoDTO> dtos = new ArrayList<>();

        for (Author model : models) {
            dtos.add(toDto(model));
        }

        return dtos;
    }

    public AuthorInfoDTO toDto(Author model) {
        return AuthorInfoDTO.builder()
                .authorId(model.getAuthorId())
                .name(model.getName())
                .build();
    }

    public Author toModel(AuthorInfoDTO dto) {
        Author model = new Author();

        model.setAuthorId(dto.getAuthorId());
        model.setName(dto.getName());

        return model;
    }

}
