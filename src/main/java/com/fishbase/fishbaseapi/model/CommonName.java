package com.fishbase.fishbaseapi.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
//@Entity(name = "common_name")
public class CommonName implements Serializable {

    @Id
    private int id;

    @OneToOne
    private Taxon taxon;

    @OneToOne
    private CommonNameElement common_name_element;

    @OneToOne
    private Language language;

    @OneToOne
    private Country country_iso;

    @OneToOne
    private RegionFreeText region_free_text;



}
