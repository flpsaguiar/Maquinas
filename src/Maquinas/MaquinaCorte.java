/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Maquinas;

/**
 *
 * @author rfilev
 * Esta máquina pode funcionar da seguinte maneira
 * Um método que recebe tempo para ser colocado no sleep
 * É um processo servidor
 * Quando passa o tempo "tempo" devolve a quantidade de chapas cortadas (já no formato de dado)
 * 
 * sleep (depende do tipo de corte)
 *
 *  Molde Pequeno
    * No Frills - 0,1segundo por dado
    * LowQuality - 0,2s por dado
    * Hybrid - 0,5s por dado
    * 
 * Molde Grande:
 *  dobro do tempo para o dado equivalente
 *  Differentiation  - 2s por dado
 *  Focused Differentiation - 2s por dado.
 */

public interface MaquinaCorte
{
    public int producaoChapasSimples(int qtdeChapas, int tipo);
    public int producaoChapasQualidade(int qtdeChapas, int tipo);
    public int producaoChapasEspeciais(int qtdeChapas, int tipo);
    //public int consultaCicloProducão();
    //public void informarProdução();
    
}
