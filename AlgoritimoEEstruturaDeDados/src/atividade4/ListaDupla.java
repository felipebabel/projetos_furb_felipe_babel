package atividade4;

public class ListaDupla <T>{
	/*
	 *a) ListaDupla():construtor da classe. Deve estabelecer que a lista est� vazia; 
	 */
	
	private NoListaDupla<T> primeiro;
	
	public void setPrimeiro(NoListaDupla<T> primeiro) {
		this.primeiro = primeiro;
	}

	public ListaDupla() {
		
	}
	
	/*
	 *b) getPrimeiro(): m�todo getter da vari�vel primeiro; 
	 */
	
	public NoListaDupla<T> getPrimeiro(){
			return this.primeiro;
	}
	
	/*
	 *c) inserir(T): Deve armazenar o dado fornecido como argumento na estrutura de dados; 
	 */
	
	public void inserir(T valor) {
		NoListaDupla novo = new NoListaDupla<>();
		novo.setInfo(valor);
		novo.setProximo(getPrimeiro());
		novo.setAnterior(novo); // essa n�o sei
		this.primeiro = novo;
		
	}
	/*
	d) buscar(T): Deve procurar na lista encadeada se h� um n� cujo conte�do seja igual � vari�vel valor (utilizar 
	igualdade de valores). Caso seja localizado, dever� retornar este n� (objeto da classe NoListaDupla). Se n�o for 
	localizado, dever� retornar null;
	*/
	public NoListaDupla<T> buscar(T valor){
		NoListaDupla<T> p = this.primeiro;
		while(p!= null) {
			if(p.getInfo().equals(valor)) {
				return p;
			} else {
				p.getProximo();
			}
		}
		return  null;
	}
	/*
	 *e) retirar(T): Deve retirar um n� da lista que contenha o valor informado como par�metro para este m�todo; 
	 */
	
	public void retirar(T valor) {
		NoListaDupla<T> p = this.primeiro;
		
		while(p!=null) {
			if(p.getInfo().equals(valor)) {
				//apagar
			} else {
				
			}
		}
		//usar while
	}
	/*
	 * f) exibirOrdemInversa(): deve exibir o conte�do armazenado nos n�s da lista encadeada de forma que primeiro 
	seja exibido o valor do �ltimo n� da lista e por �ltimo seja exibido o valor do primeiro n� da lista. 
	 */
	
	public void exibirOrdemInversa() {
		
	}
	/*
	 * g) liberar(): Dever� limpar a estrutura de dados. Ao inv�s de simplesmente atribuir null para a vari�vel de 
	inst�ncia primeiro, remova todos os encadeamentos dos n�s, isto �, atribua null para a associa��o proximo e
	anterior em todos os n�s da lista;
	 */
	public void liberar() {
		
	}
	/*
	 * 	h) toString(): deve retornar os valores armazenados na lista, desde o primeiro n� at� o �ltimo, separando-os por 
	v�rgula.
	 */

	//public String toString() {
		
	//}
}
