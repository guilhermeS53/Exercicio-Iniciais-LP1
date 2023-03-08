class TesteEx2 {
    public static void main(String[] args) {
        Mensagem m1 = new Mensagem();
        m1.autor = "Guilherme Sousa";
        m1.data = "10/02/2023.";
        m1.texto = "\"Olá, eu me chamo Guilherme e esse é meu segundo dia em LP1\"";
        m1.configurar();
        m1.enviar();
        m1.setarParametro("Guilherme Sousa", "10/02/2023.", "Olá, eu me chamo Guilherme e esse é meu segundo dia em LP1");
    }
}
