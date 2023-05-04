package com.medeiros.SPRINGProject.Models;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ForumIndexRepository extends CrudRepository<ForumIndexModel, Integer> {
}
