package model.beam;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Edson
 */
public class Pagamento {
    private final String numeroCartao;
    
    private Pagamento_forma pagamento_forma;
    
    
    
    public Pagamento(String numeroCartao){
            this.numeroCartao = numeroCartao;
            
    }
            
    public void setPagamento_forma(Pagamento_forma pagamento_forma) {
    this.pagamento_forma = pagamento_forma;
    
    }
      
    public String verPagamento_forma(){
    return pagamento_forma.pagamento_forma();
    }
}
