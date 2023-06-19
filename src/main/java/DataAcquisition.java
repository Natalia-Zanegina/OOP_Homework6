import java.util.List;
import java.util.Scanner;

public class DataAcquisition {

    private Scanner scanner = new Scanner(System.in);

    public void inputFromConsole(Order order){
        order.clientName = prompt("Имя клиента: ");
        order.product = prompt("Продукт: ");
        order.qnt = Integer.parseInt(prompt("Количество: "));
        order.price = Integer.parseInt(prompt("Цена: "));
    }

    private String prompt(String message){
        System.out.println(message);
        return scanner.nextLine();
    }


    public List<Order> loadFromJson(String path){
        return null; // пока мне сложно реализовать этот метод, оставлю в таком виде
    }

    public List<Order> loadFromXML(String path){
        return null;
    }
}