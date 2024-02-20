//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

    Tootaja tootaja1 = new Tootaja("Siim", 30, false, 2000.0);
    Tootaja tootaja2 = new Tootaja("Anna", 29, true, 2300.0);


    tootaja1.palgaLisa(200.0);
    System.out.println(tootaja1.palk);
    tootaja2.muudaPuhkusel();
    System.out.println(tootaja2.puhkusel);

    Raamat raamat1 = new Raamat("Dracula", "Bram Stoker", 1897, 30.0);
    Raamat raamat2 = new Raamat("Harry Potter and the Philosopher's Stone", "J. K. Rowling", 1997, 25.0);

    System.out.println(raamat1.raamatuVanus());
    raamat2.soodusHind(40);
    System.out.println(raamat2.hind);

    }
}