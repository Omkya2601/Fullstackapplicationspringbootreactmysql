package com.codewithomi.fullstack_backend.reository;

import com.codewithomi.fullstack_backend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

}
