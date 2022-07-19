public class Hogwarts {
    private int magic;
    private int transgression;
    private String name;

    public Hogwarts(String name, int magic, int transgression) {
        this.name = name;
        this.magic = magic;
        this.transgression = transgression;
    }

    public void equals(Hogwarts personTwo) {
        int resultOne = this.magic + this.transgression;
        int resultTwo = personTwo.magic + personTwo.transgression;
        if (resultOne > resultTwo) {
            System.out.println(this.name + " лучше, чем " + personTwo.name);
        } else {
            System.out.println(personTwo.name + " лучше, чем " + this.name);
        }
    }

    public int getMagic() {
        return magic;
    }

    public int getTransgression() {
        return transgression;
    }

    public String getName() {
        return name;
    }
}
