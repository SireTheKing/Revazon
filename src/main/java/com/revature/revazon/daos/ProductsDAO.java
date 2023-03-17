package com.revature.revazon.daos;

import com.revature.revazon.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProductsDAO extends JpaRepository<Product, Integer>
{
    Optional<Product> findByTitle(@NonNull String title);


}
