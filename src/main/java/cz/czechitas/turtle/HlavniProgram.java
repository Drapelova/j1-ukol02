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

        var velikostPrepony = Math.sqrt(2 * Math.pow(velikostStrany, 2));
    }

    public void start() {

        /*nakresliRovnostrannyTrojuhelnik(150);
        nakresliCtverec(100);
        nakresliObdelnik(100, 150);
        nakresliKolecko(30);
        nakresliZmrzlinu();
        nakresliSnehulaka();
        nakresliMasinku();

         */

    }

    public void nakresliRovnostrannyTrojuhelnik(double velikostStrany) {
        zofka.move(velikostStrany);
        zofka.turnLeft(120);
        zofka.move(velikostStrany);
        zofka.turnLeft(120);
        zofka.move(velikostStrany);
        zofka.turnLeft(120);
    }

    public void nakresliRovnoramennyTrojuhelnik(double velikostStrany, double velikostPrepony) {
        zofka.move(velikostStrany);
        zofka.turnLeft(135);
        zofka.move(velikostPrepony);
        zofka.turnLeft(135);
        zofka.move(velikostStrany);
        zofka.turnLeft(90);
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

    public void nakresliKolecko(double velikostStranyB) {
        for (int i = 0; i < 18; i++) {
            zofka.move(velikostStranyB);
            zofka.turnLeft(20);


        }
    }

    public void nakresliZmrzlinu() {
        zofka.turnLeft(90);
        nakresliRovnostrannyTrojuhelnik(200);
        zofka.turnRight(120);
        nakresliKolecko(46);

    }

    public void nakresliSnehulaka() {
        zofka.penUp();
        zofka.move(150);
        zofka.penDown();
        zofka.turnRight(90);
        nakresliKolecko(20);
        zofka.turnLeft(190);
        nakresliKolecko(30);
        zofka.turnLeft(85);
        zofka.penUp();
        zofka.move(170);
        zofka.penDown();
        zofka.turnRight(90);
        nakresliKolecko(50);
        zofka.penUp();
        zofka.move(100);
        zofka.turnRight(90);
        zofka.move(100);
        zofka.penDown();
        nakresliKolecko(10);
        zofka.penUp();
        zofka.turnRight(94);
        zofka.move(235);
        zofka.turnLeft(90);
        zofka.penDown();
        nakresliKolecko(10);
    }

    public void nakresliMasinku() {
        nakresliObdelnik(100, 200);
        zofka.turnRight(90);
        zofka.move(120);
        zofka.turnLeft(90);
        nakresliObdelnik(200, 120);
        nakresliKolecko(21);
        zofka.turnLeft(90);
        zofka.move(150);
        nakresliKolecko(10);
        zofka.move(80);
        nakresliKolecko(10);
        zofka.move(90);
        zofka.turnLeft(90);
        zofka.move(30);
        zofka.turnLeft(180);
        nakresliRovnoramennyTrojuhelnik(100, 140);


    }
}