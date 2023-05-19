package callPhoneBook;

public class App {
    public static void main(String[] args) {
        Subscriber[] subsInitArray = SubscribersInit.getSubsArray();
        for (Subscriber subscriber : subsInitArray) {
            System.out.println(subscriber);
        }
        SubscriberServiceImpl subsServiceImpl = new SubscriberServiceImpl();

//а)відомості про абонентів, у яких час внутрішньоміських розмов перевищує заданий;
        int time = 115;
        System.out.println("\nАбоненти, у яких час внутрішньоміських розмов перевищує " + time + ":");
        subsServiceImpl.subscribersCityCallDuration(subsInitArray, time);

//b)відомості про абонентів, які користувалися міжміським зв'язком;
        System.out.println("\nАбоненти, які користувалися міжміським зв'язком:");
        subsServiceImpl.subscribersInterCityCallDuration(subsInitArray);

//c) відомості про абонентів ПІБ, номер телефону, баланс - де перший бука прізвища передається як параметр.
        char firstLetter = 'П';
        System.out.println("\nАбоненти, у кого перша буква " + firstLetter + ":");
        subsServiceImpl.subscribersSearchFirstLetterLastName(subsInitArray, firstLetter);

//d) сумарне споживання трафіку інтернету для певного міста
        String city = "Київ";
        subsServiceImpl.subscribersTotalInternetTrafficCity(subsInitArray, city);

//e) кількість абонентів з негативним балансом
        subsServiceImpl.subscribersCountNegativeBalance(subsInitArray);
    }
}
