package desafio.dominio;

public class Projeto extends Conteudo{
  
    private int cargaHoraria;

    @Override
      public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
      }

      public Projeto(){
      
      }

      public int getCargaHoraria() {
          return cargaHoraria;
      }

      public void setCargaHoraria(int cargaHoraria) {
          this.cargaHoraria = cargaHoraria;
      }

      @Override
      public String toString() {
          return "Projeto: " +
                  "Titulo =' " + getTitulo() + '\'' +
                  ", Descrição =' " + getDescricao() + '\'' +
                  ", Carga Horaria = " + cargaHoraria + " " +
                  '|';
      }

}
