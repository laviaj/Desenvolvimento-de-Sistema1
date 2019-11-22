
package supermercado;

public class Produto {
    private int codigo;
    private int quantidade;
    private int preço_unidade;
    
    
    public Produto(int codigo,int quantidade,int preço_unidade){
        this.codigo = codigo;
        this.preço_unidade =preço_unidade;
        this.quantidade = quantidade;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getPreço_unidade() {
        return preço_unidade;
    }

    public void setPreço_unidade(int preço_unidade) {
        this.preço_unidade = preço_unidade;
    }

}
