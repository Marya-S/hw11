public class Gryffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int bravery;

    public Gryffindor(String name, int nobility, int honor, int bravery, int magic, int transgression) {
        super(name, magic, transgression);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public void equalsGryffindor(Gryffindor personOne, Gryffindor personTwo) {
        int resultOne = personOne.nobility + personOne.bravery + personOne.honor;
        int resultTwo = personTwo.nobility + personTwo.bravery + personTwo.honor;
        if (resultOne > resultTwo) {
            System.out.println(personOne.getName() + " лучший Гриффиндорец, чем " + personTwo.getName());
        } else {
            System.out.println(personTwo.getName() + " лучший Гриффиндорец, чем " + personOne.getName());
        }
    }

    public void print() {
        System.out.println("Ученика зовут: " + this.getName() + ". Он обладает магией на " + this.getMagic() + " баллов " +
                "и трансгрессией на " + this.getTransgression() + " баллов. Также он обладает благородство " + this.nobility + " баллов," +
                "честью на " + this.honor + " баллов и храбростью на " + this.bravery + " баллов");
    }
}
