package com.example.listycity;

/**
 * This class represents a City with a name and a province.
 * Implements Comparable to allow sorting by city name.
 */
public class City implements Comparable<City> {
    private String city;
    private String province;

    /**
     * Constructs a City with a given name and province.
     * @param city The name of the city
     * @param province The province the city belongs to
     */
    public City(String city, String province){
        this.city = city;
        this.province = province;
    }

    /**
     * Returns the name of the city.
     * @return The city name
     */
    public String getCityName(){
        return this.city;
    }

    /**
     * Returns the name of the province the city belongs to.
     * @return The province name
     */
    public String getProvinceName(){
        return this.province;
    }

    /**
     * Compares this city with another city based on city name.
     * @param other The other City to compare to
     * @return a negative integer, zero, or a positive integer if this city's
     * name is lexicographically less than, equal to, or greater than the other city's name
     */
    @Override
    public int compareTo(City other) {
        return this.city.compareTo(other.getCityName());
    }

    /**
     * Checks equality between this city and another object.
     * Two cities are equal if both their city and province names match.
     * @param obj The object to compare
     * @return true if the object is a City with the same name and province, false otherwise
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof City)) return false;
        City other = (City) obj;
        return this.city.equals(other.city) && this.province.equals(other.province);
    }
}
