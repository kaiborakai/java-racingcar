package racingcar.model;

import racingcar.model.action.Movable;
import racingcar.model.action.RandomMovable;

public class Car {

    private int position;
    private String name;


    public Car(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void move(Movable movable)
    {
        if (movable.moveOrNot()) {
            position++;
        }

    }

    public int getPoisition() {
        return position;
    }

    public boolean matchPosition(int position) {
        return this.position == position;
    }
}
