import java.io.IOException;
import java.text.ParseException;

public class Program {
    public static void main(String[] args) throws IOException, ParseException {
        Order order1 = new Order();
        DataAcquisition data = new DataAcquisition();
        data.inputFromConsole(order1);
        System.out.println(order1);

        OrderSerializer serializer = new OrderSerializer();
        serializer.saveToJson(order1);
    }
}
