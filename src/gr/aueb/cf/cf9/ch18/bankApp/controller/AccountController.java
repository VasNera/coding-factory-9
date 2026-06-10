package gr.aueb.cf.cf9.ch18.bankApp.controller;

import gr.aueb.cf.cf9.ch18.bankApp.core.exceptions.AccountNotFoundException;
import gr.aueb.cf.cf9.ch18.bankApp.core.exceptions.InsufficientBalanceException;
import gr.aueb.cf.cf9.ch18.bankApp.core.exceptions.ValidationException;
import gr.aueb.cf.cf9.ch18.bankApp.dao.IAccountDAO;
import gr.aueb.cf.cf9.ch18.bankApp.dto.AccountDepositDTO;
import gr.aueb.cf.cf9.ch18.bankApp.dto.AccountInsertDTO;
import gr.aueb.cf.cf9.ch18.bankApp.dto.AccountReadOnlyDTO;
import gr.aueb.cf.cf9.ch18.bankApp.dto.AccountWithdrawDTO;
import gr.aueb.cf.cf9.ch18.bankApp.service.IAccountService;
import gr.aueb.cf.cf9.ch18.bankApp.validation.Validator;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

public class AccountController {
    private final IAccountService accountService;

    public AccountController(IAccountService accountService) {
        this.accountService = accountService;
    }

    public AccountReadOnlyDTO createNewAccount(String iban, BigDecimal balance) throws ValidationException {

        AccountReadOnlyDTO readOnlyDTO;
        AccountInsertDTO insertDTO = new AccountInsertDTO(iban, balance);



        //validation

        Map<String, String> errors;
        errors = Validator.validateInsertDTO(insertDTO);

        if (!errors.isEmpty()) {
            throw new ValidationException(errors.toString());
        }

        //proceed to service

        readOnlyDTO = accountService.createNewAccount(insertDTO);
        return readOnlyDTO;
    }

    public void deposit(String iban, BigDecimal amount) throws AccountNotFoundException, ValidationException {
        AccountDepositDTO depositDTO = new AccountDepositDTO(iban, amount);

        Map<String, String> errors;
        errors = Validator.validateDepositDTO(depositDTO);

        if (!errors.isEmpty()) {
            throw new ValidationException(errors.toString());
        }

        accountService.deposit(depositDTO);

    }

    public void withdraw(String iban, BigDecimal amount) throws AccountNotFoundException, ValidationException, InsufficientBalanceException {
        AccountWithdrawDTO withdrawDTO = new AccountWithdrawDTO(iban, amount);

        Map<String, String> errors;
        errors = Validator.validateWithdrawDTO(withdrawDTO);

        if (!errors.isEmpty()) {
            throw new ValidationException(errors.toString());
        }

        accountService.withdraw(withdrawDTO);

    }

    public BigDecimal getBalance(String iban) throws AccountNotFoundException , ValidationException{
//

        Map<String, String> errors;
        errors = Validator.validateIban(iban);

        if (!errors.isEmpty()) {
            throw new ValidationException(errors.toString());
        }

       return accountService.getBalance(iban);


    }

    public List<AccountReadOnlyDTO> getAllAccounts(){
        return accountService.getAllAccounts();
    }

}