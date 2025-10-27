#  Calculadora de Notas

Uma aplicação simples em **Java** que calcula a média das notas de um aluno e classifica seu desempenho como **Aprovado**, **Recuperação** ou **Reprovado**.

---

##  Descrição

A classe `CalculadoraDeNotas` recebe um vetor de notas e realiza:

- Cálculo da **média** das notas;
- Classificação do aluno conforme a média;
- Exibição do resultado formatado no console.

---

##  Lógica de Classificação


| Média         | Situação     |
|---------------|--------------|
| ≥ 7.0         |  Aprovado    |
| ≥ 4.0 e < 7.0 |  Recuperação |
| < 4.0         |  Reprovado   |



##  Exemplo de uso

```java
public static void main(String[] args) {
    double[] notas = { 6.5, 7.0, 8.0, 9.5 };
    CalculadoraDeNotas c = new CalculadoraDeNotas(notas);
    c.exibirResultado("Lucas");
}
```
---

# Sistema de Pedidos em Java

Este projeto é uma simulação simples de um sistema de gerenciamento de pedidos desenvolvido em Java.  
O programa permite registrar pedidos de clientes, listá-los, buscar por cliente, calcular a média dos valores e aplicar descontos.

---

## Estrutura do Projeto

O projeto contém duas classes principais:

### Pedido.java
Representa um pedido individual feito por um cliente.

A classe armazena:
- Nome do cliente  
- Produto comprado  
- Quantidade  
- Preço unitário  
- Valor total do pedido  

Métodos principais:
- `getCliente()` — retorna o nome do cliente  
- `getProduto()` — retorna o nome do produto  
- `getTotal()` — retorna o valor total do pedido  
- `setTotal(double total)` — altera o valor total do pedido  

---

### SistemaPedidos.java
Gerencia uma lista de pedidos e realiza operações sobre eles.

Funções principais:
- **adicionarPedido(...)** — adiciona um novo pedido e soma seu valor ao total geral  
- **buscarPedidoPorCliente(nome)** — mostra todos os pedidos de um cliente específico  
- **listarPedidos()** — exibe todos os pedidos registrados  
- **calcularMediaPedidos()** — calcula a média dos valores dos pedidos  
- **aplicarDesconto(percentual)** — aplica um desconto percentual em todos os pedidos  
- **main()** — contém exemplos de uso das funcionalidades do sistema  

---

## Exemplo de Saída