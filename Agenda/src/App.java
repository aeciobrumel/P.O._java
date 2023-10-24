public class App {
    public static void main(String[] args) throws Exception {
        Agenda agenda = new Agenda();
        Contato ctt = new Contato("carimbo", "456");
        // agenda.adiciona(new Contato(0, "cleber", "123", "email@email.com",
        // "10/10/1900"));
        agenda.adiciona(ctt);

    }

}
