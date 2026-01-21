package gr.aueb.cf.cf9.ch18.bankApp.dto;

import java.math.BigDecimal;

public record AccountReadOnlyDTO(String iban, BigDecimal balance) {
    @Override
    public String toString() {
        return "AccountReadOnlyDTO{" +
                "iban='" + iban + '\'' +
                ", balance=" + balance +
                '}';
    }
}
