package com.nusiss.tfip.tfippafassessment.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.nusiss.tfip.tfippafassessment.services.FundsTransferService;

@Controller
public class FundsTransferController {
  

    @Autowired
    private FundsTransferService fundsTransferService;

    @PostMapping("/transfer")
    public ResponseEntity<String> transferFunds(@RequestParam String fromAccount, @RequestParam String toAccount, @RequestParam double balance) {
        fundsTransferService.transfer(fromAccount, toAccount, balance);
        return ResponseEntity.ok("Funds transfer successful");
    }
}