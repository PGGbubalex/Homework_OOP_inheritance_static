import Animals.*;
import Transport.Bus;
import Transport.Car;
import Transport.Train;

public class Test {
    public static void main(String[] args) {

        Car Lada = new Car("Lada", "", 1.7, "Белый", 2015, "России", "", 3, "а123xн545", "Зимняя", 200, "Бензин", 50);
        Car Audi = new Car("Audi", "A8 50 L TDI quattro", 3.0, " ", -20, "Германии", "", 2, "x000xx000", "Летняя", 300,"Электричество", 60);
        System.out.println(Lada);
        System.out.println(Audi);

        System.out.println("|||||||||||||||||||||||||||||");

        Train swallow = new Train(-2011, "", 3500 , "Белорусский вокзал", "Минск", 11, "Ласточка", "B-901");
        Train leningrad = new Train(2019, "Россия", 1700, "Ленинградский вокзал", "Ленинград-Пассажирский", 8, "Ленинград", "D-125");
        System.out.println(swallow);
        System.out.println(leningrad);

        System.out.println("|||||||||||||||||||||||||||||||||||||||");

        Bus ikarus = new Bus("", "А-123", 2010, "Россия", "Белый", 90, "Дизель", 25);
        Bus ankai = new Bus("ANKAI", "HFF6100G39C", 2020, "Китай", "Черный", 110, "Бензин", 60);
        Bus ayats = new Bus("AYATS", "FSG501230", 2021, "Россия", "Белый", 80, "Бензин", 70);

        System.out.println(ikarus);
        System.out.println(ankai);
        System.out.println(ayats);

        System.out.println("||||||||||||||||||||||||||||||");

        Lada.refill();
        Audi.refill();
        ikarus.refill();
        ankai.refill();
        ayats.refill();


        System.out.println("===================================");

        Herbivores gazelle = new Herbivores("Газель", 10, "Саванна", 80, "Зелень");
        Herbivores giraffe = new Herbivores("Жираф", 7, "Саванна", 50, "Зелень");
        Herbivores horse = new Herbivores("Лошадь", 2, "Равнина", 60, "Зелень");
        System.out.println(gazelle);
        gazelle.graze();
        gazelle.walk();
        gazelle.sleep();
        gazelle.eat();
        gazelle.sleep();
        gazelle.move();
        System.out.println(giraffe);
        System.out.println(horse);

        Predators hyena = new Predators("Гиена", 2, "Саванна", 20, "Мясо");
        Predators tiger = new Predators("Тигр", 5, "Джунгли", 30, "Мясо");
        Predators bear = new Predators("Медведь", 10, "Лес", 40, "Всеядный");
        System.out.println(hyena);
        hyena.eat();
        hyena.hunt();
        hyena.move();
        hyena.walk();
        hyena.sleep();
        System.out.println(tiger);
        System.out.println(bear);

        Amphibians frog = new Amphibians("Лягушка", 1, "Озера");
        Amphibians alreadyFreshwater = new Amphibians("Уж пресноводный", 1, "Озера");
        System.out.println(frog);
        frog.eat();
        frog.move();
        frog.walk();
        frog.sleep();
        System.out.println(alreadyFreshwater);

        Flightless peacock = new Flightless("Павлин", 2, "Джунгли", "Ходьба");
        Flightless penguin = new Flightless("Пингвин", 4, "Южный Полюс", "Ходьба");
        Flightless dodoBird = new Flightless("Птица додо", 5, "Острова Маврикий", "Ходьба");
        System.out.println(peacock);
        peacock.eat();
        peacock.hunt();
        peacock.move();
        peacock.walk();
        System.out.println(dodoBird);
        System.out.println(penguin);

        Flying seagull = new Flying("Чайка", 2, "Побережья", "Полет");
        Flying albatross = new Flying("Альбатрос", 4, "Побережья", "Полет");
        Flying falcon = new Flying("Сокол", 6, "Степи", "Полет");
        System.out.println(seagull);
        seagull.eat();
        seagull.fly();
        seagull.move();
        seagull.hunt();
        seagull.sleep();
        System.out.println(albatross);
        System.out.println(falcon);
    }
}
