package service;

import org.springframework.stereotype.Service;
import service.dto.User;

import java.util.LinkedList;
import java.util.List;


public class UserService {

    public List<User> getAllUser() {
        List<User> list = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            list.add(new User(i, "name" + String.valueOf(i)));
        }
        return list;
    }
}
