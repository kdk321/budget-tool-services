package com.budgettool.budgettoolservices;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BudgetRepository extends CrudRepository<BudgetItem, Long> {
}
