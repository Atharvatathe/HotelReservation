import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import java.nio.channels.ScatteringByteChannel;


public class HotelReservationTest {

    @Test
    public void givenHotelName_And_RegularCustomerRate_ShouldAddHotel()throws Exception{
        Hotel hotel = new Hotel();
        hotel.setHotelName("Lakewood");
        hotel.setRegularCustomerRate(110);
        Assertions.assertEquals("Lakewood",hotel.getHotelName());
        Assertions.assertEquals(110,hotel.getRegularCustomerRate());
    }

    @Test
    public void givenHotelName_is_Empty_ShouldThreowException()throws Exception {
        Hotel hotel = new Hotel();
        hotel.setHotelName("");
        Assertions.assertEquals("",hotel.getHotelName());
    }

    @Test
    public void givenRegularCustomerRate_is_0_ShouldThreowException()throws Exception {
        Hotel hotel = new Hotel();
        hotel.setRegularCustomerRate(0);
        Assertions.assertEquals(0,hotel.getRegularCustomerRate());
    }
}
