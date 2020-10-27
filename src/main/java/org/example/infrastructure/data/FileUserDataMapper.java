package org.example.infrastructure.data;

import java.io.BufferedReader;
import java.io.FileReader;

public class FileUserDataMapper implements UsersDataMapper {

private User [] users=new User[11];


    public FileUserDataMapper() {
        try(BufferedReader br = new BufferedReader(new FileReader("users.txt"))) {
            String line = br.readLine();
            while (line != null) {

                String[] parts = line.split(",");
                User u = new User(parts[0], parts[1], parts[2]);

                for (int i = 0; i < users.length; i++) {
                    if (users[i] == null) {
                        users[i] = u;
                        break;

                    }
                }

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
          // throw new UserNotFoundException("User with email"+email+"was not found");
            return null;
        }


    public User[] getAll() {
        return new User[0];
    }
}
