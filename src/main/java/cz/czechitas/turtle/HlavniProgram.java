package cz.czechitas.turtle;

import dev.czechitas.java1.turtle.engine.Turtle;

public class HlavniProgram {
    private Turtle zofka = new Turtle();

    public static void main(String[] args) {
        new HlavniProgram().start();
    }

    {
        double velikostStrany;
        velikostStrany = 150;

        double velikostStranyB;
        velikostStranyB = 200;
    }

    public void start() {

        nakresliRovnostrannyTrojuhelnik(150);
        nakresliCtverec(100);
        nakresliObdelnik(100, 150);
        nakresliKolecko(30);

    }

    public void nakresliRovnostrannyTrojuhelnik(double velikostStrany) {
        zofka.move(velikostStrany);
        zofka.turnLeft(120);
        zofka.move(velikostStrany);
        zofka.turnLeft(120);
        zofka.move(velikostStrany);
        zofka.turnLeft(120);
    }

    public void nakresliCtverec(double velikostStrany) {
        zofka.move(velikostStrany);
        zofka.turnLeft(90);
        zofka.move(velikostStrany);
        zofka.turnLeft(90);
        zofka.move(velikostStrany);
        zofka.turnLeft(90);
        zofka.move(velikostStrany);
        zofka.turnLeft(90);

    }

    public void nakresliObdelnik(double velikostStrany, double velikostStranyB) {
        zofka.move(velikostStrany);
        zofka.turnLeft(90);
        zofka.move(velikostStranyB);
        zofka.turnLeft(90);
        zofka.move(velikostStrany);
        zofka.turnLeft(90);
        zofka.move(velikostStranyB);
        zofka.turnLeft(90);
    }

    public void nakresliKolecko(double velikostrStrany) {
        for (int i = 0; i < 18; i++) {
            zofka.move(velikostrStrany);
            zofka.turnLeft(20);


        }
    }
}