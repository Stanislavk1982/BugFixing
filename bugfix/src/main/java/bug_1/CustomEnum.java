package bug_1;

public enum CustomEnum {

    ACTION_ONE(0),
    ACTION_TWO(1),
    ECTION_THREE(2);

    CustomEnum(int id) {
        this.id = id;
    }

    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
