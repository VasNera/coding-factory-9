package gr.aueb.cf.cf9.ch18.bankApp.service;

import gr.aueb.cf.cf9.ch18.bankApp.core.exceptions.AccountNotFoundException;
import gr.aueb.cf.cf9.ch18.bankApp.core.exceptions.InsufficientBalanceException;
import gr.aueb.cf.cf9.ch18.bankApp.core.mapper.Mapper;
import gr.aueb.cf.cf9.ch18.bankApp.dao.IAccountDAO;
import gr.aueb.cf.cf9.ch18.bankApp.dto.AccountDepositDTO;
import gr.aueb.cf.cf9.ch18.bankApp.dto.AccountInsertDTO;
import gr.aueb.cf.cf9.ch18.bankApp.dto.AccountReadOnlyDTO;
import gr.aueb.cf.cf9.ch18.bankApp.dto.AccountWithdrawDTO;
import gr.aueb.cf.cf9.ch18.bankApp.model.Account;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;
;

public class AccountServiceImpl implements IAccountService{

    private final IAccountDAO accountDAO;

    public AccountServiceImpl(IAccountDAO accountDAO){
        this.accountDAO = accountDAO;
    }

    @Override
    public AccountReadOnlyDTO createNewAccount(AccountInsertDTO insertDTO) {
        Account account = Mapper.mapToModelEntity(insertDTO);
        account = accountDAO.saveOrUpdate(account);
        return Mapper.mapToReadOnlyDTO(account);


    }

    @Override
    public void deposit(AccountDepositDTO depositDTO) throws AccountNotFoundException {
        try {

            Account account = accountDAO.findByIban(depositDTO.iban())
                    .orElseThrow(() -> new AccountNotFoundException("Account with iban" + depositDTO.iban() + " not found"));
            account.setBalance(account.getBalance().add(depositDTO.amount()));
            accountDAO.saveOrUpdate(account);

        } catch (AccountNotFoundException e){
            System.err.printf("%s. The account with iban %s was not found\n" , LocalDateTime.now() , depositDTO.iban());
            throw e;
        }

    }

    @Override
    public void withdraw(AccountWithdrawDTO withdrawDTO) throws InsufficientBalanceException, AccountNotFoundException {

        try {
            Account account = accountDAO.findByIban(withdrawDTO.iban())
                    .orElseThrow(() -> new AccountNotFoundException("Account with iban" + withdrawDTO.iban() + " not found"));

            if (account.getBalance().compareTo(withdrawDTO.amount()) < 0){
                throw new InsufficientBalanceException("Invalid amount  " + withdrawDTO.amount() +
                        "for account with iban" + withdrawDTO.iban() + "was greater tha the balance");

            }
            account.setBalance(account.getBalance().subtract(withdrawDTO.amount()));
            accountDAO.saveOrUpdate(account);
        } catch (AccountNotFoundException e) {
            System.err.printf("%s. The account with iban %s was not found\n" , LocalDateTime.now() , withdrawDTO.iban());
            throw e;
        }catch (InsufficientBalanceException e){
            System.err.printf("%s. the amount=%f is greater than the balance with the iban =%s. \n" ,
                    LocalDateTime.now(), withdrawDTO.amount(), withdrawDTO.iban());
            throw e;

        }


    }
    @Override
    public BigDecimal getBalance(String iban) throws AccountNotFoundException {
        try {
            Account account = accountDAO.findByIban(iban)
                    .orElseThrow(() -> new AccountNotFoundException("Account with iban" + iban + " not found"));
            return account.getBalance();

        } catch (AccountNotFoundException e) {
            System.err.printf("%s. The account with iban %s was not found\n" , LocalDateTime.now() , iban);

            throw e;
        }
    }

    @Override
    public List<AccountReadOnlyDTO> getAllAccounts() {
        return accountDAO.getAllAccounts().stream()
                .map(Mapper::mapToReadOnlyDTO)
                .collect(Collectors.toList());

    }
}
