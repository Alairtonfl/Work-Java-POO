package work;

import java.util.Scanner;

class Work {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x;
        Professor[] p = new Professor[100];
        Aluno[] a = new Aluno[100];
        Disciplina[] d = new Disciplina[100];
        /* Criei um vetor com 100 para cada um pois nao sabia se era necessario
        usar arraylist
         */

        //do while para o sistema so acabar quando o usuario desejar
        do {
            //menu pra ficar mais organizado
            System.out.println("-----------------MENU-----------------");
            System.out.println("Digite 1 para cadastrar um novo aluno:");
            System.out.println("Digite 2 para cadastrar um novo professor:");
            System.out.println("Digite 3 para cadastrar uma nova disciplina:");
            System.out.println("Digite 4 para listar os alunos:");
            System.out.println("Digite 5 para listar os professores:");
            System.out.println("Digite 6 para listar as disciplinas:");
            System.out.println("Digite qualquer outro numero pra sair");
            System.out.println("-----------------MENU-----------------");
            x = input.nextInt();
            switch (x) {
                case 1:
                    System.out.println("-------Cadastrar aluno-------");
                    a[Aluno.qtd] = Aluno.cadastrarAluno();
                    System.out.println("Tem professor responsavel?  digite 1 para sim");
                    int y = input.nextInt();
                    if (y == 1) {
                        p[Professor.pqtd] = Professor.cadastrarProfessor();
                        a[Aluno.qtd - 1].setOrientador(p[Professor.pqtd - 1]);
                    }
                    break;
                case 2:
                    System.out.println("-----Cadastrar professor-----");
                    p[Professor.pqtd] = Professor.cadastrarProfessor();
                    break;
                case 3:
                    System.out.println("-----Cadastrar disciplina-----");
                    d[Disciplina.dqtd] = Disciplina.cadastrarDisciplina();
                    System.out.println("Professor responsavel:");
                    p[Professor.pqtd] = Professor.cadastrarProfessor(); // chamada do metodo de cadastrar professor
                    d[Disciplina.dqtd - 1].setResponsavel(p[Professor.pqtd - 1]); // alterando na disciplina que inicialmente estava null
                    break;
                case 4:
                    Aluno.numAlunos(a);
                    break;
                case 5:
                    Professor.numProf(p);
                    break;
                case 6:
                    Disciplina.numDisc(d);
                    break;
            }
        } while (x > 0 && x < 7);

    }
}
