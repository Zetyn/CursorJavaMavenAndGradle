import org.example.models.Person;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonTest {
    @Test
    void testGetPerson() {
        String name = "testName";
        short age = 20;
        Person person = new Person();
        person.setName(name);
        person.setAge(age);
        assertEquals(name,person.getName());
        assertEquals(age,person.getAge());
    }
}
