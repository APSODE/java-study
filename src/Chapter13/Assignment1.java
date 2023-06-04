package Chapter13;

import java.util.Random;

public class Assignment1 {
    public static void main(String[] args) {
        Dice D1 = new Dice();
        for (int count = 0; count < 10; count++) {
            D1.roll();
            System.out.println("주사위의 숫자는 " + D1.getFace());
        }

    }
}


class Dice {
    private int face;

    public int getFace() {
        return face;
    }

    public void setFace(int face) {
        this.face = face;
    }

    public void roll() {
        Random rnd = new Random();
        int dice_face_temp = rnd.nextInt(1, 7);
        setFace(dice_face_temp);
    }
}