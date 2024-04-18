package br.ufrn.dct.labens.example.registration.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.ufrn.dct.labens.example.registration.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByEmail(String email);

}
