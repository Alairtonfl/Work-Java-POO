package work;
//Classe das disciplinas

import java.util.Scanner;

public class Disciplina {

    private String nome;
    private int codigo;
    private String ementa;
    private int ch;
    Professor responsavel; //Composição da classe Professor
    static int dqtd; //flag pra contar a quantidade de disciplinas cadastradas

    public Disciplina(String nome, int codigo, String ementa, int ch, Professor responsavel) {
        this.nome = nome;
        this.codigo = codigo;
        this.ementa = ementa;
        this.ch = ch;
        this.responsavel = responsavel;
        dqtd++; //incremento a cada disciplina cadastrada
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getEmenta() {
        return ementa;
    }

    public void setEmenta(String ementa) {
        this.ementa = ementa;
    }

    public int getCh() {
        return ch;
    }

    public void setCh(int ch) {
        this.ch = ch;
    }

    public Professor getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(Professor responsavel) {
        this.responsavel = responsavel;
    }

    //Metodo estatico para mostrar as discplinas cadastradas
    static void numDisc(Disciplina d[]) {
        System.out.println("------Lista de Disciplinas:------");
        for (int i = 0; i < dqtd; i++) {
            System.out.println("Disciplina: " + d[i].getNome() + " Professor: " + d[i].responsavel.getNome());

        }
        System.out.println("---------------------------------");
    }

    public static Disciplina cadastrarDisciplina() {

        Scanner input = new Scanner(System.in);
        System.out.println("Ementa da disciplina");
        String ementa = input.nextLine();
        System.out.println("Digite o nome");
        String nome = input.nextLine();
        System.out.println("Digite o codigo da disciplina");
        int cod = input.nextInt();
        System.out.println("Digite a carga horaria:");
        int cht = input.nextInt();

        Disciplina disciplina = new Disciplina(nome, cod, ementa, cht, null);
        return disciplina;
    }

}
