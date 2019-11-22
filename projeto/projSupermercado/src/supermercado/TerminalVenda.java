
package supermercado;

public class TerminalVenda {
    private String venda;
    private int troco;
    
    public TerminalVenda(String venda, int troco){
        this.troco = troco; this.venda = venda;
        
    }

    public String getVenda() {
        return venda;
    }

    public void setVenda(String venda) {
        this.venda = venda;
    }

    public int getTroco() {
        return troco;
    }

    public void setTroco(int troco) {
        this.troco = troco;
    }
    
}
