package empresa;

public class Horario {
  private int hora;
  private int minuto;
  private int segundos;

  public int getHora() {
    return hora;
  }

  public int getSegundos() {
    return segundos;
  }

  public void setSegundos(int segundos) {
    this.segundos = segundos;
  }

  public void setHora(int hora) {
    if (hora >= 0 && hora <= 23) {
      this.hora = hora;
    } else {
      System.out.println("Hora invalida");
    }     
  }

  public int getMinuto() {
    return minuto;
  }

  public void setMinuto(int minuto) {
    this.minuto = minuto;
  }

}
