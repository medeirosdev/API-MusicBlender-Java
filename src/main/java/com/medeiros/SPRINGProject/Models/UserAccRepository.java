package com.medeiros.SPRINGProject.Models;

import com.medeiros.SPRINGProject.Models.User_Credentials;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserAccRepository extends CrudRepository<User_Credentials, Integer> {

    User_Credentials findById(int id);
}
