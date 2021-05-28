package br.com.zupacademy.romeu.transacao.exception;

public class ErroPadrao {

  private String campo;
  private String mensagem;

  public ErroPadrao(String campo, String mensagem) {
    this.campo = campo;
    this.mensagem = mensagem;
  }

  public String getCampo() {
    return campo;
  }

  public String getMensagem() {
    return mensagem;
  }
}
