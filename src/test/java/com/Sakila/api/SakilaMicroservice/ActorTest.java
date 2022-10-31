package com.Sakila.api.SakilaMicroservice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ActorTest {
    Actor testActor = new Actor();

    @Test
    public void testActorId(){
        testActor.setActorId(1);
        Assertions.assertEquals(1, testActor.getActorId(), "Setter and/or getter for actor ID is incorrect.");
    }

    @Test
    public void testActorFirstName(){
        testActor.setFirstName("Bazza");
        Assertions.assertEquals("Bazza", testActor.getFirstName(), "Setter and/or getter for first names is incorrect.");
    }

    @Test
    public void testActorLastName(){
        testActor.setLastName("Gracie");
        Assertions.assertEquals("Gracie", testActor.getLastName(), "Setter and/or getter for last names is incorrect.");
    }

    @Test
    public void testConstructorActor(){}
        Actor newTestActor = new Actor();
}
