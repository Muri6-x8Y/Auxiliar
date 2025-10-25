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

