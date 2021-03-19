package work;

import java.util.Scanner;

public class Aluno extends Pessoa {

    private String curso;
    private double entrada;
    private String matricula;
    Professor orientador; // composição da classe professor
    static int qtd; //flag pra contar a quantidade de alunos cadastrados

    public Aluno() {

    }

    public Aluno(String curso, double entrada, String matricula, Professor orientador, String nome, String data, String user, String senha) {
        super(nome, data, user, senha);
        this.curso = curso;
        this.entrada = entrada;
        this.matricula = matricula;
        this.orientador = orientador;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double getEntrada() {
        return entrada;
    }

    public void setEntrada(double entrada) {
        this.entrada = entrada;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Professor getOrientador() {
        return orientador;
    }

    public void setOrientador(Professor orientador) {
        this.orientador = orientador;
    }

    //Metodo estatico para mostrar os Alunos cadastrados
    static void numAlunos(Aluno a[]) {
        System.out.println("------Lista de Alunos:------");
        for (int i = 0; i < qtd; i++) {
            System.out.println(a[i].getNome());
        }
        System.out.println("----------------------------");
    }

    public static Aluno cadastrarAluno() {
        qtd++; //incremento a cada professor cadastrado
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o nome");
        String nome = input.nextLine();
        System.out.println("Digite a data: obs formato dd/mm/aa");
        String data = input.nextLine();
        System.out.println("Digite um usuario:");
        String user = input.nextLine();
        System.out.println("Digite uma senha:");
        String senha = input.nextLine();
        System.out.println("Digite o curso:");
        String curso = input.nextLine();
        System.out.println("Digite o numero da matricula:");
        String mat = input.nextLine();
        System.out.println("Digite o perido de entrada:");
        double periodo = input.nextDouble();

        Aluno aluno = new Aluno(curso, periodo, mat, null, nome, data, user, senha);
        return aluno;
    }

}
