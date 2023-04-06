
public class task {

    public static void main(String[] args) {

        Person person1 = new Person("Иван", "Лебедев", 57, "мужской");
        Person person2 = new Person("Тарас", "Лебедев", 32, "мужской");
        Person person3 = new Person("Антон", "Лебедев", 18, "мужской");
        Person person4 = new Person("Аня", "Мальская", 30, "женский");
        Person person5 = new Person("Нина", "Тольская", 60, "мужской");

        Family family = new Family(null, null, null, null);
        family.getFamily(person1);
        System.out.println();
        family.getFamily(person2);
        System.out.println();
        family.getFamily(person3);
        System.out.println();
        family.getFamily(person4);
        System.out.println();
        family.getFamily(person5);
    }
}