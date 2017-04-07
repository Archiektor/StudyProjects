package com.archiektor;

import java.util.Objects;

/**
 * Created by Archiektor on 04.04.2017.
 */
public class Man {

    private int age;
    private String country;

    Man(int age, String country) {
        this.age = age;
        this.country = country;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Man)) {
            return false;
        }
        Man man = (Man) obj;
        return (Objects.equals(age, man.age) && Objects.equals(country, man.country));
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, country);
    }
}
