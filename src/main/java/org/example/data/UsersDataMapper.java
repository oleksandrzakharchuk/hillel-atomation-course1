package org.example.data;

import java.util.List;

public interface UsersDataMapper {

     User FindUserByEmail(String email);
    // User FindUserByUsername(String email);
     List<User> getAll();


    User findUserByEmail(String s);
}
