package com.fishbase.fishbaseapi.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
//@Entity(name = "language")
public class Language implements Serializable {

    @Id
    private String iso;

    private String name;

    private int standard;
}
