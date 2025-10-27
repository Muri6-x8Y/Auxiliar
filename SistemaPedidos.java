import java.util.ArrayList;
import java.util.List;

public class SistemaPedidos {

    private List<Pedido> pedidos = new ArrayList<>();
    private double totalGeral = 0;

    public void adicionarPedido(String cliente, String produto, int quantidade, double precoUnitario) {
        Pedido p = new Pedido(cliente, produto, quantidade, precoUnitario);
        pedidos.add(p);
        totalGeral += p.getTotal();
        System.out.println("Pedido adicionado: " + produto + " - Total: R$" + p.getTotal());
    }
    
    public void buscarPedidoPorCliente(String nome) {
        for (Pedido p : pedidos) {
            if (p.getCliente().equalsIgnoreCase(nome)) {
                System.out.println("Encontrado: " + p.getProduto() + " - Total: R$" + p.getTotal());
            }
        }
    }

    public void listarPedidos() {
        for (int i = 0; i < pedidos.size(); i++) {
            Pedido p = pedidos.get(i);
            System.out.println(p.getCliente() + " - " + p.getProduto() + " - Total: R$" + p.getTotal());
        }
    }

    public double calcularMediaPedidos() {
        if (pedidos.isEmpty()) return 0;
            double soma = 0;
        for (Pedido p : pedidos) {
            soma += p.getTotal();
        }
        return soma / pedidos.size();
    }

    public void aplicarDesconto(double percentual) {
        for (Pedido p : pedidos) {
            double novoTotal = p.getTotal() - (p.getTotal() * percentual / 100);
            p.setTotal(novoTotal);
        }
        System.out.println("Desconto aplicado de " + percentual + "%!");
    }

    public static void main(String[] args) {
        SistemaPedidos sistema = new SistemaPedidos();
        sistema.adicionarPedido("Ana", "Notebook", 1, 3500.0);
        sistema.adicionarPedido("Carlos", "Mouse", 2, 80.0);
        sistema.adicionarPedido("Ana", "Monitor", 1, 1200.0);

        sistema.listarPedidos();
        System.out.println("Média dos pedidos: " + sistema.calcularMediaPedidos());
        sistema.buscarPedidoPorCliente("Ana");
        sistema.aplicarDesconto(10);
    }
}

