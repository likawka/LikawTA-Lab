package knu.fit.ist.LikawTA.Lab;

public class NumberStorage {
    private Integer myNumber = 0;

    public NumberStorage(Integer number) {
        this.myNumber = number;
    }

    public Integer getNumber() {
        return this.myNumber;
    }

    public void setNumber(Integer number) {
        this.myNumber = number;
    }

    public String toString() {
        return String.format("NumberStorage { myNumber = %d }", this.myNumber);
    }
}
