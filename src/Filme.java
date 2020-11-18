public class Filme implements Video {
    private int duracao;
    private String idiomaAudio;
    private String idiomaLegenda;
    private boolean estaPausado;
    private String nome;
    private int anoLancamento;
    private boolean audioIngles;
    private boolean SLegenda;

    public Filme(String nome, int duracao, int anoLancamento){
        this.nome = nome;
        this.duracao = duracao;
        this.anoLancamento = anoLancamento;

    }

    @Override
    public void executar() {
        if(estaPausado == false){
            System.out.println("O filme " + nome + " acabou de começar");
        this.estaPausado = true;
        } else {     
            System.out.println("O vídeo saiu do modo pause");
        }  
                                    
    }

    @Override
    public void pausar() {
        this.estaPausado = true;
            System.out.println("O filme foi pausado");

    }

    @Override
    public void mudarAudio() {
        if(audioIngles == false){
        this.idiomaAudio = "Português (Brasil)";
            System.out.println("Áudio em " + idiomaAudio);
        this.audioIngles = true;
        }else{
        this.idiomaAudio = "Inglês";
            System.out.println("Áudio em " + idiomaAudio);
        this.audioIngles = false;
        }
    }

    @Override
    public void mudarLegenda() {
        if(SLegenda == false){
        this.idiomaLegenda = "Português (Brasil)";
            System.out.println("Legenda em " + idiomaLegenda);
        this.SLegenda = true;
        }else{
        this.idiomaLegenda = "Sem legenda";
            System.out.println(idiomaLegenda);
        this.SLegenda = false;
        }
    }

    @Override
    public void exibirDetalhes() {
        System.out.println(nome + "(" + anoLancamento + ")." + " Duração: " + duracao + "min");
       
    }
    
}
