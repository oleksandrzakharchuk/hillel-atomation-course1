package org.example.infrastructure.data;

public interface UsersDataMapper {
     User FindUserByEmail(String email);

     User[] getAll();

}
