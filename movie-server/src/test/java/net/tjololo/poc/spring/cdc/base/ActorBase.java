package net.tjololo.poc.spring.cdc.base;

import com.jayway.restassured.module.mockmvc.RestAssuredMockMvc;
import net.tjololo.poc.spring.cdc.controllers.MovieController;
import org.junit.Before;

/**
 * Created by tjololo on 03/11/16.
 */
public class ActorBase {

    @Before
    public void setup() {
        RestAssuredMockMvc.standaloneSetup(new MovieController());
    }
}
