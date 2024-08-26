package PI;

// Bruno Miguel Sarti Miranda

public class AdoDois {
    public static void main(String[] args) {
        Carros meuCarro = new Carros("Toyota", "Corolla", 2020);
        
        meuCarro.exibirDados();
        meuCarro.ligar();
        meuCarro.acelerar(15);
        meuCarro.acelerar(10);
        meuCarro.acelerar(30);
        meuCarro.desacelerar(20);
        meuCarro.exibirDados();
        meuCarro.desligar();
    }
}
