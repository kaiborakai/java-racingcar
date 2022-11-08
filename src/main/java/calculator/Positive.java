package calculator;

import java.util.Objects;

public class Positive {

    private final int number;

    public Positive(String value){
        this(Integer.parseInt(value));
    }

    public Positive(int number){
        if(number <0){
            throw new RuntimeException("음수 값이 들어올 수 없습니다.");
        }
        this.number = number;
    }

    public Positive plus(int number) {
        return new Positive(this.number + number); // 인스턴스화는 immutable을 위함
    }

    public Positive plus(Positive number) {
        return new Positive(this.number + number.number);
    }

    public int getNumber(){
        return this.number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Positive positive = (Positive) o;
        return number == positive.number;
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }
}