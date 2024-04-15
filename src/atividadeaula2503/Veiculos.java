package atividadeaula2503;

public class Veiculos {
    private String marca;
    private String modelo;
    private String cor;
    private int ano;

    public String getMarca(){
        return marca;
    }

    public String getModelo() {
        return modelo;
    }
    public String getCor(){
        return cor;
    }
    public int getAno(){
        return ano;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public void setCor(String Cor){
        this.cor = cor;
    }
    public void setAno(int ano){
        this.ano = ano;
    }

    public Veiculos(String marca, String modelo, String cor, int ano){
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
    }
    public void mostrarVeiculo(){
        System.out.println("Marca: "+marca);
        System.out.println("Modelo: "+modelo);
        System.out.println("Cor: "+cor);
        System.out.println("Ano: "+ano);
    }
}
