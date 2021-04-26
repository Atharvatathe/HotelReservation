public class Hotel {
    private String hotelName;
    private int regularCustomerRate;
    private String startDate, endDate;

    //Set the hotel Name
    public void setHotelName(String hotelName) throws Exception {
        try {
            if (hotelName.isEmpty())
                throw new Exception("Hotel Name is Empty!"); // will throw exception if hotel name is empty
            this.hotelName = hotelName;
        } catch (Exception e) {
            throw e;
        }
    }

    //Set the Rate of Regular customer
    public void setRegularCustomerRate(int regularCustomerRate) throws Exception {
        try {
            if (regularCustomerRate == 0)
                throw new Exception("Regular customer rates is not provide");  // will throw exception if rate is 0
            this.regularCustomerRate = regularCustomerRate;
        } catch (Exception e) {
            throw e;
        }
    }

    //Get the hotel name
    public String getHotelName(){
        return hotelName;
    }

    //Get the Rate of Regular customer
    public int getRegularCustomerRate(){

        return regularCustomerRate;
    }

}
