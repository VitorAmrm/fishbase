package com.fishbase.fishbaseapi.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
//@Entity(name = "scrutiny")
public class Scrutiny implements Serializable {

    @Id
    private int id;

    private Date scrutiny_date;

    private Date original_scrutiny_date;

    @OneToOne
    private Specialist specialist;
}
