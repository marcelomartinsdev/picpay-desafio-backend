package br.com.marcelomartinsdev.picpaydesafiobackend.wallet;

import org.springframework.data.annotation.Id;

import java.math.BigDecimal;

public record Wallet(@Id Long id, String fullname, Long cpf, String email, String password, int type, BigDecimal balance) {
}
