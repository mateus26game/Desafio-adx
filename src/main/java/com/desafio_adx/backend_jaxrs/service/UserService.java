package com.desafio_adx.backend_jaxrs.service;

import com.desafio_adx.backend_jaxrs.model.User;
import com.desafio_adx.backend_jaxrs.repositorery.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public Optional<User> getUserById(Long id) {
        return userRepository.findById(id);
    }

    public User createUser(User user) {
        return userRepository.save(user);
    }

    public Optional<User> updateUser(Long id, User updatedUser) {
        return userRepository.findById(id).map(user -> {
            user.setTitulo(updatedUser.getTitulo());
            user.setGenero(updatedUser.getGenero());
            user.setDescricao(updatedUser.getDescricao());
            user.setDataDeLancamento(updatedUser.getDataDeLancamento());
            user.setDuracao(updatedUser.getDuracao());
            return userRepository.save(user);
        });
    }

    public boolean deleteUser(Long id) {
        if (userRepository.existsById(id)) {
            userRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
