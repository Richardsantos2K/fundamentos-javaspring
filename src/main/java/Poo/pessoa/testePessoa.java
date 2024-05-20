package Poo.pessoa;

public class testePessoa {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Carlos", "333.222.111-0", 17);

        /**pessoa.cpf = "333.222.111-0";
        pessoa.nome = "Carlos";
        pessoa.idade = 35;**/

        Professor professora = new Professor("Marta", "111.222.333-4", 35, 1200.00, "Português");



        professora.imprimirDadosPessoa();

    }
}
