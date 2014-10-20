package Maquinas;

/**
 * Created by Felipe Aguiar on 03/10/2014.
 */

public class Main
{
    public static void main(String args[]){
        Estoque estoque = new Estoque();

        estoque.placa.setQuantidade(10);

        estoque.demanda.setDemanda(30, 'P', 5, '1');

        estoque.placa.setQtdProduzir(3);

        MaqMolde maqMolde1 = new MaqMolde(estoque, 1);
        MaqMolde maqMolde2 = new MaqMolde(estoque, 2);
        MaqMolde maqMolde3 = new MaqMolde(estoque, 3);
        MaqMolde maqMolde4 = new MaqMolde(estoque, 4);
        MaqMolde maqMolde5 = new MaqMolde(estoque, 5);
        MaqMolde maqMolde6 = new MaqMolde(estoque, 6);
        MaqMolde maqMolde7 = new MaqMolde(estoque, 7);
        MaqMolde maqMolde8 = new MaqMolde(estoque, 8);
        MaqMolde maqMolde9 = new MaqMolde(estoque, 9);
        MaqMolde maqMolde10 = new MaqMolde(estoque, 10);

        maqMolde1.start();
        maqMolde2.start();
        maqMolde3.start();
        //maqMolde4.start();
        //maqMolde5.start();
        //maqMolde6.start();
        //maqMolde7.start();
        //maqMolde8.start();
        //maqMolde9.start();
        //maqMolde10.start();
    }
}
