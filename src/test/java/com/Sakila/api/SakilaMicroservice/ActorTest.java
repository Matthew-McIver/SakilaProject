package com.Sakila.api.SakilaMicroservice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ActorTest {
    Actor testActor = new Actor();

    @Test
    public void testSetActorFirstName(){
        testActor.setFirstName("ACADEMY DINOSAUR");
        Assertions.assertEquals("ACADEMY DINOSAUR", testActor.getFirstName(), "Setter for first name is incorrect");
    }
}
