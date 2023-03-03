package com.nusiss.tfip.tfippafassessment.models;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;

public class Accounts {
 
  @NotNull
  @Size(min = 10)
  private String accountId;

  private String name;

  @Positive
  private double balance;
  
  public Accounts() {
  }

  public Accounts(String accountId, String name, double balance) {
    this.accountId = accountId;
    this.name = name;
    this.balance = balance;
  }

  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getBalance() {
    return balance;
  }

  public void setBalance(double balance) {
    this.balance = balance;
  }
  
  
  
}