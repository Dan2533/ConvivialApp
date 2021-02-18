package com.CodeDifferently.demo.Repository;

import com.CodeDifferently.demo.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
