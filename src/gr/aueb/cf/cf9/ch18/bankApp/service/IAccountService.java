package gr.aueb.cf.cf9.ch18.bankApp.service;

import gr.aueb.cf.cf9.ch18.bankApp.core.exceptions.AccountNotFoundException;
import gr.aueb.cf.cf9.ch18.bankApp.core.exceptions.InsufficientBalanceException;
import gr.aueb.cf.cf9.ch18.bankApp.dto.AccountDepositDTO;
import gr.aueb.cf.cf9.ch18.bankApp.dto.AccountInsertDTO;
import gr.aueb.cf.cf9.ch18.bankApp.dto.AccountReadOnlyDTO;
import gr.aueb.cf.cf9.ch18.bankApp.dto.AccountWithdrawDTO;

import java.math.BigDecimal;
import java.util.List;

public interface IAccountService {

    AccountReadOnlyDTO createNewAccount(AccountInsertDTO insertDTO);
    void deposit (AccountDepositDTO depositDTO) throws AccountNotFoundException;
    void withdraw(AccountWithdrawDTO withdrawDTO) throws InsufficientBalanceException, AccountNotFoundException;
    BigDecimal getBalance(String iban) throws AccountNotFoundException;
    List<AccountReadOnlyDTO> getAllAccounts();
}

