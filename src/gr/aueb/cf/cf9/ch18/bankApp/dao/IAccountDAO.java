package gr.aueb.cf.cf9.ch18.bankApp.dao;

import gr.aueb.cf.cf9.ch17.streams.OptionalMain;
import gr.aueb.cf.cf9.ch18.bankApp.model.Account;

import java.util.List;
import java.util.Optional;

public interface IAccountDAO {

    Account saveOrUpdate(Account account);
    void remove(String iban);
    Optional<Account> findByIban(String iban);
    List<Account> getAllAccounts();
    long count();

    //queries
    boolean isAccountExists(String iban);

}
