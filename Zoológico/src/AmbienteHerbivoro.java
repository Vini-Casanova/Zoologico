import java.util.ArrayList;
import java.util.List;

public class AmbienteHerbivoro {
  List <Herbivoro> ambiente =  new ArrayList<Herbivoro>();

  public void addHerb(String nome, Double altura, String cor, Double peso){
    Herbivoro animal =  new Herbivoro(nome, altura, cor, peso);
    ambiente.add(animal);
  }

  public void editHerb(){

  }

  public void removeHerb(){

  }


}
