package br.com.zupacademy.romeu.transacao;

public class Cartao {
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
