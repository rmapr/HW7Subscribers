package callPhoneBook;

public interface SubscriberService {

    void subscribersCityCallDuration (Subscriber[] subscribers, int time);
    void subscribersInterCityCallDuration (Subscriber[] subscribers);
    void subscribersSearchFirstLetterLastName (Subscriber[] subscribers, char firstLetterLastName);
    void subscribersTotalInternetTrafficCity (Subscriber[] subscribers, String city);
    void subscribersCountNegativeBalance (Subscriber[] subscribers);



}
