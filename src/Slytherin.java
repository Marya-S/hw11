public class Slytherin extends Hogwarts {
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int thirstForPower;

    public Slytherin(String name, int cunning, int determination, int ambition, int resourcefulness, int thirstForPower, int magic, int transgression) {
        super(name, magic, transgression);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.thirstForPower = thirstForPower;
    }

    public void equalsSlytherin(Slytherin personOne, Slytherin personTwo) {
        int resultOne = personOne.cunning + personOne.determination + personOne.ambition + personOne.resourcefulness + personOne.thirstForPower;
        int resultTwo = personTwo.cunning + personTwo.determination + personTwo.ambition + personTwo.resourcefulness + personTwo.thirstForPower;
        if (resultOne > resultTwo) {
            System.out.println(personOne.getName() + " лучший Слизиринец, чем " + personTwo.getName());
        } else {
            System.out.println(personTwo.getName() + " лучший Слизиринец, чем " + personOne.getName());
        }
    }

    public void print() {
        System.out.println("Ученика зовут: " + this.getName() + ". Он обладает магией на " + this.getMagic() + " баллов " +
                "и трансгрессией на " + this.getTransgression() + " баллов. Также он обладает хитростью " + this.cunning + " баллов," +
                "решительностью на " + this.determination + " баллов, амбициозностью на " + this.ambition + " баллов, находчивостью на " + this.resourcefulness + " баллов и жаждой власти на " + this.thirstForPower + " баллов");
    }
}
