public class ListaCompras {
	private ArrayList<String> itens = new ArrayList<>();
	private ArrayList<Integer> quantidades = new ArrayList<>();
	
	
	public void AdicionarItem(String itens, int quantidades) {
		itens.add(item);
		quantidades.add(quantidade);
	}
	public void RemoverItem(String item) {
		int index = itens.indexOf(item);
		if(index != -1) {
			itens.remove(index);
			quantidades.remove(index);
		}	
	}
	
	public void ListarItens() {
		System.out.println(" A seguir a lista de itens necessária para comprar : ");
		for(int i = 0; i< itens.size(); i++ ) {
			System.out.println("-"+ itens.get(i)+ "(" + quantidades.get(i)+ ")");
		}
	}
	
	public static void main(String[]args) {
		ListaDeCompras lista= new ListaDeCompras();
		lista.adicionarItem("Macarrão",3);
		lista.adicionarItem("Carne bovina", 2);
		lista.adicionarItem("Batata Frita",1);
		lista.removerItem("Batata Frita");
		lista.listarItens();
	}

}
