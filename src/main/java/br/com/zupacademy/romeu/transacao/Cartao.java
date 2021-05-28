package br.com.zupacademy.romeu.transacao;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Embeddable
public class Cartao {

  @Column(name = "cartaoId")
  private String id;

  @NotBlank
  @Email
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
