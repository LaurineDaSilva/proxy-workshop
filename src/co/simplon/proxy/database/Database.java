package co.simplon.proxy.database;

import java.util.HashMap;
import java.util.Map;

import co.simplon.proxy.entities.Person;

public class Database {

    private static Long personId = 0L;
    public static final Map<Long, Person> PERSONS = new HashMap<>();

    static {
	Person person = new Person();
	person.setFirstName("Harry");
	person.setLastName("Potter");
	Database.savePerson(person);
	person = new Person();
	person.setFirstName("Hermione");
	person.setLastName("Granger");
	Database.savePerson(person);
	person = new Person();
	person.setFirstName("Ron");
	person.setLastName("Winsley");
	Database.savePerson(person);
    }

    public static void savePerson(Person person) {
	personId++;
	person.setId(personId);
	PERSONS.put(personId, person);
    }

    public static Person findById(Long personId) {
	return PERSONS.get(personId);
    }

}
