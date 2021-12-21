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
//@Entity(name = "uri")
public class Uri implements Serializable {

    @Id
    private int id;

    private String resource_identifier;

    private String description;

    @OneToOne
    private UriScheme uri_schema;

}
