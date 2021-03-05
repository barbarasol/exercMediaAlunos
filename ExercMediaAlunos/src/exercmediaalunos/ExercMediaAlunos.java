package exercmediaalunos;

import java.util.Scanner;

public class ExercMediaAlunos {

    public static void main(String[] args) {
        Scanner tecla = new Scanner (System.in);
        final int numAlunos = 2;
        String[] nomeAlunos = new String[numAlunos];
        final int numBimestres = 4;
        final double notaMinima = 7;
        double[][] notaAlunos = new double[numAlunos][numBimestres];
        double[] mediaAlunos = new double[numAlunos];
        for(int i=0; i<numAlunos; i++){
           System.out.println("Informe o nome do " + (i+1)+ "º aluno.");
           nomeAlunos[i] = tecla.nextLine();
        }
        for (int i=0; i<numAlunos; i++){
            for(int j=0; j<numBimestres; j++){
                System.out.println("Informe a nota do aluno " + nomeAlunos[i] + " no " + (j+1)+ "º Bimestre:");
                notaAlunos[i][j] = tecla.nextDouble();
                            }
        }
        for (int i=0; i<numAlunos; i++){
            for(int j=0; j<numBimestres; j++){
              mediaAlunos[i]+= notaAlunos[i][j];
            }
            mediaAlunos[i]/=numBimestres;
        }
        System.out.println("======= Resultado Final =======");
        for (int i=0; i<numAlunos; i++){
            if (mediaAlunos[i]>=notaMinima){
                System.out.println("Nome: "+nomeAlunos[i]+"  Média: "+mediaAlunos[i]+ " Situação: Aprovado!");
            }else{
                System.out.println("Nome: "+nomeAlunos[i]+"  Média: "+mediaAlunos[i]+ " Situação: Reprovado!");
            }
        }        
    }
}
