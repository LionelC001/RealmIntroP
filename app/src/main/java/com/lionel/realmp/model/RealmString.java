package com.lionel.realmp.model;

import io.realm.RealmObject;

public class RealmString extends RealmObject {
    private String val;

    public String getValue() {
        return val;
    }

    public void setValue(String value) {
        this.val = value;
    }
}
