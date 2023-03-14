package br.com.dio.desafio;

public enum XpEnum {
    XP_PADRAO(10d), XP_MENTORIA(20d);

    private final double xp;

    XpEnum(double xp) {
        this.xp = xp;
    }

    public double getXp() {
        return xp;
    }
}
