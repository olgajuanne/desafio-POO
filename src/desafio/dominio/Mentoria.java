package desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {
  
  @Override
  public double calcularXp() {
    return XP_PADRAO + 20d;
  }
  
  private LocalDate data;

  public Mentoria(){
    
  }

  public LocalDate getDate() {
      return data;
  }

  public void setData(LocalDate data) {
      this.data = data;
  }

  @Override
    public String toString() {
        return "Mentoria: " +
                "Titulo =' " + getTitulo() + '\'' +
                ", Descricão =' " + getDescricao() + '\'' +
                ", Data = " + data + " " +
                 '|' + "\n";
    }

  
}
