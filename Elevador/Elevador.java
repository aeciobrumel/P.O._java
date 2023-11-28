public class Elevador extends BaseElevador{

    public Elevador (int capacidade, int total_andares){
        setCapacidade(capacidade);
       setTotalAndares(total_andares);
       setAndarAtual(0);
    }

    @Override
    public void entra(int pessoas) {
       if (pessoas<(capacidade-pessoas_dentro)) {
        pessoas_dentro += pessoas;
       }else{
        pessoas_dentro = capacidade;
       }
       
    }

    @Override
    public void sai(int pessoas) {
       if (pessoas<pessoas_dentro) {
        pessoas_dentro -= pessoas;
       }else{
        pessoas_dentro = 0;
       }
    
    }

    @Override
    public void sobe() {
       if (andar_atual<=total_andares) {
         andar_atual+=1;
       }else{
        throw new UnsupportedOperationException("chegou ao topo");
       }    
    
    
    }

    @Override
    public void desce() {
    if (andar_atual>0) {
         andar_atual-=1;
       }else{
        throw new UnsupportedOperationException("chegou ao terreo");
       }    
    }

    @Override
    public void setAndarAtual(int andar) {

        this.andar_atual=andar;

    }

    @Override
    public int getAndarAtual() {
    return this.andar_atual; 
    }

    @Override
    public void setTotalAndares(int total) {
        this.total_andares = total;

    }

    @Override
    public int getTotalAndares() {
     return this.total_andares;
    }

    @Override
    public void setPessoasDentro(int npessoas) {
        this.pessoas_dentro = npessoas;
   
    }

    @Override
    public int getPessoasDentro() {
        return pessoas_dentro;
    }

    @Override
    public void setCapacidade(int capacidade) {
    this.capacidade = capacidade;
    
    }

    @Override
    public int getCapacidade() {
        return this.capacidade;
    }

}
