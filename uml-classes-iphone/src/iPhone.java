class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    public static void main(String[] args) {
        iPhone iphone = new iPhone();
        // Main para testar as chamadas das funcionalidades do iPhone
        iphone.ligar("123456789");
        iphone.atender("987654321");
        iphone.iniciarCorreioVoz("Oi, estou ocupado agora. Ligue mais tarde.", "987654321");
        iphone.selecionarMusica();
        iphone.tocar();
        iphone.pausar();
        iphone.exibirPagina("www.example.com");
        iphone.adicionarNovaAba("www.example2.com");
        iphone.atualizarPagina();
    }

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para: " + numero);
    }

    @Override
    public void atender(String numero) {
        System.out.println("Atendendo chamada de: " + numero);
    }

    @Override
    public void iniciarCorreioVoz(String mensagem, String destinatario) {
        System.out.println("Iniciando correio de voz para: " + destinatario);
        System.out.println("Mensagem: " + mensagem);
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página: " + url);
    }

    @Override
    public void adicionarNovaAba(String url) {
        System.out.println("Adicionando nova aba com página: " + url);
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página...");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando música...");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando música...");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando música...");
    }
}