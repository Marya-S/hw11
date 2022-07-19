public class Ravenclaw extends Hogwarts {
    private int intelligence;
    private int wisdom;
    private int wit;
    private int creativity;

    public Ravenclaw(String name, int intelligence, int wisdom, int wit, int creativity, int magic, int transgression) {
        super(name, magic, transgression);
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    public void equalsRavenclaw(Ravenclaw personOne, Ravenclaw personTwo) {
        int resultOne = personOne.intelligence + personOne.wisdom + personOne.wit + personOne.creativity;
        int resultTwo = personTwo.intelligence + personTwo.wisdom + personTwo.wit + personTwo.creativity;
        if (resultOne > resultTwo) {
            System.out.println(personOne.getName() + " лучший Когтевранец, чем " + personTwo.getName());
        } else {
            System.out.println(personTwo.getName() + " лучший Когтевранец, чем " + personOne.getName());
        }
    }

    public void print() {
        System.out.println("Ученика зовут: " + this.getName() + ". Он обладает магией на " + this.getMagic() + " баллов " +
                "и трансгрессией на " + this.getTransgression() + " баллов. Также он обладает интиллектом " + this.intelligence + " баллов," +
                "мудростью на " + this.wisdom + " баллов, остроумием на " + this.wit + " баллов и творчество на " + this.creativity + " баллов");
    }
}
