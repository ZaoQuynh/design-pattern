package org.example;

import java.util.HashMap;
import java.util.Map;

public class Context {
    private Map<String, Integer> variables;

    public Context(){
        variables = new HashMap<>();
    }

    public int getValue(String key){
        return variables.get(key);
    }

    public void setValue(String key, int value){
        variables.put(key, value);
    }
}
