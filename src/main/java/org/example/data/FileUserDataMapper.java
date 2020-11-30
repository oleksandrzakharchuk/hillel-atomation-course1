package org.example.data;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class FileUserDataMapper implements UsersDataMapper {

private List<User> users=new ArrayList<>();

    public FileUserDataMapper(String filename) {
        try(BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line = br.readLine();
            while (line != null) {

                String[] parts = line.split(",");
                users.add(new User(parts[0], parts[1], parts[2]));

                    //System.out.println(line);
                    line = br.readLine();

                }

            } catch(Exception ex){
                throw new RuntimeException("Faild to map usrs from txt file", ex);
            }
        }


        @Override
    public User FindUserByEmail(String email) {
        for(User u:users){
            if (u.getEmail().equals(email)){
                return u;
            }
        }
           throw new UserNotFoundException("User with email"+email+"was not found");

        }


    public List<User> getAll() {return users;}

    @Override
    public User findUserByEmail(String s) {
        return null;
    }
}

