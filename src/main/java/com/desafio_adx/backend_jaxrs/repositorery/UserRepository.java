package com.desafio_adx.backend_jaxrs.repositorery;


import com.desafio_adx.backend_jaxrs.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
