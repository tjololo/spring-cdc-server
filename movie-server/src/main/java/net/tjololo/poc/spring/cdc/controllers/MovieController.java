package net.tjololo.poc.spring.cdc.controllers;

import net.tjololo.poc.spring.cdc.controllers.dto.ActorPart;
import net.tjololo.poc.spring.cdc.controllers.dto.PartSearch;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by tjololo on 03/11/16.
 */
@RestController
public class MovieController {
    private static final String MOVIE_SERVER_JSON_V1 = "application/vnd.actor.v1+json";

    @RequestMapping(
            value = "/movie/role",
            method = RequestMethod.POST,
            consumes = MOVIE_SERVER_JSON_V1,
            produces = MOVIE_SERVER_JSON_V1
    )
    public ActorPart getPartInMovie(@RequestBody PartSearch partSearch) {
        return new ActorPart(true, "Deadpool");
    }
}
