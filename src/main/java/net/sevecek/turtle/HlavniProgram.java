package net.sevecek.turtle;

import net.sevecek.turtle.engine.*;

public class HlavniProgram {

    public void main(String[] args) {
        Turtle zofka;

        zofka = new Turtle();
//        nakresliPrasatko(zofka);
//
//        zofka.setLocation(200, 200);
//        nakresliOsmiuhelnik(zofka);
//
//        zofka.setLocation(200, 400);
//        nakresliKolecko(zofka);
//
//        zofka.setLocation(400,400);
//        nakresliSlunicko(zofka);
//
//        zofka.setLocation(500,150);
//        nakresliDomecek(zofka);


        for (int i = 100; i <= 500; i += 100){
            zofka.setLocation(i,310);
            nakresliDomecek(zofka);
        }



        zofka.setLocation(100,420);
        nakresliDomecek(zofka);

        zofka.setLocation(500,420);
        nakresliDomecek(zofka);

        zofka.setLocation(100,530);
        nakresliA(zofka);
        zofka.setLocation(200,530);
        nakresliD(zofka);
        zofka.setLocation(300,530);
        nakresliE(zofka);
        zofka.setLocation(400,530);
        nakresliL(zofka);
        zofka.setLocation(500,530);
        nakresliA(zofka);

        zofka.setLocation(250,400);
        nakresliPrasatko(zofka);

        zofka.setLocation(100,100);
        nakresliSlunicko(zofka);

    }

    private void nakresliL(Turtle zofka) {
        zofka.move(60);
        zofka.penUp();
        zofka.turnLeft(180);
        zofka.move(60);
        zofka.turnLeft(90);
        zofka.penDown();
        zofka.move(20);
        zofka.turnLeft(90);
    }

    private void nakresliE(Turtle zofka) {
        zofka.move(60);
        zofka.turnRight(90);
        zofka.move(20);
        zofka.turnRight(180);
        zofka.penUp();
        zofka.move(20);
        zofka.turnLeft(90);
        zofka.move(30);
        zofka.turnLeft(90);
        zofka.penDown();
        zofka.move(20);
        zofka.turnRight(180);
        zofka.penUp();
        zofka.move(20);
        zofka.turnLeft(90);
        zofka.move(30);
        zofka.turnLeft(90);
        zofka.penDown();
        zofka.move(20);
        zofka.turnLeft(90);
    }

    private void nakresliD(Turtle zofka) {
        zofka.move(60);
        zofka.turnRight(90);

        for (int i = 0; i < 10; i++) {
            zofka.move(12);
            zofka.turnRight(20);
        }
        zofka.turnRight(70);
    }

    private void nakresliA(Turtle zofka) {
        zofka.turnRight(30);
        zofka.move(60);
        zofka.turnRight(125);
        zofka.move(60);
        zofka.turnRight(180);
        zofka.penUp();
        zofka.move(30);
        zofka.turnLeft(65);
        zofka.penDown();
        zofka.move(30);
        zofka.turnRight(90);
    }

    private void nakresliDomecek(Turtle zofka) {
        for (int i = 0; i < 4; i++) {
            zofka.move(50.0);
            zofka.turnRight(90.0);
        }

        zofka.penUp();
        zofka.move(50.0);
        zofka.penDown();

        zofka.turnRight(30.0);
        zofka.move(50.0);
        zofka.turnRight(120.0);
        zofka.move(50.0);

        zofka.turnRight(30.0);
        zofka.penUp();
        zofka.move(50.0);
        zofka.turnRight(90.0);
        zofka.move(50.0);
        zofka.turnRight(90.0);
        zofka.penDown();
    }

    private void nakresliSlunicko(Turtle zofka) {
        for (int i = 0; i < 25; i++) {
            zofka.move(12);
            zofka.turnLeft(90);
            zofka.move(20);
            zofka.penUp();
            zofka.turnLeft(180);
            zofka.move(20);
            zofka.turnLeft(75);
            zofka.penDown();

        }
    }

    private void nakresliKolecko(Turtle zofka) {
        for (int i = 0; i < 40; i++) {
            zofka.move(5);
            zofka.turnRight(10);

        }
    }

    private void nakresliOsmiuhelnik(Turtle zofka) {
        for (int i = 0; i < 8; i++) {
            zofka.move(40);
            zofka.turnRight(45);
        }
    }

    private void nakresliPrasatko(Turtle zofka) {
        zofka.move(50.0);
        zofka.turnRight(90.0);
        zofka.move(100.0);
        zofka.turnRight(90.0);
        zofka.move(50.0);
        zofka.turnRight(25.0);
        nakresliNozicky(zofka);
        zofka.penDown();
        zofka.move(100);
        zofka.turnLeft(50.0);
        nakresliNozicky(zofka);
        zofka.turnRight(20);
        zofka.penDown();
        zofka.move(45);
        zofka.turnRight(115);
        zofka.move(45);
    }

    private void nakresliNozicky(Turtle zofka) {
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
    }
}
