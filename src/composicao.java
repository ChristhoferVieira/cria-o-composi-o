/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author christhofer.vieira
 */
public class composicao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //1º 
        /*    carro carro = new carro();
        carro carro2 = new carro (2000);
         */
        //2°
        /*carro carro3 = new carro();
        carro3.ligarCarro(2000);
         */

        //3°
        carro carro4 = new carro(0);
        motor motor = new motor();
        motor motor2 = new motor(2000);

        carro4.setMotor(motor);
        
        carro4.ImprimeDados();
    }

}
