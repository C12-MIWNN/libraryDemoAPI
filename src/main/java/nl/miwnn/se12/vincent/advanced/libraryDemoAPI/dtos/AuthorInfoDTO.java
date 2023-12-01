package nl.miwnn.se12.vincent.advanced.libraryDemoAPI.dtos;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

/**
 * @author Vincent Velthuizen <v.r.velthuizen@pl.hanze.nl>
 * All author information that should be available for general users
 */

@Getter @Setter @Builder
public class AuthorInfoDTO {

    private Long authorId;
    private String name;

}
