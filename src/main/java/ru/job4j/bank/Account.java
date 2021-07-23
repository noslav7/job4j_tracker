package ru.job4j.bank;

import java.util.Objects;

/**
 * Класс описывает модель банковского счета.
 */
public class Account {
    /**
     * Данная модель счета содержит поля
     * реквизиты и баланс.
     */
    private String requisite;
    private double balance;

    /**
     * Данный конструктор обеспечивает создание счета только при условии
     * указания при создании значений обязательных полей.
     * @param requisite реквизиты счета.
     * @param balance баланс счета.
     */
    public Account(String requisite, double balance) {
        this.requisite = requisite;
        this.balance = balance;
    }

    /**
     * Данный метод позволяет получить реквизиты счета.
     * @return реквизиты счета.
     */
    public String getRequisite() {
        return requisite;
    }

    /**
     * Данный метод позволяет в случае необходимости указать требования,
     * соответствие которым необходимо проверять при указании реквизитов счета.
     * @param requisite реквизиты счета.
     */
    public void setRequisite(String requisite) {
        this.requisite = requisite;
    }

    /**
     * Данный метод позволяет получить текущий баланс счета.
     * @return баланс счета.
     */
    public double getBalance() {
        return balance;
    }

    /**
     *  Данный метод позволяет в случае необходимости указать требования,
     *  соответствие которым необходимо проверять при первоначальном
     *  указании баланса счета.
     * @param balance баланс счета.
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     * Метод отвечает за специфическую для данного класса реализацию
     * метода equals() базового класса Object.
     * @param o (объект) в данном случае, счет.
     * @return результат проверки соответсвия указанных реквизитов,
     * реквизитам создаваемого счета.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Account account = (Account) o;
        return Objects.equals(requisite, account.requisite);
    }

    /**
     * Метод отвечает за специфическую для данного класса реализацию
     * метода hashCode() базового класса Object для оптимизации в дальнейшем
     * поиска созданного счета.
     * @return реквизиты в более компактном представлении.
     */
    @Override
    public int hashCode() {
        return Objects.hash(requisite);
    }
}
