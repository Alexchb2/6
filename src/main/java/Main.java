import ru.netology.sqr.untitled.services.SQRService;

public class Main {

    public static void main(String[] args) {
        SQRService service = new SQRService();
        int number = service.calcNumber(200,300);
        System.out.println("Количество квадратных корней в диапазоне от 10 до 99: " + number);
    }
}
