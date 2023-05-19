package callPhoneBook;

public class SubscribersInit {

    public static Subscriber[] getSubsArray() {
        Subscriber[] subscribersArray = new Subscriber[10];
        subscribersArray[0] =
                new Subscriber(1, "Іванов", "Іван", "Київ", "093 1234567", "Н-000001", 100, 300, 0, 100);
        subscribersArray[1] =
                new Subscriber(2, "Петров", "Петро", "Дніпро", "093 8901234", "Н-000002", 80, 800, 20, 90);
        subscribersArray[2] =
                new Subscriber(3, "Сідоров", "Сергій", "Київ", "093 5678901", "Н-000003", 10, 50, 200, 180);
        subscribersArray[3] =
                new Subscriber(4, "Шевченко", "Тарас", "Черкаси", "093 2345678", "Н-000004", 200, 150, 0, 80);
        subscribersArray[4] =
                new Subscriber(5, "Українка", "Леся", "Житомир", "093 9876543", "Н-000005", -65, 120, 80, 75);
        subscribersArray[5] =
                new Subscriber(6, "Сковорода", "Григорій", "Полтава", "093 2109876", "Н-000006", 50, 50, 0, 50);
        subscribersArray[6] =
                new Subscriber(7, "Костенко", "Ліна", "Київ", "093 5432109", "Н-000007", -110, 110, 110, 110);
        subscribersArray[7] =
                new Subscriber(8, "Нікітюк", "Леся", "Хмельницький", "093 8765432", "Н-000008", 85, 85, 0, 85);
        subscribersArray[8] =
                new Subscriber(9, "Притула", "Сергій", "Тернопіль", "093 1098765", "Н-000009", -35, 35, 35, 35);
        subscribersArray[9] =
                new Subscriber(10, "Коцюбинський", "Михайло", "Вінниця", "093 4321098", "Н-000010", 120, 120, 0, 120);

        return subscribersArray;
    }
}
