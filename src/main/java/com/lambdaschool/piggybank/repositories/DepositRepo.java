package com.lambdaschool.piggybank.repositories;

import com.lambdaschool.piggybank.models.Deposit;
import org.springframework.data.repository.CrudRepository;

public interface DepositRepo extends CrudRepository<Deposit, Long> {
}