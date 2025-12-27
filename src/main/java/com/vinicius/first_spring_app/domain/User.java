package com.vinicius.first_spring_app.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter // gerar getter automaticamente
@Setter // gerar setter automaticamente
@AllArgsConstructor // gera construtor automaticamente
public class User {
    private String nome;
    private String email;

}
