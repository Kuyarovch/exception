public class BaseMinimum extends Exception {

    // Конструктор по умолчанию
    public BaseMinimum() {
        super();
    }

    // Конструктор с сообщением об ошибке
    public BaseMinimum(String message) {
        super(message);
    }

    // Конструктор с сообщением и причиной 
    public BaseMinimum(String message, Throwable cause) {
        super(message, cause);
    }
}
