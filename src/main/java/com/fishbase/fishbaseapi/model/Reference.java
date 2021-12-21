package com.fishbase.fishbaseapi.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
//@Entity(name = "reference")
public class Reference implements Serializable {

    @Id
    private int id;

    private String authors;

    private int year;

    private String title;

    private String text;

    @OneToOne
    private Uri uri;
}
