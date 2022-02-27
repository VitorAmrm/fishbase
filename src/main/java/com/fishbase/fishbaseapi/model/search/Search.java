package com.fishbase.fishbaseapi.model.search;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@MappedSuperclass
public class Search implements Serializable {
    @Id
    @NotNull
    private int id;
}
