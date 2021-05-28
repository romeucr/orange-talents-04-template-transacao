package br.com.zupacademy.romeu.transacao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.NotBlank;
import java.util.List;

@RestController
public class TransacaoController {

  @Autowired
  EventoDeTransacaoRepository eventoRepository;

  @GetMapping("/api/cartoes/{id}/transacoes")
  public ResponseEntity<?> consultaUltimasDezTransacoes(@PathVariable("id") @NotBlank String cartaoId) {

    List<EventoDeTransacao> listaTransacao =
            eventoRepository.findTop10ByCartao_IdOrderByEfetivadaEmDesc(cartaoId);

    if(listaTransacao.isEmpty())
      return ResponseEntity.status(HttpStatus.NOT_FOUND).body("O cartão informado não foi encontrado na base de dados.");

    return ResponseEntity.ok().body(listaTransacao);
  }
}
