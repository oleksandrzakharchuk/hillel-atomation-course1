package org.example.infrastructure.data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DbUserDataMapper implements UsersDataMapper {

    @Override
    public User FindUserByEmail(String email) {


        //конектер к базе данных
        //try with resources
        //mapper вычитывает из users.db.sqlite
        try(Connection connection = DriverManager.getConnection("users.db.sqlite")) {

            PreparedStatement st=connection.prepareStatement("SELECT * FROM users");
            ResultSet set=st.executeQuery();

            while (set.next()){
               new User(set.getString("id"),
                set.getString("email"),
                set.getString("password"));

            }



        } catch (Exception ex){
    }


        return null;
    }

    @Override
    public User[] getAll() {
        return new User[0];
    }
}
