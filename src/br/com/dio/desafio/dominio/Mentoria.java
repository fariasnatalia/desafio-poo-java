package br.com.dio.desafio.dominio;

/*import java.time.LocalDate;*/

public class Mentoria extends Conteudo {
    
    private int LocalDate;

    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d;
    }

    public Mentoria() {
    }


    public int getLocalDate() {
        return LocalDate;
    }

    public void setLocalDate(int localDate) {
        LocalDate = localDate;
    }

    @Override
    public String toString() {
        return "{" +
            " titulo='" + getTitulo() + "'" +
            ", descricao='" + getDescricao() + "'" +
            ", LocalDate='" + getLocalDate() + "'" +
            "}";
    }
    public void setData(java.time.LocalDate now) {
    }



}




/*
      A classe mentoria é filha da classe conteúdo, tudo que eu tenho em curso eu
     vou ter em mentoria
    /* Mas nem tudo que eu tiver em mentoria eu vou ter em curso 
     */