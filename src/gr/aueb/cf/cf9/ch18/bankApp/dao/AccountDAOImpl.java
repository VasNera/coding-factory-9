package gr.aueb.cf.cf9.ch18.bankApp.dao;

import gr.aueb.cf.cf9.ch18.bankApp.model.Account;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class AccountDAOImpl implements IAccountDAO{
    private final List<Account> accounts = new ArrayList<>();


    @Override
    public Account saveOrUpdate(Account account) {
        int index = accounts.indexOf(account);          // override  equals

        if (index == -1 ){
            accounts.add(account);               // αν δεν υπάρχει κάνε insert
        return account;
        }


        accounts.set(index , account);          // αν υπάρχει κάνε update.
        return accounts.get(index);
    }

    @Override
    public void remove(String iban) {
        accounts.removeIf(account -> account.getIban().equals(iban));

    }

    @Override
    public Optional<Account> findByIban(String iban) {
        return accounts.stream()
                .filter(account ->account.getIban().equals(iban))
                .findFirst();
    }

    @Override
    public List<Account> getAllAccounts() {
//        return new ArrayList<>(accounts);
//        return List.copyOf(accounts);
        return Collections.unmodifiableList(accounts);
    }

    @Override
    public boolean isAccountExists(String iban) {
        return accounts.stream()
                .anyMatch(account -> account.getIban().equals(iban));

    }

    @Override
    public long count() {
        return accounts.size();
    }
}
