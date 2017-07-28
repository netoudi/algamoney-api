package com.algaworks.algamoneyapi.repository.lancamento;

import java.util.List;

import com.algaworks.algamoneyapi.model.Lancamento;
import com.algaworks.algamoneyapi.repository.filter.LancamentoFilter;

public interface LancamentoRepositoryQuery {

	List<Lancamento> filtrar(LancamentoFilter lancamentoFilter);

}
