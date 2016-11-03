package net.tjololo.poc.spring.cdc.controllers.dto;

/**
 * Created by tjololo on 03/11/16.
 */
public class ActorPart {
    private boolean acts;
    private String part;

    public ActorPart(boolean acts, String part) {
        this.acts = acts;
        this.part = part;
    }

    public boolean isActs() {
        return acts;
    }

    public String getPart() {
        return part;
    }
}
