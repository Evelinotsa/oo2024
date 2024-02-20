//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Info info = new Info("MacBook", 16, "Intel");
        Arvuti arvuti1 = new Arvuti(info, 1000, "Kristiine");
        Arvuti arvuti2 = new Arvuti(new Info("Dell", 32, "Intel"), 2000, "Ülemiste");

        arvuti1.muudaPoodi("Mustamäe");
        arvuti2.paneAllahindlus(290);
    }
}