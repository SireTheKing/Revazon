package com.revature.revazon.daos;

import com.revature.revazon.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.lang.NonNull;
import sun.jvm.hotspot.debugger.Address;

import java.util.Optional;

public interface AddressDAO extends JpaRepository<User, Integer>
{
    Optional<User> findByAddress(@NonNull Address address);

}
