public class App {
    public static void main(String[] args) throws Exception {
        Filme filmeA = new Filme("Annabelle 3", 120, 2019);
        Filme filmeB = new Filme("It: A Coisa", 135, 2017);

        filmeA.exibirDetalhes();
        filmeA.mudarAudio();
        filmeA.mudarLegenda();
        filmeA.executar();
        filmeA.pausar();
        filmeA.executar();
        filmeA.mudarAudio();
        filmeA.mudarLegenda();

        System.out.println();

        filmeB.exibirDetalhes();
        filmeB.mudarAudio();
        filmeB.mudarLegenda();
        filmeB.executar();
        filmeB.pausar();
        filmeB.executar();
        filmeB.mudarAudio();
        filmeB.mudarLegenda();
        

        System.out.println();

        Serie serieA = new Serie("The Walking Dead", 10, 10);
        Serie serieB = new Serie("Peaky Blinders", 5, 6);

        serieA.exibirDetalhes();
        serieA.mudarAudio();
        serieA.mudarLegenda();
        serieA.executar();
        serieA.pausar();
        serieA.executar();
        serieA.mudarAudio();
        serieA.mudarLegenda();
        
        System.out.println();

        serieB.exibirDetalhes();
        serieB.mudarAudio();
        serieB.mudarLegenda();
        serieB.executar();
        serieB.pausar();
        serieB.executar();
        serieB.mudarAudio();
        serieB.mudarLegenda();
        

    }
}
