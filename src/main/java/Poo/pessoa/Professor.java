package Poo.pessoa;

public class Professor extends Pessoa {

    private double salario;
    private String materia;


    public Professor(String nome, String cpf, int idade, double salario, String materia) {
        super(nome, cpf, idade);
        this.salario = salario;
        this.materia = materia;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    @Override
    public void imprimirDadosPessoa(){

        super.imprimirDadosPessoa();
        System.out.println("<-----INFORMAÇÕES DO(A) PROFESSOR(A)----->");
        System.out.println("|Materia: " + materia);
        System.out.println("|Salario: " + salario);
        System.out.println("<---------------------------------->");

    }

}
