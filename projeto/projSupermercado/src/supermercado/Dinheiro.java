
package supermercado;


public class Dinheiro extends Pagamento{
    private int quantia;

    public Dinheiro(int quantidade,String Forma_pagamento, int preço_total) {
        super(quantidade, Forma_pagamento, preço_total);
    }

    public int getQuantia() {
        return quantia;
    }

    public void setQuantia(int quantidade) {
        this.quantia = quantidade;
    }
    
    public void Forma_pagamento(){
        System.out.println("pagamento por dinhero");
    }
    public void troco(){
        System.out.println("seu troco é:");
    }
}
