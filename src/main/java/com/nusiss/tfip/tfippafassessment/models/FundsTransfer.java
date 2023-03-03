package com.nusiss.tfip.tfippafassessment.models;

import jakarta.validation.constraints.Positive;

public class FundsTransfer {
  private Accounts fromAccount;
  private Accounts toAccount;
  private String comments; 

  @Positive
  private double transferAmount;
  
  
  public FundsTransfer() {
  }



  public FundsTransfer(Accounts fromAccount, Accounts toAccount, String comments, @Positive double transferAmount) {
    this.fromAccount = fromAccount;
    this.toAccount = toAccount;
    this.comments = comments;
    this.transferAmount = transferAmount;
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





  public String getComments() {
    return comments;
  }





  public void setComments(String comments) {
    this.comments = comments;
  }
  
  
}
