package br.com.zupacademy.romeu.transacao;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.PastOrPresent;
import java.math.BigDecimal;
import java.util.Date;

@Entity
public class EventoDeTransacao {

  @Id
  private String id;

  @NotEmpty
  private BigDecimal valor;

  @Embedded
  private Estabelecimento estabelecimento;

  @Embedded
  private Cartao cartao;

  @PastOrPresent
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