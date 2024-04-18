package com.fabiofrau.Jpa_Project.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;


@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
//@Inheritance(strategy = InheritanceType.JOINED)
//@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
//@DiscriminatorColumn(name = "resource_type")
public class Resource {

    @Id
    @GeneratedValue
    private Integer id;

    private String name;

    private int size;

    private String url;

    @OneToOne
    @JoinColumn(name = "lecture_id")
    private Lecture lecture;

}
