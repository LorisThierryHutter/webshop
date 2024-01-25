package ch.bbw.userservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public Optional<User> createUser(User user) {
        if(userRepository.existsByUsername(user.getUsername())) {
            // Throw an exception or handle it as you see fit
        }
        return Optional.of(userRepository.save(user));
    }

    public Optional<User> getUserByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    public void deleteUser(Long userId) {
        userRepository.deleteById(userId);
    }

    // TODO: check if all needed services exist

}
