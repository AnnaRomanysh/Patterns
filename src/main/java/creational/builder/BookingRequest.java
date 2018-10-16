package creational.builder;


public class BookingRequest {
    private String country;
    private String city;
    private int hotelStars;
    private float minPrice;
    private float maxPrice;
    private String hotelName;
    private String roomType;
    private String bedType;

    private BookingRequest( ) {
    }


    public  class BookingRequestBuilder {
        private String country;
        private String city;
        private int hotelStars;
        private float minPrice;
        private float maxPrice;
        private String hotelName;
        private String roomType;
        private String bedType;

        private BookingRequestBuilder(){ }

        public BookingRequestBuilder setCountry(String country) {
            BookingRequest.this.country = country;
            return this;
        }

        public BookingRequestBuilder setCity(String city) {
            BookingRequest.this.city = city;
            return this;
        }

        public BookingRequestBuilder setHotelStars(int hotelStars) {
            BookingRequest.this.hotelStars = hotelStars;
            return this;
        }

        public BookingRequestBuilder setMinPrice(float minPrice) {
            BookingRequest.this.minPrice = minPrice;
            return this;
        }

        public BookingRequestBuilder setMaxPrice(float maxPrice) {
            BookingRequest.this.maxPrice = maxPrice;
            return this;
        }

        public BookingRequestBuilder setHotelName(String hotelName) {
            BookingRequest.this.hotelName = hotelName;
            return this;
        }

        public BookingRequestBuilder setRoomType(String roomType) {
            BookingRequest.this.roomType = roomType;
            return this;
        }

        public BookingRequestBuilder setBedType(String bedType) {
            BookingRequest.this.bedType = bedType;
            return this;
        }

        public BookingRequest build() {
            return BookingRequest.this;
        }

    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getHotelStars() {
        return hotelStars;
    }

    public void setHotelStars(int hotelStars) {
        this.hotelStars = hotelStars;
    }

    public float getMinPrice() {
        return minPrice;
    }

    public void setMinPrice(int minPrice) {
        this.minPrice = minPrice;
    }

    public float getMaxPrice() {
        return maxPrice;
    }

    public void setMaxPrice(int maxPrice) {
        this.maxPrice = maxPrice;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public String getBedType() {
        return bedType;
    }

    public void setBedType(String bedType) {
        this.bedType = bedType;
    }

    public static BookingRequestBuilder getBuilder(){
        return new BookingRequest().new BookingRequestBuilder();
    }

    @Override
    public String toString() {
        return "BookingRequest{" +
                "country='" + country + '\'' +
                ", city='" + city + '\'' +
                ", hotelStars=" + hotelStars +
                ", minPrice=" + minPrice +
                ", maxPrice=" + maxPrice +
                ", hotelName='" + hotelName + '\'' +
                ", roomType='" + roomType + '\'' +
                ", bedType='" + bedType + '\'' +
                '}';
    }
}
