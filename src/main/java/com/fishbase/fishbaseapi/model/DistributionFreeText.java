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
//@Entity(name = "distribution_free_text")
public class DistributionFreeText implements Serializable {

    @Id
    private int taxon_detail_id;

    @OneToOne
    private RegionFreeText region_free_text;

    @OneToOne
    private DistributionStatus distribution_status;


}
