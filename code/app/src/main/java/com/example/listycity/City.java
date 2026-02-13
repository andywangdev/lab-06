package com.example.listycity;
public class City implements Comparable<City> {

    private final String city;
    private final String province;

    public City(String city, String province) {
        this.city = city;
        this.province = province;
    }

    public String getCityName() {
        return this.city;
    }

    public String getProvinceName() {
        return this.province;
    }


    @Override
    public int compareTo(City other) {
        return this.city.compareTo(other.getCityName());
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof City))
            return false;
        City other = (City) obj;
        return city.equals(other.city) && province.equals(other.province);
    }

    @Override
    public int hashCode() {
        int result = city.hashCode();
        result = 31 * result + province.hashCode();
        return result;
    }
}
