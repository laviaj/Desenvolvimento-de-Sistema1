package supermercado;

/**
 *
 * @author 31704786
 */
public class Testa_supermercado {
    public static void main(String[] args) {
        int preço_total= 0;
        Caixa cx = new Caixa();
        Cliente cli = new Cliente();
        Loja lj = new Loja("nova cachoeira","pao de assucar" );
        TerminalVenda tv = new TerminalVenda("venda 1", 10);
        Dinheiro dn = new Dinheiro(10,"dinheiro",50);
        Cheque cq = new Cheque(10,"cheque", 50);
        Pagamento pg = new Pagamento(10,"dinhero",50);
        Produto pd = new Produto(230,10,30);
        Venda vd = new Venda (20/10/3,130);
        
        preço_total= pg.getQuantidade() * pd.getPreço_unidade();
        
                
        System.out.println("nome da loja: " +lj.getNome());
        System.out.println("Endereco loja: " +lj.getEndereco());
        System.out.println("nome da venda: " + tv.getVenda());
        System.out.println("preço da unidade: "+pd.getPreço_unidade());
        System.out.println("codigo do produto: "+pd.getCodigo());
        System.out.println("quantidade da compra: "+pd.getQuantidade());
        System.out.println("preço total da compra: "+ preço_total);
        System.out.println("tempo de venda: "+vd.getTempo());
        System.out.println("preço total da compra: "+pg.getPreço_total());
        System.out.println("troco da compra: " + tv.getTroco());
        
        
        
        
        
        
        
        
        
                
        
    }
}
