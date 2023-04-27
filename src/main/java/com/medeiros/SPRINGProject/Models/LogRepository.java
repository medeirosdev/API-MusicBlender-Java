package com.medeiros.SPRINGProject.Models;

import org.apache.juli.logging.Log;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LogRepository extends CrudRepository<LogModel ,Integer> {
}
