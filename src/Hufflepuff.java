public class Hufflepuff extends Hogwarts {
    private int hardworking;
    private int loyal;
    private int honest;

    public Hufflepuff(String name, int hardworking, int loyal, int honest, int magic, int transgression) {
        super(name, magic, transgression);
        this.hardworking = hardworking;
        this.loyal = loyal;
        this.honest = honest;
    }

    public void equalsHufflepuff(Hufflepuff personOne) {
        int resultOne = personOne.hardworking + personOne.loyal + personOne.honest;
        int resultTwo = this.hardworking + this.loyal + this.honest;
        if (resultOne > resultTwo) {
            System.out.println(personOne.getName() + " лучший Пуфендуец, чем " + this.getName());
        } else {
            System.out.println(this.getName() + " лучший Пуфендуец, чем " + personOne.getName());
        }
    }

    public void print() {
        System.out.println("Ученика зовут: " + this.getName() + ". Он обладает магией на " + this.getMagic() + " баллов " +
                "и трансгрессией на " + this.getTransgression() + " баллов. Также он обладает трудолюбием " + this.hardworking + " баллов," +
                "верностью на " + this.loyal + " баллов и честностью на " + this.honest + " баллов");
    }
}
