package school.sptech;

public abstract class Figura {

   private String cor;
   private Integer espessura;

   public Figura(){

   }

    public Figura(String cor, Integer espressura) {
        this.cor = cor;
        this.espessura = espressura;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Integer getEspessura() {
        return espessura;
    }

    public void setEspessura(Integer espessura) {
        this.espessura = espessura;
    }

    @Override
    public String toString() {
        return "Figura{" +
                "cor='" + cor + '\'' +
                ", espressura=" + espessura +
                '}';
    }

    public abstract Double calcularArea();
}
