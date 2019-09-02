package ru.vol2hv;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Сущность, описывающая города, в которых расположены автомойки
 * Нужна для фильтрации во FrontEnd
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class City implements Serializable {
    @Id
    private int id;
    private String name;
    private String region;
}
