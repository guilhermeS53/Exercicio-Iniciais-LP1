class Mensagem {
    String autor, texto, data;

    public void configurar() {
        System.out.println("Configuração Realizada!");
        System.out.println("\n");
    }
    public void enviar() {
        System.out.println("Olá, " + autor + ", sua mensagem com o texto " + texto + " foi enviado em " + data);
    }
    public void setarParametro(String x, String y, String z) {
        this.autor = x;
        this.data = y;
        this.texto = z;
    }
}
