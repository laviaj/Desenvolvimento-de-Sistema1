
package supermercado;

public class Cheque extends Pagamento {
    private String banco;
    private int numero_cheque;
    private int numero_compra;

    public Cheque(int quantidade,String Forma_pagamento, int preço_total) {
        super(quantidade, Forma_pagamento, preço_total);
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public int getNumero_cheque() {
        return numero_cheque;
    }

    public void setNumero_cheque(int numero_cheque) {
        this.numero_cheque = numero_cheque;
    }

    public int getNumero_compra() {
        return numero_compra;
    }

    public void setNumero_compra(int numero_compra) {
        this.numero_compra = numero_compra;
    }
    
    public void Forma_pagamento(){
        System.out.println("pagamento por cheque");
    }
}

