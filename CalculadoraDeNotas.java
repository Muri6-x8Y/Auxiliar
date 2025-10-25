public class CalculadoraDeNotas {

    private double[] notas;

    public CalculadoraDeNotas(double[] notas) {
        this.notas = notas;
    }

    public double calcularMedia() {
        double soma = 0;
        for (int i = 0; i < notas.length; i++) {
            soma += notas[i];
        }
        return soma / notas.length;
    }

    public String classificarAluno() {
        double media = calcularMedia();
        if (media >= 7){
            return "Aprovado";
        } else if (media >= 4){
            return "Recuperação";
        } else
            return "Reprovado";
    }

    public void exibirResultado(String nomeAluno) {
        System.out.println("Aluno: " + nomeAluno);
        System.out.println("Média: " + calcularMedia());
        System.out.println("Situação: " + classificarAluno());
    }

    public static void main(String[] args) {
        double[] notas = { 6.5, 7.0, 8.0, 9.5 };
        CalculadoraDeNotas c = new CalculadoraDeNotas(notas);
        c.exibirResultado("Lucas");
    }
}
