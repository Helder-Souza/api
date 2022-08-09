package br.com.hdsouza.api.services;

import br.com.hdsouza.api.domain.User;

import java.util.List;

public interface UserService {

    User findById(Integer id);
    List<User> findAll();
}
