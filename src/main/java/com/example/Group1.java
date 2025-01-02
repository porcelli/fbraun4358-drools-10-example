package com.example;

import com.example.facts.StringFact;
import org.drools.ruleunits.api.DataSource;
import org.drools.ruleunits.api.DataStore;
import org.drools.ruleunits.api.RuleUnitData;

public class Group1 implements RuleUnitData {
    DataStore<StringFact> facts = DataSource.createStore();

    public DataStore<StringFact> getFacts() {
        return facts;
    }

}
