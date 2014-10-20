package Maquinas;

/**
 * Created by Felipe Aguiar on 06/10/2014.
 */
public class Placa {
    private int quantidade;
    private static int qtdMoldeProduzido;
    private static int qtdProduzir;

    public Placa() {
        this.quantidade = 0;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
        this.qtdMoldeProduzido = 0;
        this.qtdProduzir = 0;
    }

    public void incQuantidade(){
        this.quantidade++;
    }

    public int getQtdMoldeProduzido(){
        return qtdMoldeProduzido;
    }

    public void setQtdProduzir(int qtdProduzir){
        this.qtdProduzir = qtdProduzir;
    }

    public int getQtdProduzir(){
        return this.qtdProduzir;
    }

    public int getQuantidade()
    {
        return this.quantidade;
    }

    public synchronized int getPlaca()
    {
        if (this.getQuantidade() <= 0  /*|| getQtdProduzir() == getQtdMoldeProduzido()*/) {
            return 0;
        }
        this.quantidade--;
        this.qtdProduzir--;
        this.qtdMoldeProduzido++;
        return 1;
    }
}
