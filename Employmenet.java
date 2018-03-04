package com.sjg.groovy;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Employment {
    private Map<String, Set<String>> employees;

    public void assignManager(String manager, String colleague) {
        if (employees.containsKey(manager)) {
            Set<String> colleagues = employees.get(manager);
            colleagues.add(colleague);
        } else {
            Set<String> colleagues = new HashSet<String>();
            colleagues.add(colleague);
            employees.put(manager, colleagues);
        }
    }
    public void beColleague(String employee1, String employee2) {
        Set<String> colleagues = null;

        colleagues = getColleagueSet(employee1);
        if (colleagues != null) {
            colleagues.add(employee2);
        }
    }
    public boolean isManager(String manager, String colleague) {
        boolean flag = false;

        if (employees.containsKey(manager)) {
            Set<String> colleagues = employees.get(manager);
            if (colleagues.contains(colleague)) {
                flag = true;
            }
        }
        return flag;
    }

    private Set<String> getColleagueSet(String employee1) {
        for (String manager : employees.keySet()) {
            Set<String> colleagues = employees.get(manager);
            if (colleagues.contains(employee1)) {
                return colleagues;
            }
        }
        return null;
    }
}