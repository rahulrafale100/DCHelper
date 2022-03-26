package com.example.dchelper.admin.manageFaculty;

public class Faculty {
    private String name;
    private String id;

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }
    Faculty(){}
    public Faculty(String name, String id) {
        this.name = name;
        this.id = id;
    }
}
