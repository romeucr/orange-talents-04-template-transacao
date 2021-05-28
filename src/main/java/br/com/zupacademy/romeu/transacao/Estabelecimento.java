package br.com.zupacademy.romeu.transacao;

import javax.persistence.Embeddable;
import javax.validation.constraints.NotBlank;

@Embeddable
public class Estabelecimento {

  @NotBlank
  private String nome;

  @NotBlank
  private String cidade;

  @NotBlank
  private String endereco;

  public String getNome() {
    return nome;
  }

  public String getCidade() {
    return cidade;
  }

  public String getEndereco() {
    return endereco;
  }

  @Override
  public String toString() {
    return "Estabelecimento{" +
            "nome='" + nome + '\'' +
            ", cidade='" + cidade + '\'' +
            ", endereco='" + endereco + '\'' +
            '}';
  }
}
