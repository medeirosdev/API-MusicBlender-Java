package com.medeiros.SPRINGProject.Models;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserInfoRepository extends CrudRepository<User_Info , Integer> {
}
