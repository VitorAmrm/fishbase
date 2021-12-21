package com.fishbase.fishbaseapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
//@Entity(name = "source_database")
public class SourceDatabase implements Serializable {

    @Id
    private int id;

    private String name;
    private String abbreviated_name;
    private String group_name_in_english;
    private String authors_and_editors;
    private String organisation;
    private String contact_person;
    private String version;
    private Date release_date;
    @JsonProperty("abstract")
    private String _abstract;
    private String taxonomic_coverage;
    private int is_new;
    private String coverage;
    private String completness;
    private int confidence;



}
