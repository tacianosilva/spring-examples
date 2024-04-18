package br.ufrn.dct.labens.example.registration.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.ufrn.dct.labens.example.registration.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {

    Role findByName(String name);
}
