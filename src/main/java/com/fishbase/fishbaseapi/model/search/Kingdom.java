package com.fishbase.fishbaseapi.model.search;

import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Kingdom extends Search {
}
