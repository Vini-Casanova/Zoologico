public abstract class Animal {
  private String nome;
  private double altura;
  private String cor;
  private double peso;

  // Métodos das variáveis de cada animal
  public void correr(){
    System.out.println("Correu");
  }

  public void andar(){
  }

  public void comer() {
    System.out.println("comeu");
  }

  // Método set de cada variável
  public void setNome(String nome) {
    this.nome = nome;
  }

  public void setCor(String cor) {
    this.cor = cor;
  }

  public void setAltura(double altura) {
    this.altura = altura;
  }

  public void setPeso(double peso) {
    this.peso = peso;
  }

  // Métodos get de cada variável

  public String getNome() {
    return nome;
  }

  public double getAltura() {
    return altura;
  }

  public String getCor() {
    return cor;
  }

  public double getPeso() {
    return peso;
  }



}
