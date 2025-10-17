package com.example.listycity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * This class manages a list of City objects.
 * Supports adding, deleting, checking, counting, and retrieving cities in sorted order.
 */
public class CityList {
    private List<City> cities = new ArrayList<>();

    /**
     * Adds a city to the list if it does not already exist.
     * @param city The City object to add
     * @throws IllegalArgumentException if the city already exists in the list
     */
    public void add(City city) {
        if (cities.contains(city)) {
            throw new IllegalArgumentException("City already exists in the list.");
        }
        cities.add(city);
    }

    /**
     * Checks whether a given city exists in the list.
     * @param city The City object to check
     * @return true if the city exists in the list, false otherwise
     */
    public boolean hasCity(City city) {
        return cities.contains(city);
    }

    /**
     * Deletes a city from the list if it exists
     * @param city The City object to delete
     * @throws IllegalArgumentException if the city does not exist in the list
     */
    public void delete(City city) {
        if (!cities.contains(city)) {
            throw new IllegalArgumentException("City not found in the list.");
        }
        cities.remove(city);
    }

    /**
     * Returns the number of cities currently in the list.
     * @return the count of cities
     */
    public int countCities() {
        return cities.size();
    }

    /**
     * Returns a sorted list of cities by city name.
     * @return a new List containing all cities in sorted order
     */
    public List<City> getCities() {
        List<City> list = new ArrayList<>(cities);
        Collections.sort(list);
        return list;
    }
}


