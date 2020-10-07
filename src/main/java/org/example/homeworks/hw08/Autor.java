package org.example.homeworks.hw08;
import java.util.Objects;
public class Autor {
    private String firstName;
    private String lastName;

    public Autor(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Autor autor = (Autor) o;
        return firstName.equals(autor.firstName) &&
                lastName.equals(autor.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }


    @Override
    public String toString() {
        return "Autor{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}

