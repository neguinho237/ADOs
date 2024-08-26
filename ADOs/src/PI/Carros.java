package PI;

// Bruno Miguel Sarti Miranda

public class Carros {
  public String marca;
  public String modelo;
  public int anoF;
  public boolean ligado;
  public int velocidade;
  public int marcha;

    public Carros (String marca , String  modelo , int anoF ){
        this.marca = marca;
        this.modelo = modelo;
        this.anoF = anoF;
        this.ligado = false;
        this.velocidade = 0;
        this.marcha = 0;
    }

    public String getMarca(){
        return marca;
    }

    public void setMarca (String marca){
        this.marca = marca;
    }
    
    public String getModelo(){
        return modelo;
    }

    public void setModelo (String modelo){
        this.modelo = modelo;
    }
   
    public int getaAnoF(){
        return anoF;
    }

    public void setMarca (int anoF){
        this.anoF = anoF;
    }

    public void ligar (){
        if(ligado){
            ligado = true;
            System.out.println("O carro está ligado");
        }else{
            System.out.println("O carro ja está ligado");
        }
    }

    public void desligar(){
        if (ligado) {
            ligado = false;
            System.out.println("O carro está desligado");
        }else{
            System.out.println("O carro já está desligado");
        }
    }

    public void acelerar (int incremento){
        if(ligado){
            velocidade += incremento;
            System.out.println("O carro acelerou para " + velocidade + "km/h.");
        }else{
            System.out.println("Não é possivel acelerar. O carro está desligado");
        }
    }

    public void desacelerar (int decremento){
        if (ligado) {
            velocidade -= decremento;
            if (velocidade < 0) {
                velocidade = 0;
            }
            System.out.println("O carro desacelerou para " + velocidade + "km/h.");
        }else{
            System.out.println("Não é possivel desacelerar. O carro está desligado. ");
        }
    }

    public void mudarMarcha() {
        if (velocidade == 0) {
            marcha = 0;
        } else if (velocidade > 0 && velocidade <= 20) {
            marcha = 1;
        } else if (velocidade > 20 && velocidade <= 40) {
            marcha = 2;
        } else if (velocidade > 40 && velocidade <= 60) {
            marcha = 3;
        } else if (velocidade > 60 && velocidade <= 80) {
            marcha = 4;
        } else if (velocidade > 80 && velocidade <= 120) {
            marcha = 5;
        }
    }

    public void exibirDados() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano de Fabricação: " + anoF);
        System.out.println("Estado: " + (ligado ? "Ligado" : "Desligado"));
        System.out.println("Velocidade: " + velocidade + " km/h");
        System.out.println("Marcha: " + (marcha == 0 ? "Ponto Morto" : marcha + "ª Marcha"));
    }
}
