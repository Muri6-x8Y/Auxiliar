/*
 * CalculadoraDeNotas.java
 * 
 * Uma classe que calcula a média das notas de um aluno e classifica seu desempenho.
 */

public class CalculadoraDeNotas {

    private double[] notas;

    /*
     * Construtores que inicializam o array de notas
     */
    public CalculadoraDeNotas(double[] notas) {
        this.notas = notas;
    }

    public CalculadoraDeNotas() {

    }

    /*
     * Método para validar as notas (não podem ser negativas)
     */
    private boolean validarNotas(double[] notas) {
        for (double nota : notas) {
            if (nota < 0) {
                return false;
            }       
        }
        return true;
    }
    

    /*
     * Método para calcular a média das notas e impedir que tenham notas negativas
     */
    public double calcularMedia() {
        double soma = 0;
        if(validarNotas(notas) == false){
            return 0;
        }
        try {
            if (notas.length == 0) {
                throw new ArithmeticException("Array de notas vazio.");
            }
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            return 0;
        }
        
        for (int i = 0; i < notas.length; i++) {
            soma += notas[i];
        }
        return soma / notas.length;
    }

    /*
     * Método para classificar o aluno com base na média
     */
    public String classificarAluno() {
        double media = calcularMedia();
        if (media >= 7){
            return "Aprovado";
        } else if (media >= 4){
            return "Recuperação";
        } else{
            return "Reprovado";
        }
    }

    /*
     * Método para exibir o resultado final
     */
    public void exibirResultado(String nomeAluno) {
        System.out.println("Aluno: " + nomeAluno);
        System.out.println("Média: " + calcularMedia());
        System.out.println("Situação: " + classificarAluno());
    }

    /*
     * Método principal para testar a classe
     */
    public static void main(String[] args) {
        double[] notas = {6.5, 7.0, 8.0, 9.5};
        CalculadoraDeNotas c = new CalculadoraDeNotas(notas);
        c.exibirResultado("Lucas");
    }
}