package Aula02;
public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;

    void status(){
        System.out.print(" modelo " + this.modelo);
        System.out.print(" uma caneta " + this.cor);
        System.out.print(" ponta " + this.ponta);
        System.out.print(" carga " + this.carga);
        System.out.print(" esta tampada?" + this.tampada);
    }
    void rabiscar(){
        if (this.tampada == true) {
            System.out.println("não posso rabiscar");
        }   
        else {
            System.out.println("rabiscando");
        }

    }
    void tampar(){
        this.tampada = true;

    }
    void destampar(){
        this.tampada = false;

    }
}