package br.com.zupacademy.romeu.transacao;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Cartao {

  @Column(name = "cartaoId")
  private String id;
  private String email;

  public String getId() {
    return id;
  }

  public String getEmail() {
    return email;
  }

  @Override
  public String toString() {
    return "Cartao{" +
            "id='" + id + '\'' +
            ", email='" + email + '\'' +
            '}';
  }
}
