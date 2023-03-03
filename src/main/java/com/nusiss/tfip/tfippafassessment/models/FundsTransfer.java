package com.nusiss.tfip.tfippafassessment.models;

import jakarta.validation.constraints.Positive;

public class FundsTransfer {
  private Accounts fromAccount;
  private Accounts toAccount;

  @Positive
  private double transferAmount;
  
  
  public FundsTransfer() {
  }


  public FundsTransfer(Accounts fromAccount, Accounts toAccount) {
    this.fromAccount = fromAccount;
    this.toAccount = toAccount;
    
  }


  public Accounts getFromAccount() {
    return fromAccount;
  }


  public void setFromAccount(Accounts fromAccount) {
    this.fromAccount = fromAccount;
  }


  public Accounts getToAccount() {
    return toAccount;
  }


  public void setToAccount(Accounts toAccount) {
    this.toAccount = toAccount;
  }


  public double getTransferAmount() {
    return transferAmount;
  }


  public void setTransferAmount(double transferAmount) {
    this.transferAmount = transferAmount;
  }
  
  
}
