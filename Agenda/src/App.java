import java.time.LocalDate;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leia = new Scanner(System.in);
        Agenda agenda = new Agenda();

        int op;
        String nome;
        String telefone;
        String email;
        int id;
        do {

            System.out.println("-----menu----");
            System.out.println("1 - inserir contato");
            System.out.println("2 - exibir tudo");
            System.out.println("3 - buscar nome");
            System.out.println("4 - buscar telefone");
            System.out.println("5 - buscar email");
            System.out.println("6 - remover pelo id");
            System.out.println("0 - sair");
            System.out.println(" insira aqui: ");
            op = leia.nextInt();
            switch (op) {
                case 1:
                    System.out.println("1 - contato basico | 2 - contato completo ");
                    int op2;
                    op2 = leia.nextInt();
                    if (op2 == 1) {

                        System.out.println("insira um nome:");
                        nome = leia.next();
                        System.out.println("insira um telefone:");
                        telefone = leia.next();
                        agenda.adiciona(new Contato(nome, telefone));

                    } else {
                        System.out.println("insira um id:");
                        int id2 = leia.nextInt();
                        System.out.println("insira um nome:");
                        nome = leia.next();
                        System.out.println("insira um telefone:");
                        telefone = leia.next();
                        System.out.println("insira um email:");
                        email = leia.next();
                        int dia, mes, ano;

                        System.out.println("insira o ano que voce nasceu:");
                        ano = leia.nextInt();

                        System.out.println("insira o mes que voce nasceu:");
                        mes = leia.nextInt();

                        System.out.println("insira o dia que voce nasceu:");
                        dia = leia.nextInt();

                        agenda.adiciona(new Contato(id2, nome, telefone, email, LocalDate.of(ano, mes, dia)));
                    }

                    break;
                case 2:
                    System.out.println(agenda.exibe());

                    break;
                case 3:
                    System.out.println("insira um nome:");
                    nome = leia.next();
                    System.out.println(agenda.buscaNome(nome));

                    break;
                case 4:
                    System.out.println("insira um telefone:");
                    telefone = leia.next();
                    System.out.println(agenda.buscaTelefone(telefone));

                    break;
                case 5:
                    System.out.println("insira um email:");
                    email = leia.next();
                    System.out.println(agenda.buscaEmail(email));
                    break;
                case 6:
                    System.out.println("insira o id do contato a ser removido:");
                    id = leia.nextInt();

                    System.out.println(agenda.remove(id));

                    break;

                case 0:
                    System.out.println("bye");
                    break;
                default:

                    break;
            }

        } while (op != 0);
        leia.close();
    }

}
