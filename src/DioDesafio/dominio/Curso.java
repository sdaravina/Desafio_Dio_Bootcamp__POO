package DioDesafio.dominio;

public class Curso extends Conteudo {
    
    @Override
    public double calcularXp() {
        return XP_PADRÃO * cargaHoraria;
    } 

    private int cargaHoraria;


    public int getCargaHoraria() {
        return cargaHoraria;
    }
    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso [titulo=" + getTitulo() + ", descricao=" + getDescricao() + ", cargaHoraria=" + cargaHoraria + "]";
    } 

   

}
