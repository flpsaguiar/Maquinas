package Maquinas;

/**
 * Created by Felipe Aguiar on 06/10/2014.
 */

public class MaqMolde extends Thread implements MaquinaMolde
{
    Estoque estoque;
    private char tamanho;
    private int idMaquina;
    public MaqMolde(Estoque estoque, int idMaquina)
    {
        this.estoque = estoque;
        this.idMaquina = idMaquina;
        this.tamanho = estoque.getTamanho();
    }

    public void run()
    {
        if(this.tamanho == 'P')
            while (estoque.placa.getQuantidade() > 0)
            {
                if (estoque.placa.getPlaca() == 1) {
                    estoque.moldePequeno.incQuantidade();
                    System.out.println("Maq: " + idMaquina + " Placa: " + estoque.placa.getQuantidade() +
                            " Molde pqno: " + estoque.moldePequeno.getQuantidade());
                    try {
                        //sleep((int)(Math.random() * 500));
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                    }


                }
            //System.out.println("Maquina " + idMaquina + " produz");
            //System.out.println("Estoque total de Moldes pequenos: " + estoque.moldePequeno.getQuantidade());
            //System.out.println("Estoque total de Placas: " + estoque.placa.getQuantidade());
            }


        /*
        else if(this.tamanho == 'G')
        {
            while (estoque.placa.getQuantidade() > 0)
            {
                if(estoque.placa.getPlaca() == 1) {
                    estoque.moldeGrande.incQuantidade();
                    System.out.println("Maq: " + idMaquina + " Placa: " + estoque.placa.getQuantidade() +
                            " Molde grande: " + estoque.moldeGrande.getQuantidade());
                    try {
                        sleep((int)(Math.random() * 500));
                        //Thread.sleep(1000);
                    } catch (InterruptedException e) { }
                }
            }
        }
        */

    }


    public int moldePequeno(int qtdeChapas, int tempo)
    {
        return 1;
    }
    public int moldeGrande(int qtdeChapas, int tempo)
    {
        return 1;
    }
}
