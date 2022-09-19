public class Carnivoro extends Animal {
  Carnivoro(String nome, Double altura, String cor, Double peso ){
    setNome(nome);
    setAltura(altura);
    setPeso(peso);
    setCor(cor);
  }

  public void comer(){
    System.out.println("Comeu Carne");
  }

  @Override
  public String toString() {
    return "Seu animal : "+ getNome() + "\n Altura: "+ getAltura() + "\n peso: "+ getPeso() + "\n Cor: "+ getCor();
  }





}
