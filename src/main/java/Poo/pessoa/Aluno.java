package Poo.pessoa;

import java.sql.SQLOutput;

public class Aluno extends Pessoa{

    private String matricula;
    private boolean anlmatricula;
    private String serie;


    public Aluno(String nome, String cpf, int idade, String matricula, boolean anlmatricula, String serie) {
        super(nome, cpf, idade);
        this.matricula = matricula;
        this.anlmatricula = false;
        this.serie = null;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public boolean isAnlmatricula() {
        return anlmatricula;
    }

    public void setAnlmatricula(boolean anlmatricula) {
        this.anlmatricula = anlmatricula;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public void matricular(){
            System.out.println("Você sera matriculado");
            anlmatricula = true;
            System.out.println("Você foi matriculado com sucesso");
            System.out.println("<-----STATUS DA MATRICULA---->");
            System.out.println("|Status " + anlmatricula);
            System.out.println("| Matriculado no: " + serie);
            System.out.println("<---------------------------->");
    }

    public void desmatricular(){
        if (anlmatricula == true){
            anlmatricula = false;
            serie = null;
            System.out.println("Aluno desmatriculado com sucesso");
            System.out.println("<-----STATUS DA MATRICULA---->");
            System.out.println("|Status " + anlmatricula);
            System.out.println("<---------------------------->");
        }else{
            System.out.println("Você não consta nos registros");
            System.out.println("<-----STATUS DA MATRICULA---->");
            System.out.println("|Status " + anlmatricula);
            System.out.println("| Matriculado no: " + serie);
            System.out.println("<---------------------------->");
        }
    }

    @Override
    public void imprimirDadosPessoa(){
        System.out.println("<-----INFORMAÇÕES DO(A) ALUNO(A)----->");
        super.imprimirDadosPessoa();
        System.out.println("| Numero de matricula: " + matricula);
        System.out.println("| Status da matricula: " + anlmatricula);
        System.out.println("| Serie: " + serie + " Ano");
    }

}
