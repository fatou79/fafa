package com.fatou.OneToOne2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fatou.OneToOne2.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
