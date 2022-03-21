package atividade4;

public class ListaDupla <T>{
	/*
	 *a) ListaDupla():construtor da classe. Deve estabelecer que a lista está vazia; 
	 */
	
	private NoListaDupla<T> primeiro;
	
	public void setPrimeiro(NoListaDupla<T> primeiro) {
		this.primeiro = primeiro;
	}

	public ListaDupla() {
		
	}
	
	/*
	 *b) getPrimeiro(): método getter da variável primeiro; 
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
		novo.setAnterior(novo); // essa não sei
		this.primeiro = novo;
		
	}
	/*
	d) buscar(T): Deve procurar na lista encadeada se há um nó cujo conteúdo seja igual à variável valor (utilizar 
	igualdade de valores). Caso seja localizado, deverá retornar este nó (objeto da classe NoListaDupla). Se não for 
	localizado, deverá retornar null;
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
	 *e) retirar(T): Deve retirar um nó da lista que contenha o valor informado como parâmetro para este método; 
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
	 * f) exibirOrdemInversa(): deve exibir o conteúdo armazenado nos nós da lista encadeada de forma que primeiro 
	seja exibido o valor do último nó da lista e por último seja exibido o valor do primeiro nó da lista. 
	 */
	
	public void exibirOrdemInversa() {
		
	}
	/*
	 * g) liberar(): Deverá limpar a estrutura de dados. Ao invés de simplesmente atribuir null para a variável de 
	instância primeiro, remova todos os encadeamentos dos nós, isto é, atribua null para a associação proximo e
	anterior em todos os nós da lista;
	 */
	public void liberar() {
		
	}
	/*
	 * 	h) toString(): deve retornar os valores armazenados na lista, desde o primeiro nó até o último, separando-os por 
	vírgula.
	 */

	//public String toString() {
		
	//}
}
