package com.lambdaschool.piggybank.controllers;

import com.lambdaschool.piggybank.models.Deposit;
import com.lambdaschool.piggybank.repositories.DepositRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class DepositController {
    @Autowired
    DepositRepo depositrepo;

    // http://localhost:2019/total
    @GetMapping(value = "/total", produces = "application/json")
    public ResponseEntity<?> getDepositTotal() {
        List<Deposit> depositList = new ArrayList<>();
        depositrepo.findAll().iterator().forEachRemaining(depositList::add);

        double depositBalance = 0.0;

        for (Deposit d : depositList) {
            depositBalance += (double)d.getQuantity() * d.getValue();
            if (d.getQuantity() > 1) {
                System.out.println(d.getQuantity() + " " + d.getNamePlural());
            } else {
                System.out.println(d.getQuantity() + " " + d.getName());
            }
        }
        String outputMsg = "Piggy bank holds $" + depositBalance + " in deposits.";

        System.out.println(outputMsg);

        return new ResponseEntity<>(HttpStatus.OK);
    }
}