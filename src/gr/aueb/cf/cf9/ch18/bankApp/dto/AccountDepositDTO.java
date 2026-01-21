package gr.aueb.cf.cf9.ch18.bankApp.dto;

import java.math.BigDecimal;

public record AccountDepositDTO(String iban, BigDecimal amount) {
}
