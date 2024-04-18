package br.ufrn.dct.labens.example.registration.service;

import java.util.List;

import br.ufrn.dct.labens.example.registration.dto.UserDto;
import br.ufrn.dct.labens.example.registration.entity.User;

public interface UserService {
    
    void saveUser(UserDto userDto);

    User findUserByEmail(String email);

    List<UserDto> findAllUsers();
}
