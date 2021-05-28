package br.com.zupacademy.romeu.transacao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;

@Component
public class ListenerDeTransacao {

  @Autowired
  EventoDeTransacaoRepository repository;

  @KafkaListener(topics = "${spring.kafka.topic.transactions}")
  public void ouvir(EventoDeTransacao eventoDeTransacao) {
    System.out.println(eventoDeTransacao);
    salvarTransacao(eventoDeTransacao);
  }

  @Transactional
  public void salvarTransacao(EventoDeTransacao eventoDeTransacao) {
    repository.save(eventoDeTransacao);
  }

}

