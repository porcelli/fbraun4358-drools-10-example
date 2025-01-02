package com.example;

import com.example.facts.MyFact;
import com.example.facts.StringFact;
import org.drools.ruleunits.api.DataSource;
import org.drools.ruleunits.api.DataStore;
import org.drools.ruleunits.api.RuleUnitData;

public class Group2 implements RuleUnitData {
    DataStore<MyFact> facts = DataSource.createStore();

    public DataStore<MyFact> getFacts() {
        return facts;
    }

}
