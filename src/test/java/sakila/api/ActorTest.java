package sakila.api;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
class ActorTest {
    Actor testActor = new Actor();
    Actor newActor = new Actor("Matthew", "McIver");
    @Test
    void testActorId(){
        testActor.setActorId(1);
        Assertions.assertEquals(1, testActor.getActorId(), "Setter and/or getter for actor ID is incorrect."); }
    @Test
    void testActorFirstName(){
        testActor.setFirstName("Matthew");
        Assertions.assertEquals("Matthew", testActor.getFirstName(), "Setter and/or getter for first names is incorrect."); }
    @Test
    void testActorLastName(){
        testActor.setLastName("McIver");
        Assertions.assertEquals("McIver", testActor.getLastName(), "Setter and/or getter for last names is incorrect."); } }