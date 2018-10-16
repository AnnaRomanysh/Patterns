package creational.builder;

public class Usage {

    public static void main(String[] args) {
        BookingRequest bookingRequest = BookingRequest.getBuilder()
                .setCountry("USA")
                .setCity("New York")
                .setHotelName("Paradise")
                .build();

        System.out.println(bookingRequest);


    }
}
