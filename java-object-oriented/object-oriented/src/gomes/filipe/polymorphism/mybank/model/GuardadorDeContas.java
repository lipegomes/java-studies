package gomes.filipe.polymorphism.mybank.model;

public class GuardadorDeContas {
	
	private Conta[] referencias;
	private int posicaoInicial;

	
	public GuardadorDeContas() {
		this.referencias = new Conta[10];
		this.posicaoInicial = 0;
	}


	public void adiciona(Conta referencia) {
		this.referencias[this.posicaoInicial] = referencia;
		this.posicaoInicial++;
		
	}


	public int getQuantidadeDeElementos() {
		return this.posicaoInicial;
	}


	public Conta getReferencia(int posicao) {
		return this.referencias[posicao];
	}
	
	
	


}
