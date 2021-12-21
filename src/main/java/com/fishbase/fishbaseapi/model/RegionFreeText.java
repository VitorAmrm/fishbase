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
//@Entity(name = "region_free_text")
public class RegionFreeText implements Serializable {

    @Id
    private int id;

    private String free_text;
}
