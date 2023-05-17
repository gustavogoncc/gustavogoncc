public class FilaDePedidos {
	private String[] pedidos;
	private int tamanho;
	private int inicio;
	private int  fim;
	
	public FilaDePedidos(int capacidade) {
		pedidos = new String[capacidade];
		tamanho = 0;
		inicio = 0;
		fim = -1;
	}
	public boolean estaVazia() {
		return tamanho == 0;
	}
	public boolean estaCheia() {
		return tamanho == pedidos.length;
	}
	public void adicionarPedido(String pedido) {
		if(estaCheia()) {
			System.out.println("A fila de pedidos está cheia. Não é possível adicionar mais pedidos");
			return;
		}
		fim =(fim+1) % pedidos.length;
		pedidos[fim] = pedido;
		tamanho++;
		System.out.println("Pedido adicionado: "+ pedido);
	}
	public String removerPedido() {
		if(estaVazia()) {
			System.out.println("A fila está vazia. Não há pedidos para remover.");
			return null;
		}
		String pedidoRemovido = pedidos[inicio];
		inicio = (inicio +1) % pedidos.length;
		tamanho--;
		System.out.println("Pedido removido: "+ pedidoRemovido);
		return pedidoRemovido;
	}
	public void listarPedidos() {
		if(estaVazia()) {
			System.out.println("A fila de pedidos está vazia.");
			return;
		}
		System.out.println("Pedidos na fila:");
		for(int i =0; i < tamanho; i++) {
			int index =(inicio + i) % pedidos.length;
			System.out.println(pedidos[index]);
		}
	}
	public static void main(String[]args) {
		FilaDePedidos fila = new FilaDePedidos(5);
		
		// Adicionando pedidos
		fila.adicionarPedido("Pizza - Mesa 1");
		fila.adicionarPedido("Hambúrguer - Mesa 2");
		fila.adicionarPedido("Sushi - Mesa 3");
		
		// Listando pedidos
		fila.listarPedidos();
		
		// Removendo pedidos
		fila.removerPedido();
		fila.removerPedido();
		
		// Listando pedidos novamente
		fila.listarPedidos();   
	}
	
}
