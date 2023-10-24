import java.util.ArrayList;

public class Agenda {

    private Contato contatoVazio = new Contato("", "");
    private ArrayList<Contato> contatos = new ArrayList<Contato>();
    private int qtdAgenda = contatos.size();

    public ArrayList<Contato> getContatos() {
        return contatos;
    }

    public void setContatos(ArrayList<Contato> contatos) {
        this.contatos = contatos;
    }

    public int getQtdAgenda() {
        return qtdAgenda;
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
        return contatoVazio;
    }

    public Contato buscaTelefone(String telefone) {
        for (Contato contato : contatos) {
            if (contato.getTelefone() == telefone) {
                return contato;
            }
        }
        return contatoVazio;
    }

    public Contato buscaEmail(String email) {
        for (Contato contato : contatos) {
            if (contato.getEmail() == email) {
                return contato;
            }
        }
        return contatoVazio;
    }

    public ArrayList<Contato> exibe() {
        return contatos;
    }

    @Override
    public String toString() {
        return "Agenda [contatos=" + contatos + ", contatoVazio=" + contatoVazio + ", qtdAgenda=" + qtdAgenda + "]";
    }

}
