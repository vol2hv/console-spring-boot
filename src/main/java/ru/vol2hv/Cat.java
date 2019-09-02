package ru.vol2hv;

import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class Cat {
   @Id
    private int id;
    private  String name;
    private int age;

}
