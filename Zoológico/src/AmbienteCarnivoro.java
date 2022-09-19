import java.util.ArrayList;
import java.util.List;

public class AmbienteCarnivoro {
  List <Carnivoro> ambiente =  new ArrayList<Carnivoro>();

  public void addCarn(String nome, Double altura, String cor, Double peso){
    Carnivoro animal =  new Carnivoro(nome, altura, cor, peso);
    ambiente.add(animal);
  }

  public void editHerb(int index){
  }

  public void removeHerb(){

  }


  
}
