import java.util.ArrayList;
import java.util.List;

public class SistemaPedidos {

    private List<Pedido> pedidos = new ArrayList<>();
    private double totalGeral = 0;

    // Adiciona um novo pedido e soma seu valor ao total geral
    public void adicionarPedido(String cliente, String produto, int quantidade, double precoUnitario) {
        Pedido p = new Pedido(cliente, produto, quantidade, precoUnitario);
        pedidos.add(p);
        totalGeral += p.getTotal();
        System.out.println("Pedido adicionado: " + produto + " - Total: R$" + p.getTotal());
    }

    // Busca e mostra todos os pedidos feitos por um cliente específico
    public void buscarPedidoPorCliente(String nome) {
        for (Pedido p : pedidos) {
            if (p.getCliente().equalsIgnoreCase(nome)) {
                System.out.println("Encontrado: " + p.getProduto() + " - Total: R$" + p.getTotal());
            }
        }
    }

    // Lista todos os pedidos cadastrados no sistema
    public void listarPedidos() {
        for (Pedido p : pedidos) {
            System.out.println(p.getCliente() + " - " + p.getProduto() + " - Total: R$" + p.getTotal());
        }
    }

    // Calcula a média dos valores dos pedidos
    public double calcularMediaPedidos() {
        if (pedidos.isEmpty()) return 0;
        double soma = 0;
        for (Pedido p : pedidos) {
            soma += p.getTotal();
        }
        return soma / pedidos.size();
    }

    // Aplica um desconto percentual em todos os pedidos
    public void aplicarDesconto(double percentual) {
        for (Pedido p : pedidos) {
            double novoTotal = p.getTotal() - (p.getTotal() * percentual / 100);
            p.setTotal(novoTotal);
        }
        System.out.println("Desconto aplicado de " + percentual + "%!");
    }

    // Executa o sistema de pedidos com alguns exemplos
    public static void main(String[] args) {
        SistemaPedidos sistema = new SistemaPedidos();

        sistema.adicionarPedido("Ana", "Notebook", 1, 3500.0);
        sistema.adicionarPedido("Carlos", "Mouse", 2, 80.0);
        sistema.adicionarPedido("Ana", "Monitor", 1, 1200.0);

        sistema.listarPedidos();
        System.out.println("Média dos pedidos: R$" + sistema.calcularMediaPedidos());
        sistema.buscarPedidoPorCliente("Ana");
        sistema.aplicarDesconto(10);
    }
}