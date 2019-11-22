
package supermercado;

public class Loja {
    private String endereco;
    private String nome;
    
    public Loja (String endereco, String nome){
       this.endereco = endereco; this.nome = nome; 
    
    } 

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
