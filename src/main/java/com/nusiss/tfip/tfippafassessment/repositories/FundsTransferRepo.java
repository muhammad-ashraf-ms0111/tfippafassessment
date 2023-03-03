package com.nusiss.tfip.tfippafassessment.repositories;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Repository;

//import com.nusiss.tfip.tfippafassessment.models.Accounts;

@Repository
public class FundsTransferRepo {
  
  @Autowired
  JdbcTemplate template;

  public boolean withdraw(String accountId, double balance) {
    final int rowCount = template.update("update account set balance = balance - ? where account_id = ?", balance, accountId);
            return rowCount > 0;
        }
    public boolean deposit(String accountId, double balance) { final int rowCount = template.update(
    "update account set balance = balance + ? where account_id = ?",
               balance, accountId);
            return rowCount > 0;
    }

    public Optional<Double> getBalance(String accountId) { 
      final SqlRowSet rs = template.queryForRowSet
      ("select balance from account where account_id = ?", accountId); 
      return Optional.ofNullable(
      rs.next()? rs.getDouble("balance"): null); }
}
