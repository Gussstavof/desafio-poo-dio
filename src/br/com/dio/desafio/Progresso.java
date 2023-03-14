package br.com.dio.desafio;

public class Progresso {

    public void inscreverBootcamp(Bootcamp bootcamp, Dev dev){
        dev.getConteudosInscritos()
                .addAll(bootcamp.getConteudos());
        bootcamp.getDevsInscritos()
                .add(dev);
    }

    public void progredir(Dev dev) {
        dev.getConteudosInscritos().stream().findFirst().map(conteudo1 -> {
            dev.getConteudosConcluidos().add(conteudo1);
            dev.getConteudosInscritos().remove(conteudo1);
            return dev;
        }).orElseThrow(
                () -> new RuntimeException("Você não está matriculado em nenhum conteúdo!")
        );
    }

    public double calcularTotalXp(Dev dev) {
        return dev.getConteudosConcluidos()
                .stream()
                .mapToDouble(Conteudo::calcularXp)
                .sum();
    }

}
