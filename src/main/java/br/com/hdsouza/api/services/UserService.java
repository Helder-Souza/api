package br.com.hdsouza.api.services;

import br.com.hdsouza.api.domain.User;

public interface UserService {

    User findById(Integer id);
}
