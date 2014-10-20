package Maquinas;

/**
 * Created by Felipe Aguiar on 06/10/2014.
 */

public class MaqMolde extends Thread implements MaquinaMolde {
    Estoque estoque;
    private char tamanho;
    private int idMaquina;
    private int tipo;

    public MaqMolde(Estoque estoque, int idMaquina)
    {
        this.estoque = estoque;
        this.idMaquina = idMaquina;

        this.tamanho = estoque.demanda.getTamanho();
        this.tipo = estoque.demanda.getTipo();
    }

    public void run() {
        if(this.tamanho == 'P') {
            System.out.println("Moldes Produzidos: " + moldePequeno(2, this.tipo));
        }
        else if(this.tamanho == 'G') {
            System.out.println("Moldes Produzidos: " + moldeGrande(1, this.tipo));
        }
        else {
            System.out.println("Tamanho Indisponível");
        }
    }

    public int moldePequeno(int qtdeChapas, int tipo) {
        //estoque.placa.setQtdProduzir(qtdeChapas);
        while (estoque.placa.getPlaca() == 1) {
            if(tipo == 5) {
                estoque.moldePequeno5.incQuantidade();
                System.out.println("Maq: " + idMaquina + " Placa: " + estoque.placa.getQuantidade() +
                        " Molde pqno5: " + estoque.moldePequeno5.getQuantidade());
            }
            else if(tipo == 4) {
                estoque.moldePequeno4.incQuantidade();
                System.out.println("Maq: " + idMaquina + " Placa: " + estoque.placa.getQuantidade() +
                        " Molde pqno4: " + estoque.moldePequeno4.getQuantidade());
            }
            else {
                //placa utilizada retornada ao estoque
                estoque.placa.incQuantidade();
                System.out.println("Tipo Indisponível");
                return 0;
            }
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) { }
        }
        return estoque.placa.getQtdMoldeProduzido();
    }
    public int moldeGrande(int qtdeChapas, int tipo)
    {
        return 1;
    }
}

