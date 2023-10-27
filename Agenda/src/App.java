import java.time.LocalDate;

public class App {
    public static void main(String[] args) throws Exception {

        Agenda agenda = new Agenda();
        agenda.adiciona(new Contato("João", "123"));
        agenda.adiciona(new Contato("Maria", "456"));
        agenda.adiciona(new Contato(5, "Fulano", "789", "fulano@email.com", LocalDate.now()));

        System.out.println(agenda.exibe());
        System.out.println(agenda.buscaNome("João"));
        System.out.println(agenda.buscaTelefone("456"));
        System.out.println(agenda.buscaEmail("fulano@email.com"));

        System.out.println(agenda.remove(5));
    }

}
