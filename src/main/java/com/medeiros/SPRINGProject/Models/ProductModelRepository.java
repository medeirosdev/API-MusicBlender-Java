package com.medeiros.SPRINGProject.Models;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductModelRepository extends CrudRepository<ProductModel , Integer> {
}
