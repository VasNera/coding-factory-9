package gr.aueb.cf.cf9.ch18.bankApp.dto;

import java.math.BigDecimal;

public record AccountWithdrawDTO(String iban, BigDecimal amount) {
}
