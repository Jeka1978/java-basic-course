package model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author Evgeny Borisov
 */


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person implements Serializable {
    private String name;
    private int age;

}








