
class Pedido {

    private String cliente;
    private String produto;
    private int quantidade;
    private double precoUnitario;
    private double total;

    public Pedido(String cliente, String produto, int quantidade, double precoUnitario) {
        this.cliente = cliente;
        this.produto = produto;
        this.quantidade = quantidade;
        this.precoUnitario = precoUnitario;
        this.total = quantidade * precoUnitario;
    }

    public String getCliente() {
        return cliente;
    }

    public String getProduto() {
        return produto;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}