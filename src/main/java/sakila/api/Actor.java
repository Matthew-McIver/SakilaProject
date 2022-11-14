package sakila.api;
import javax.persistence.*;
import java.util.Collection;
@Entity
@Table(name = "actor")
public class Actor {
    //Attributes
    @Id
    @Column(name = "actor_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int actorId;

    @ManyToMany
    @JoinTable(name = "film_actor",
            joinColumns = @JoinColumn(name = "actor_id"),
            inverseJoinColumns = @JoinColumn(name = "film_id"))
    Collection<Actor> films;

    @Column(name = "first_name")
    String firstName;

    @Column(name = "last_name")
    String lastName;

    //Constructor
    public Actor(String myFirstName, String myLastName) {
        this.firstName = myFirstName;
        this.lastName = myLastName; }

    public Actor() {}

    //Methods
    public int getActorId() {
        return actorId;
    }
    public void setActorId(int myId) {
        actorId = myId;
    }

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String myFirstName) {
        firstName = myFirstName;
    }

    public String getLastName() {
        return lastName;
    }
    public void setLastName(String myLastName) {
        lastName = myLastName;
    } }