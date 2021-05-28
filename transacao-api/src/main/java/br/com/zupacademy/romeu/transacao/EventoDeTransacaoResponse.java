package br.com.zupacademy.romeu.transacao;

import java.math.BigDecimal;
import java.util.Date;

public class EventoDeTransacaoResponse {

  private String id;
  private BigDecimal valor;
  private Estabelecimento estabelecimento;
  private Cartao cartao;
  private Date efetivadaEm;

  public EventoDeTransacaoResponse(EventoDeTransacao transacao) {
    this.id = transacao.getId();
    this.valor = transacao.getValor();
    this.estabelecimento = transacao.getEstabelecimento();
    this.cartao = transacao.getCartao();
    this.efetivadaEm = transacao.getEfetivadaEm();
  }

  public String getId() {
    return id;
  }

  public BigDecimal getValor() {
    return valor;
  }

  public Estabelecimento getEstabelecimento() {
    return estabelecimento;
  }

  public Cartao getCartao() {
    return cartao;
  }

  public Date getEfetivadaEm() {
    return efetivadaEm;
  }

}