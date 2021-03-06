package Main;

import Main.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by liqiang on 2018/7/18 23:36.
 */
@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/{id}")
    public String findById(@PathVariable Long id) {
        User findOne = userRepository.findOne(id);

        List<User> list = userRepository.findAll();
        return "film: " + id;
    }

    @GetMapping("/abc/{id}")
    public String findByIdTmp(@PathVariable Long id) {
        User findOne = userRepository.findOne(id);

        List<User> list = userRepository.findAll();
        return "film1: " + id;
    }
}
