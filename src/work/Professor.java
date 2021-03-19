package work;

import java.util.Scanner;

public class Professor extends Pessoa {

    private String departamento;
    private String matricula;
    static int pqtd; //flag pra contar a quantidade de professores cadastrados

    public Professor(String nome, String data, String departamento, String matricula, String user, String senha) {
        super(nome, data, user, senha);
        this.departamento = departamento;
        this.matricula = matricula;

    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    //Metodo estatico para mostrar os Professores cadastrados
    static void numProf(Professor p[]) {
        System.out.println("------Lista de Professores:------");
        for (int i = 0; i < pqtd; i++) {
            System.out.println("Professor: " + p[i].getNome() + "  Matricula: " + p[i].getMatricula());
        }
        System.out.println("---------------------------------");
    }

    public static Professor cadastrarProfessor() {
        pqtd++; //incremento a cada professor cadastrado
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o nome");
        String nome = input.nextLine();
        System.out.println("Digite a data: obs formato dd/mm/aa");
        String data = input.nextLine();
        System.out.println("Digite um usuario:");
        String user = input.nextLine();
        System.out.println("Digite uma senha:");
        String senha = input.nextLine();
        System.out.println("Digite o numero da matricula:(SIAPE 7 digitos)");
        String mat = input.nextLine();
        System.out.println("Digite o departamento:");
        String dep = input.nextLine();

        Professor professor = new Professor(nome, data, dep, mat, user, senha);
        return professor;
    }

}
