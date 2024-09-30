package br.com.lcassio;

public class SituacaoAluno {

    public static void main(String args[]) {
        double nota1 = 10.0;
        double nota2 = 10.0;
        double nota3 = 10.0;
        double nota4 = 10.0;

        double media = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.println("A média do aluno é: " + media);
    
        if (media < 5) {
            System.out.println("Aluno reprovado.");
        } else if (media >= 5 && media < 7) {
            System.out.println("Aluno de Recuperação.");
        } else if (media >= 7 && media <= 10) {
            System.out.println("Aluno aprovado.");
        } else {
            System.out.println("A média deve ser no mínimo 0 e no máximo 10. Por favor, verifique os dados novamente.");
        }
    }
}
