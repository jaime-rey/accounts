package dev.jaimerey.accounts.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data @AllArgsConstructor
public final class ResponseDto {

    private String statusCode;

    private String statusMsg;
}
