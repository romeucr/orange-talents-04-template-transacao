package br.com.zupacademy.romeu.transacao;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EventoDeTransacaoRepository extends JpaRepository<EventoDeTransacao, String> {
}
