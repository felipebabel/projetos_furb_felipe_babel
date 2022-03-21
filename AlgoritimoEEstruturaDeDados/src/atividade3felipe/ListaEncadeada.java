package teste;

public class ListaEncadeada <T> {
	
	private NoLista<T> primeiro;
	
	public NoLista<T> getPrimeiro() {
		return primeiro;
	}

	public void setPrimeiro(NoLista<T> primeiro) {
		this.primeiro = primeiro;
	}

	public ListaEncadeada() {
		
	}
	
	public void inserir(T info) {
		NoLista<T> novo = new NoLista<>();
		novo.setInfo(info);
		novo.setProximo(getPrimeiro());
		this.primeiro = novo;
	}
	
	public boolean estaVazia() {
		return this.primeiro == null;
	}
	
	public NoLista<T> buscar(T valor){
		NoLista<T> p = this.primeiro;
		while(p != null) {
			if(p.getInfo().equals(valor)) {
				return p;
				
			} else {
				p = p.getProximo();
			}
		}
		return null;
	}
	
	public void retirar(T valor) {
		NoLista<T> anterior = null;
		NoLista<T> p = primeiro;
		
		while((p!=null) && (!p.getInfo().equals(valor))) {
			anterior = p;
			p = p.getProximo();
		}
		
		if(p !=null) {
			if(p==primeiro) {
				primeiro = primeiro.getProximo();
			} else {
				anterior.setProximo(p.getProximo());
			}
		}
		
		
	}
	
	public int obterComprimento() {
		int qtdsNos=0;
		NoLista<T> p = primeiro;
		while(p!=null) {
			qtdsNos++;
			p = p.getProximo();
		}
		return qtdsNos;
	}
	
	public NoLista<T> obterNo(int idx){
		if(idx<0 || idx > obterComprimento()) {
			throw new IndexOutOfBoundsException();
		}
		NoLista<T> p = getPrimeiro();
		
		while((p!=null) && (idx>0)) {
			idx--;
			p = p.getProximo();
		}
		
		if(p==null) {
			throw new IndexOutOfBoundsException();
		}
		return p;
	}
	
	public String toString() {
		String resultado = "";
		NoLista<T> p = primeiro;
		
		while(p!=null) {
			if(p!=primeiro) {
				resultado+=",";
			}
			resultado +=p.getInfo().toString();
			p = p.getProximo();
		}
		return resultado;
	}
	
}


