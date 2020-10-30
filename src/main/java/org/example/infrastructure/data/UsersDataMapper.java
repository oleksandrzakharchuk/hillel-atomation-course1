package org.example.infrastructure.data;

import java.util.ArrayList;

public interface UsersDataMapper {
     User FindUserByEmail(String email);

     ArrayList<User> getAll();

}
