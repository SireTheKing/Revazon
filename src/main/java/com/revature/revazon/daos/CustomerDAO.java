package com.revature.revazon.daos;

import com.revature.revazon.models.User;
import org.springframework.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CustomerDAO extends JpaRepository<User, Integer>
{
    Optional<User> findByEmail(String email);

    Optional<User> findByUsername(String username);



}
