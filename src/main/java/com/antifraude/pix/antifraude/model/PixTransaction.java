package com.antifraude.pix.antifraude.api.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tb_transactions")
public class PixTransaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "chave_pix_remetente")
    private String chaveDoRemetente;

    @Column(name = "nome_remetente", nullable = false, length = 150)
    private String nomeDoRemetente;

    @Column(name = "valor", nullable = false, precision = 15, scale = 2)
    private BigDecimal valor;

    @Column(name = "data_da_transacao", nullable = false)
    private LocalDateTime dataTransacao;
}