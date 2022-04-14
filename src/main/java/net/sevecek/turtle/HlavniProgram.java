package net.sevecek.turtle;

import net.sevecek.turtle.engine.*;

public class HlavniProgram {

    public void main(String[] args) {
        Turtle zofka;

        zofka = new Turtle();

        nakresliPrasatko(zofka);

    }

    private void nakresliPrasatko(Turtle zofka) {
        zofka.move(50.0);
        zofka.turnRight(90.0);
        zofka.move(100.0);
        zofka.turnRight(90.0);
        zofka.move(50.0);
        zofka.turnRight(25.0);
        zofka.move(20.0);
        zofka.turnRight(180);
        zofka.penUp();
        zofka.move(20);
        zofka.turnRight(110);
        zofka.penDown();
        zofka.move(20);
        zofka.penUp();
        zofka.turnRight(180);
        zofka.move(20);
        zofka.turnRight(315);
        zofka.penDown();
        zofka.move(100);
        zofka.turnLeft(50.0);
        zofka.move(20.0);
        zofka.turnRight(180);
        zofka.penUp();
        zofka.move(20);
        zofka.turnRight(110);
        zofka.penDown();
        zofka.move(20);
        zofka.penUp();
        zofka.turnRight(180);
        zofka.move(20);
        zofka.turnRight(315);
        zofka.turnRight(20);
        zofka.penDown();
        zofka.move(45);
        zofka.turnRight(115);
        zofka.move(45);
    }
}
