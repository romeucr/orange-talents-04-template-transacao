package br.com.zupacademy.romeu.transacao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface EventoDeTransacaoRepository extends JpaRepository<EventoDeTransacao, String> {

  List<EventoDeTransacao> findTop10ByCartao_IdOrderByEfetivadaEmDesc(String cartaoId);
}
