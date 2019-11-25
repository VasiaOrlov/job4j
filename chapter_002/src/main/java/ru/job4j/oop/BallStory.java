package ru.job4j.oop;

public class BallStory {
    public static void main(String[] args) {
        Ball kolobok = new Ball();
        Hare zayac = new Hare();
        Wolf seriy = new Wolf();
        Fox rizhaya = new Fox();

        zayac.tryEat(kolobok);
        kolobok.goAwayHare(zayac);
        seriy.tryEat(kolobok);
        kolobok.goAwayWolf(seriy);
        rizhaya.tryEat(kolobok);
        kolobok.dieOfFox(rizhaya);
    }
}
