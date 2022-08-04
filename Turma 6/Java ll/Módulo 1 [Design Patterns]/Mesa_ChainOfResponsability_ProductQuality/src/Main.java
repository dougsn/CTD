public class Main {
    public static void main(String[] args) {
        CheckQuality processo = new CheckQuality();

        processo.verificar(new Artigo("Cheetos", 900, 1250, "saudável"));
        processo.verificar(new Artigo("Fandangos", 1100, 1320, "saudável"));
        processo.verificar(new Artigo("Doritos", 1150, 1220, "não saudável"));
        processo.verificar(new Artigo("Baconzitos", 1800, 1240, "quase saudável"));
    }
}
