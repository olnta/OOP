public abstract class Person {

    private String name;
    private int alter;

    public Person(String name, int alter){
        this.name = name;
        this.alter = alter;
    }

    public String getName() {
        return this.name;
    }

    public int getAlter() {
        return this.alter;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }



}
