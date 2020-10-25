package org.example.infrastructure.data;

public class DbUserDataMapper implements UsersDataMapper {
    @Override
    public User FindUserByEmail(String email) {
        return null;
    }

    @Override
    public User[] getAll() {
        return new User[0];
    }
}
