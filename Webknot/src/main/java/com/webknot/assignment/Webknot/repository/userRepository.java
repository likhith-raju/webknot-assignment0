package com.webknot.assignment.Webknot.repository;

import com.webknot.assignment.Webknot.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import jakarta.persistence.Id;

@Repository
public interface userRepository extends JpaRepository<User,String> {


    public Optional<User> findByEmail(String email);
}