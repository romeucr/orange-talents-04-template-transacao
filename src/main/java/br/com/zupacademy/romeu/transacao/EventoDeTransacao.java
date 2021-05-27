package br.com.zupacademy.romeu.transacao;

import java.math.BigDecimal;
import java.util.Date;

public class EventoDeTransacao {

  private String id;
  private BigDecimal valor;
  private Estabelecimento estabelecimento;
  private Cartao cartao;
  private Date efetivadaEm;

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

  @Override
  public String toString() {
    return "EventoDeTransacao{" +
            "id='" + id + '\'' +
            ", valor=" + valor +
            ", estabelecimento=" + estabelecimento +
            ", cartao=" + cartao +
            ", efetivadaEm=" + efetivadaEm +
            '}';
  }
}