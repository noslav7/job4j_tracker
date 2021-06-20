package ru.job4j.oop;

public class Error {
    private boolean active;
    private int status;
    private String message;

    public Error() {
    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public void printInfo() {
        System.out.println("активен: " + active);
        System.out.println("статус: " + status);
        System.out.println("сообщение: " + message);
    }

    public static void main(String[] args) {
        Error miss = new Error();
        miss.printInfo();
        Error mistake = new Error(false, 404, "Страница не существует");
        mistake.printInfo();
        Error issue = new Error(true, 403, "Нет доступа");
        issue.printInfo();
    }

}
