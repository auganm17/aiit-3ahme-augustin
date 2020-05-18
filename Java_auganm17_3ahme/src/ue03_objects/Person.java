package ue03_objects;

import java.util.Objects;
/**
 *
 * @author auganm17
 */
public class Person extends Object implements Cloneable {
    final private String firstname;
    final private String surname;


    public Person (String firstname, String surname) {
        if (firstname == null || firstname.isEmpty()) {
            throw new IllegalArgumentException("invalid firstname!");
        }
        if (surname == null || surname.isEmpty()) {
            throw new IllegalArgumentException("invalid surname!");
        }
        this.firstname = firstname;
        this.surname = surname;
    }


    public String getFirstname () {
        return firstname;
    }


    public String getSurname () {
        return surname;
    }
    
    void setFirstname (String borris) {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public String toString () {
        return surname + " " + firstname;
    }

    @Override
    public Person clone () {
        try {
            //return new Person (firstname, surname);
            return (Person)super.clone();
        }
        catch (CloneNotSupportedException ex) {
            throw new RuntimeException(ex);
        }
    }


    @Override
    public int hashCode () {
        int hash = 7;
        hash = 11 * hash + Objects.hashCode(this.firstname);
        hash = 11 * hash + Objects.hashCode(this.surname);
        return hash;
    }


    @Override
    public boolean equals (Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Person other = (Person) obj;
        if (!Objects.equals(this.firstname, other.firstname)) {
            return false;
        }
        if (!Objects.equals(this.surname, other.surname)) {
            return false;
        }
        return true;
    }



   
}