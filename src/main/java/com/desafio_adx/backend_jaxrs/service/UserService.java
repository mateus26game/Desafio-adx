package com.desafio_adx.backend_jaxrs.service;

import com.desafio_adx.backend_jaxrs.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private final List<User> users = new ArrayList<>();
    private Long idCounter = 1L;

    public List<User> getAllUsers() {
        return users;
    }

    public Optional<User> getUserById(Long id) {
        return users.stream().filter(user -> user.getId().equals(id)).findFirst();
    }

    public User createUser(User user) {
        user.setId(idCounter++);
        users.add(user);
        return user;
    }

    public Optional<User> updateUser(Long id, User updatedUser) {
        return getUserById(id).map(user -> {
            user.setTitulo(updatedUser.getTitulo());
            user.setGenero(updatedUser.getGenero());
            user.setDuracao(updatedUser.getDuracao());
            user.setDescricao(updatedUser.getDescricao());
            user.setDataDeLancamento(updatedUser.getDataDeLancamento());
            return user;
        });
    }

    public boolean deleteUser(Long id) {
        return users.removeIf(user -> user.getId().equals(id));
    }
}
