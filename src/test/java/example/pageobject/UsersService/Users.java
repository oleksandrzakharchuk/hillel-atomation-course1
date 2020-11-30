package example.pageobject.UsersService;

import java.time.LocalDate;

public class Users {
    public String name;
    public LocalDate dateOfBirth;

    public Users(String name, LocalDate dateOfBirth) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }
}
