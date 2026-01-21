package gr.aueb.cf.cf9.ch18.bankApp.validation;

import gr.aueb.cf.cf9.ch18.bankApp.dto.AccountDepositDTO;
import gr.aueb.cf.cf9.ch18.bankApp.dto.AccountInsertDTO;
import gr.aueb.cf.cf9.ch18.bankApp.dto.AccountWithdrawDTO;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class Validator {

    private Validator(){

    }

    public static Map<String, String> validateInsertDTO(AccountInsertDTO insertDTO){
        Map<String,String> errors = new HashMap<>();

        if (insertDTO.iban()==null || !insertDTO.iban().trim().matches("GR\\d{3,25}")){
            errors.put("iban" , "Iban must start with GR and have 3-25 digits.");
        }

        if (insertDTO.balance()== null || insertDTO.balance().compareTo(BigDecimal.ZERO) < 0){
            errors.put("Balance" , "Balance cannot be negative.");
        }

        return errors;
    }

    public static Map<String, String> validateDepositDTO(AccountDepositDTO depositDTO){
        Map<String,String> errors = new HashMap<>();

        if (depositDTO.iban()==null || !depositDTO.iban().trim().matches("GR\\d{3,25}")){
            errors.put("iban" , "Iban must start with GR and have 3-25 digits.");
        }

        if (depositDTO.amount()== null || depositDTO.amount().compareTo(BigDecimal.ZERO) < 0){
            errors.put("Amount" , "Amount cannot be negative.");
        }

        return errors;
    }

    public static Map<String, String> validateWithdrawDTO(AccountWithdrawDTO withdrawDTO){
        Map<String,String> errors = new HashMap<>();

        if (withdrawDTO.iban()==null || !withdrawDTO.iban().trim().matches("GR\\d{3,25}")){
            errors.put("iban" , "Iban must start with GR and have 3-25 digits.");
        }

        if (withdrawDTO.amount()== null || withdrawDTO.amount().compareTo(BigDecimal.ZERO) < 0){
            errors.put("Amount" , "Amount cannot be negative.");
        }

        return errors;
    }

    public static Map<String, String> validateIban(String iban){
    Map<String,String> errors = new HashMap<>();

        if (iban==null || !iban.trim().matches("GR\\d{3,25}")){
            errors.put("iban" , "Iban must start with GR and have 3-25 digits.");
        }
    return errors;

    }
}
