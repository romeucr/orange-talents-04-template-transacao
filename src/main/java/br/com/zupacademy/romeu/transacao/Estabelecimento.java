package br.com.zupacademy.romeu.transacao;

import javax.persistence.Embeddable;

@Embeddable
public class Estabelecimento {
  private String nome;
  private String cidade;
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
