package com.example;

import com.example.facts.MyFact;
import org.drools.ruleunits.api.DataSource;
import org.drools.ruleunits.api.DataStore;
import org.drools.ruleunits.api.RuleUnitData;

public class Group1 implements RuleUnitData {

    private DataStore<MyFact> facts = DataSource.createStore();

    public DataStore<MyFact> getFacts() {
        return facts;
    }

}