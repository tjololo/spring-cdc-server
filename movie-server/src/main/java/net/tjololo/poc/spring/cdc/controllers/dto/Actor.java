package net.tjololo.poc.spring.cdc.controllers.dto;

/**
 * Created by tjololo on 03/11/16.
 */
public class Actor {
    private String name;
    private String part;

    public Actor(String name, String part) {
        this.name = name;
        this.part = part;
    }

    public String getName() {
        return name;
    }

    public String getPart() {
        return part;
    }
}
