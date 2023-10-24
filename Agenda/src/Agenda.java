import java.util.ArrayList;

public class Agenda {

    ArrayList<Contato> contatos;
    Contato contatoBranco = new Contato("", "");
    int qtdAgenda = 0;

    public Agenda() {
    }

    public ArrayList<Contato> getContatos() {
        return contatos;
    }

    public void setContatos(ArrayList<Contato> contatos) {
        this.contatos = contatos;
    }

    public int getQtdAgenda() {
        return qtdAgenda;
    }

    public void setQtdAgenda(int qtdAgenda) {
        this.qtdAgenda = qtdAgenda;
    }

    public void adiciona(Contato contato) {
        contatos.add(contato);
        qtdAgenda++;
    }

    public boolean remove(int id) {
        for (int i = 0; i <= contatos.size(); i++) {
            if (contatos.get(i).getID() == id) {
                contatos.remove(i);
                qtdAgenda--;
                return true;
            }
        }
        return false;
    }

    public Contato buscaNome(String nome) {
        for (Contato contato : contatos) {
            if (contato.getNome() == nome) {
                return contato;
            }
        }
        return contatoBranco;
    }

    public Contato buscaTelefone(String telefone) {
        for (Contato contato : contatos) {
            if (contato.getTelefone() == telefone) {
                return contato;
            }
        }
        return contatoBranco;
    }

    public Contato buscaEmail(String email) {
        for (Contato contato : contatos) {
            if (contato.getEmail() == email) {
                return contato;
            }
        }
        return contatoBranco;
    }

    public ArrayList<Contato> exibe() {
        return contatos;
    }
}
