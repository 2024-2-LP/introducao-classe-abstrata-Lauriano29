package school.sptech;

import java.util.ArrayList;
import java.util.List;

public class Imagem {

    private List<Figura> figuras =new ArrayList<>();

    public List<Figura> getFiguras() {
        return figuras;
    }

    public void setFiguras(List<Figura> figuras) {
        figuras = figuras;
    }

    public void adicionar(Figura figura){
        figuras.add(figura);
    }

    public Double calcularSomaDasAreas(){
        Double valor_total = 0.0;
        for(Figura list:figuras){
            valor_total+=list.calcularArea();
        }
        return valor_total;
    }

    public List<Figura> buscarPorAreaMaiorQue20(){
        List<Figura>Maior20= new ArrayList<>();
        for(Figura list:figuras){
            if (list.calcularArea()>20) {
                Maior20.add(list);
            }
        }
        return Maior20;
    }

    public List<Figura> buscarQuadrados(){
        List<Figura>Qudrados= new ArrayList<>();
        for(Figura list:figuras) {
            if (list instanceof Quadrado) {
                Qudrados.add(list);
            }
        }
            return Qudrados;
    }

}
