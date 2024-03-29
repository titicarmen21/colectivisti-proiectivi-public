package ro.ubb.mp.controller;

import lombok.Getter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ro.ubb.mp.dao.model.User;
import ro.ubb.mp.service.user.UserService;

import java.util.List;

@RestController
@Getter
public class IndexController {

    private static final String GREET_MESSAGE = "Application is running";

    private final UserService userService;

    public IndexController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public String getGreetMessage() {
        return GREET_MESSAGE;
    }

    @GetMapping("/users")
    public List<User> getAllUsers() {
        return getUserService().getAll();
    }
}
