package atividade1felipe;
//felipe
//concluido: a,b,c,d,e,f,g,h,i,j,k+-
public class ListaEstatica {
	
	private int[] info;
	private int tamanho;

	public ListaEstatica(){
		info = new int[0];
	}
	public void redimencionar() {
		int[] info2 = new int[this.tamanho+10];
		for (int i = 0; i < info.length; i++) {
			info2[i] = info[i];
		}
		info = info2; // é so isso mesmo??
	}
	
	public void inserir(int valor) {
		if(tamanho>info.length) {
			redimencionar();
			info[tamanho]=valor;
		}
		info[tamanho] = valor;
		tamanho+=1; 
	}
	public void exibir() {
		for (int i = 0; i < info.length; i++) {
			System.out.println(info[i]);
		}
	}
	
	public int buscar(int valor) {
		for (int i = 0; i < info.length; i++) {
			if(info[i] == valor) {
				return i;
			}
		}
		return -1;
	}
	public void retirar(int valor) {
		int posicao = -1;
		for (int i = 0; i < info.length; i++) {
			if(info[i]==valor) {
				posicao = i;
				break;
			}
		}
		if(posicao !=-1) {
			for (int i = posicao; i < tamanho -1; i++) {
				info[i] = info[i+1];
			}
			tamanho--;
		}
	}
	public void liberar() {
		info = new int[10];
		tamanho =0;
	}
	public int obterElemento(int posicao)throws IndexOutOfBoundsException {
		
		if(posicao > this.tamanho || posicao < 0) {
			throw new IndexOutOfBoundsException("Posição não existe: " + posicao);
		} 
			return info[posicao];
	}
	
	public Boolean estaVazia() {
		
		if(this.tamanho==0) {
			return false;
		}
		return true;	
	}
	public int getElemento() {
		return this.tamanho;
	}
	@Override
	public String toString() {
		String str = "";
		for (int i = 0; i < info.length; i++) {
			str+=info[i]+",";
		}
		str = str.substring(0, str.length() -1);//não entendi o que isso faz
         return str;
	}
	
	
}
