package br.com.zupacademy.romeu.transacao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;

@Component
public class ListenerDeTransacao {

  @Autowired
  EventoDeTransacaoRepository repository;

  private final Logger logger = LoggerFactory.getLogger(ListenerDeTransacao.class);

  @KafkaListener(topics = "${spring.kafka.topic.transactions}")
  public void ouvir(EventoDeTransacao eventoDeTransacao) {
    salvarTransacao(eventoDeTransacao);
  }

  @Transactional
  public void salvarTransacao(EventoDeTransacao eventoDeTransacao) {
    repository.save(eventoDeTransacao);
    logger.info("Transação ID " + eventoDeTransacao.getId() + " recebida e gravada com sucesso na base de dados.");
  }
}

