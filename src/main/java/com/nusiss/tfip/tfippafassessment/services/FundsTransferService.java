package com.nusiss.tfip.tfippafassessment.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nusiss.tfip.tfippafassessment.repositories.FundsTransferRepo;

@Service
public class FundsTransferService {
  
  @Autowired
  private FundsTransferRepo TrfRepo;
  
  @Transactional
public void transfer(String fromAcct, String toAcct, double balance){
  final Optional<Double> optFrom = TrfRepo.getBalance(fromAcct); 
  final Optional<Double> optTo = TrfRepo.getBalance(toAcct);
  if (optFrom.isEmpty() || optTo.isEmpty() || (optFrom.get() < balance))
  throw new IllegalArgumentException("Incorrect parameters");

}
}
