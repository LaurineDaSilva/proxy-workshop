package co.simplon.proxy.cache;

import java.util.HashMap;
import java.util.Map;

import co.simplon.proxy.entities.Person;

public class Cache {

    private static final Map<Long, Person> CACHE_PERSONS = new HashMap<>();

    public static Person getById(Long id) {
	return CACHE_PERSONS.get(id);
    }

    public static void addToCache(Person person) {
	CACHE_PERSONS.put(person.getId(), person);
    }

}
