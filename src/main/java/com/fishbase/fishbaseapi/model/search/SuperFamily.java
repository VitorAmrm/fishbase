package com.fishbase.fishbaseapi.model.search;

import com.fishbase.fishbaseapi.model.search.Search;

import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class SuperFamily extends Search {
}
