package dev.jaimerey.accounts.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import lombok.Data;

@Data
public final class AccountsDto {

    private Long accountNumber;

    private String accountType;

    private String branchAddress;
}
