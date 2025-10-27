// Representa um pedido feito por um cliente
class Pedido {

    private String cliente;
    private String produto;
    private int quantidade;
    private double precoUnitario;
    private double total;

    // Cria um novo pedido com cliente, produto, quantidade e preço unitário
    public Pedido(String cliente, String produto, int quantidade, double precoUnitario) {
        this.cliente = cliente;
        this.produto = produto;
        this.quantidade = quantidade;
        this.precoUnitario = precoUnitario;
        this.total = quantidade * precoUnitario;
    }

    // Retorna o nome do cliente
    public String getCliente() {
        return cliente;
    }

    // Retorna o nome do produto
    public String getProduto() {
        return produto;
    }

    // Retorna o valor total do pedido
    public double getTotal() {
        return total;
    }

    // Define um novo valor total para o pedido
    public void setTotal(double total) {
        this.total = total;
    }
}