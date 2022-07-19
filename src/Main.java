public class Main {
    public static void main(String[] args) {
        Gryffindor potter = new Gryffindor("Гарри Поттер", 5, 40, 76, 55, 12);
        Gryffindor germiona = new Gryffindor("Гермиона Грейнджер", 17, 30, 55, 85, 78);
        Gryffindor uzly = new Gryffindor("Рон Уизли", 45, 12, 36, 48, 35);
        Hufflepuff smith = new Hufflepuff("Захария Смит", 77, 56, 94, 35, 48);
        Hufflepuff digory = new Hufflepuff("Седрик Диггори", 93, 35, 74, 87, 56);
        Hufflepuff finch = new Hufflepuff("Джастин Финч-Флетчли", 86, 56, 54, 95, 24);
        Slytherin malfoy = new Slytherin("Драко Малфой", 76, 85, 59, 96, 49, 57, 93);
        Slytherin montegu = new Slytherin("Грэхэм Монтегю", 85, 92, 34, 76, 48, 92, 85);
        Slytherin goyl = new Slytherin("Грегори Гойл", 83, 90, 67, 59, 96, 44, 12);
        Ravenclaw chang = new Ravenclaw("Чжоу Чанг", 82, 69, 60, 72, 77, 49);
        Ravenclaw patil = new Ravenclaw("Падма Патил", 72, 94, 69, 71, 60, 100);
        Ravenclaw belbi = new Ravenclaw("Маркус Белби", 82, 59, 91, 79, 90, 90);

        digory.equalsHufflepuff(smith);
        potter.equals(malfoy);
        uzly.print();
    }
}