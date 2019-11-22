
package supermercado;

public class Venda {
    private int data;
    private int tempo;
    
    public Venda(int data, int tempo){
        this.data = data; this.tempo =tempo;
    }
            

    public int getVenda() {
        return data;
    }

    public void setVenda(String venda) {
        this.data = data;
    }

    public int getTempo() {
        return tempo;
    }

    public void setTempo(int tempo) {
        this.tempo = tempo;
    }     
    
}
