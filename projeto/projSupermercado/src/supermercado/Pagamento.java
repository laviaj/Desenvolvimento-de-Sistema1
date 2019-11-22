
package supermercado;

public class Pagamento {
    private int quantidade;
    private String Forma_pagamento;
    private int preço_total;
    int pagar =0;
   
    
    public Pagamento (int quantidade,String Forma_pagamento,int preço_total){
         this.quantidade =quantidade; 
         this.Forma_pagamento = Forma_pagamento; 
         this.getPreço_total();
        
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
    public void pagar(){
        System.out.println("forma de pagamento:");
    }
    public int getPreço_total() {
        return preço_total;
    }

    public void setPreço_total(int preço_total) {
        this.preço_total = preço_total;
    }


}
