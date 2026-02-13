package com.example.listycity;

/** Represents each city with  city name and province name. */

public class City implements Comparable<City> {

    private final String city;
    private final String province;


    /**
     * Creates a City.
     *
     * @param city the city name (e.g., "Edmonton")
     * @param province the province/territory name (e.g., "Alberta")
     */

    public City(String city, String province) {
        this.city = city;
        this.province = province;
    }


    /**
     * Gets the city name.
     *
     * @return the city name
     */

    public String getCityName() {

        return this.city;
    }

    /**
     * Gets the province/territory name.
     *
     * @return the province/territory name
     */
    public String getProvinceName() {
        return this.province;
    }


    /**
     * Compares cities by city name for sorting.
     *
     * @param other another city
     * @return comparison result
     */

    @Override
    public int compareTo(City other) {
        return this.city.compareTo(other.getCityName());
    }



    /**
     * Checks if two City objects are equal to each other
     *
     * @param obj the object to compare with
     * @return true if both city and province match;
     * false otherwise
     */

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof City))
            return false;
        City other = (City) obj;
        return city.equals(other.city) && province.equals(other.province);
    }


    /**
     * Generates a hash code based on the city name and province name.
     * This is used with {@link #equals(Object)} when City objects are stored
     * in collections like lists or sets.
     * @return hash code for this City
     */


    @Override
    public int hashCode() {
        int result = city.hashCode();
        result = 31 * result + province.hashCode();
        return result;
    }
}
