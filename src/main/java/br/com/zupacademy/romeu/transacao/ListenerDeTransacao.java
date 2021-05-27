package br.com.zupacademy.romeu.transacao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class ListenerDeTransacao {

  @Autowired
  EventoDeTransacaoRepository repository;

  @KafkaListener(topics = "${spring.kafka.topic.transactions}")
  public void ouvir(EventoDeTransacao eventoDeTransacao) {
    System.out.println(eventoDeTransacao);
    repository.save(eventoDeTransacao);
  }

}

