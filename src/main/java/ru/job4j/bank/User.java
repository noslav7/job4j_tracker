package ru.job4j.bank;

import java.util.Objects;

/**
 * Класс описывает модель рользователя банка.
 */
public class User {
    /**
     * Данная модель пользователя содержит поля
     * номер паспорта и ФИО (имя пользователя).
     */
    private String passport;
    private String username;

    /**
     * Данный конструктор обеспечивает создание пользователя только при условии
     * указания при создании значений обязательных полей.
     * @param passport номер паспорта.
     * @param username ФИО пользователя.
     */
    public User(String passport, String username) {
        this.passport = passport;
        this.username = username;
    }

    /**
     * Данный метод позволяет получить номер паспорта пользователя.
     * @return номер паспорта.
     */
    public String getPassport() {
        return passport;
    }

    /**
     * Данный метод позволяет в случае необходимости указать требования,
     * соответствие которым необходимо проверять при указании номера паспорта.
     * @param passport номер паспорта.
     */
    public void setPassport(String passport) {
        this.passport = passport;
    }

    /**
     * Данный метод позволяет получить имя пользователя.
     * @return имя пользователя.
     */
    public String getUsername() {
        return username;
    }

    /**
     *  Данный метод позволяет в случае необходимости указать требования,
     *  соответствие которым необходимо проверять при первоначальном
     *  указании имени пользователя.
     * @param username имя пользователя.
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Метод отвечает за специфическую для данного класса реализацию
     * метода equals() базового класса Object.
     * @param o (объект) в данном случае, пользователь.
     * @return результат проверки соответсвия указанных реквизитов,
     * реквизитам пользователя.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        User user = (User) o;
        return Objects.equals(passport, user.passport);
    }

    /**
     * Метод отвечает за специфическую для данного класса реализацию
     * метода hashCode() базового класса Object для оптимизации в дальнейшем
     * поиска номера паспорта.
     * @return номер паспорта в более компактном представлении.
     */
    @Override
    public int hashCode() {
        return Objects.hash(passport);
    }
}
