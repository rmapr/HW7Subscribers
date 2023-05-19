package callPhoneBook;

public class SubscriberServiceImpl implements SubscriberService {

    @Override
    public void subscribersCityCallDuration(Subscriber[] subscribers, int time) {
        boolean thereAreSubscribers = false;
        for (Subscriber subs : subscribers) {
            if (subs.getCityCallDuration() > time) {
                System.out.println(subs);
                thereAreSubscribers = true;
            }
        }
        if (!thereAreSubscribers)
            System.out.println("Абоненти, у яких час внутрішньоміських розмов перевищує " + time + " немає");
    }

    @Override
    public void subscribersInterCityCallDuration(Subscriber[] subscribers) {
        for (Subscriber subs : subscribers) {
            if (subs.getInterCityCallDuration() > 0) {
                System.out.println(subs);
            }
        }
    }

    @Override
    public void subscribersSearchFirstLetterLastName(Subscriber[] subscribers, char firstLetterLastName) {
        boolean thereAreSubscribers = false;
        char ch;
        for (Subscriber subs : subscribers) {
            ch = subs.getLastName().charAt(0);
            if (ch == firstLetterLastName) {
                System.out.printf("ФІО: %s %s; Телефон: %s; Баланс: %d грн.\n",
                        subs.getLastName(), subs.getFirstName(), subs.getPhoneNumber(), subs.getBalance());
                thereAreSubscribers = true;
            }
        }
        if (!thereAreSubscribers)
            System.out.println("Абонентів, у яких прізвище починається на " + firstLetterLastName + " немає.");
    }

    @Override
    public void subscribersTotalInternetTrafficCity(Subscriber[] subscribers, String city) {
        double trafficInternet = 0;
        for (Subscriber subs : subscribers) {
            if (subs.getCity().toUpperCase().equals(city.toUpperCase())) {
                trafficInternet += subs.getInternetTraffic();
            }
        }
        if (trafficInternet != 0) {
            System.out.printf("\nІнтернет-трафік для абонентів з міста %s: %#.2f Гб\n", city, trafficInternet);
        } else System.out.printf("\nІнтернет-трафік для міста %s серед абонентів відсутній", city);
    }

    @Override
    public void subscribersCountNegativeBalance(Subscriber[] subscribers) {
        int countNegativeBalance = 0;
        for (Subscriber subs : subscribers) {
            if (subs.getBalance() < 0) countNegativeBalance++;
        }
        if (countNegativeBalance != 0)
            System.out.printf("\nКількість абонентів з негативним балансом: %d абон.\n", countNegativeBalance);
        else System.out.printf("\nАбоненти з негативним балансом відсутні\n");

    }
}
