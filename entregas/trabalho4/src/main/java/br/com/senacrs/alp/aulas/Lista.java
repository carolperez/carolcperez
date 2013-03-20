package br.com.senacrs.alp.aulas;

public interface Lista<T extends Object> { //interface define as assinaturas de métodos

	void adicionarFinal(T valor);

	void adicionarInicio(T valor);

	void adicionarPosicao(int posicao, T valor);

	T obterPrimeiro();
	
	T obterUltimo();
	
	T obterPosicao(int posicao);
	
	int obterTamanho();

	T removerPosicao(int posicao);
	
	void esvaziar();
}
