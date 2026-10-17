package com.banking.product.Controllers;

import com.banking.product.Services.AccountService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/version/v1")
@RequiredArgsConstructor
@Slf4j
public class AccountController {

    private final AccountService accountService;

public ResponseEntity<AccountResponse> createAccount(
        @Valid @RequestBody CreateAccountRequest createAccountRequest
){

}



}
