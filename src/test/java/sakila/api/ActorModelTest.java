package sakila.api;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ActorModelTest {
    ActorModel testActor = new ActorModel("Matthew", "McIver");
    @Test
    void testActorFirstName(){
        Assertions.assertEquals("Matthew", testActor.getFirstName(), "Getter for first names is incorrect."); }
    @Test
    void testActorLastName(){
        Assertions.assertEquals("McIver", testActor.getLastName(), "Getter for last names is incorrect."); } }