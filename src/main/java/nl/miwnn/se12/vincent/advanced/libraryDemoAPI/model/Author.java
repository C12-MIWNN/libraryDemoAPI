package nl.miwnn.se12.vincent.advanced.libraryDemoAPI.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

/**
 * @author Vincent Velthuizen <v.r.velthuizen@pl.hanze.nl>
 * An author is a person who is writing or has written a book
 */

@Entity
@Data
public class Author {

    @Id @GeneratedValue
    private Long authorId;

    private String name;

}
