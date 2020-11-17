package org.example;

import org.example.data.FileUserDataMapper;
import org.example.data.User;
import org.example.data.UserNotFoundException;
import org.example.data.UsersDataMapper;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class FileUserDataMapperTests {
    private UsersDataMapper dataMapper;
    private User u1;
    private User u2;
    private List<User> expectedUsers = new ArrayList<>();

    @Before
    public void setUp() {
        dataMapper = new FileUserDataMapper("test-users.txt");

        u1 = new User("1", "test1@gmail.com", "123456");
        u2 = new User("2", "test2@gmail.com", "123456");

        expectedUsers.add(u1);
        expectedUsers.add(u2);
    }

    @Test
    public void testGetAllUsers() {
        assertTrue(dataMapper.getAll().size() == 2);
        assertEquals(expectedUsers, dataMapper.getAll());
    }
    @Test
    public void testGetAllUsersFromEmptyFile() {
        UsersDataMapper mapper=new FileUserDataMapper("empty.txt");
        assertTrue(mapper.getAll().size()==0);
    }

    @Test
    public void testFindExistingUserByEmail() {
        User actualUser = dataMapper.findUserByEmail("test1@gmail.com");
        assertEquals(u1, actualUser);

    }

    @Test(expected = UserNotFoundException.class)
    public void testUserNotFoundByEmail() {
        dataMapper.findUserByEmail("test@gmail.com");
    }

    @Test(expected = RuntimeException.class)
    public void testNoUserFile() {
        new FileUserDataMapper("");

    }

    @Test(expected = RuntimeException.class)
    public void testInvalidUserFile() {
        new FileUserDataMapper("123.txt");
    }
}

