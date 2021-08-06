package ru.job4j.bank;

import java.util.*;

/**
 * Класс описывает работу основных банковских услуг, которые предоставляются
 * по банковским счетам клиентов.
 * @author VALENTIN RACHKOV
 * @version 1.0
 */
public class BankService {

    /**
     * Это поле содержит всех пользователей системы с привязанными к ним счетами.
     */
    private final Map<User, List<Account>> users = new HashMap<>();

    /**
     * Этот метод должен добавить пользователя в систему.
     * @param user пользователь, зарегистрированный в системе.
     */
    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<>());
    }

    /**
     * Метод должен добавить новый счет к пользователю.
     * @param passport данные паспорта, по которым необходимо
     *                 первоначально найти пользователя.
     * @param account получаемый затем список всех счетов пользователя, в
     *               который в результате добавляется новый счет.
     */
    public void addAccount(String passport, Account account) {
        Optional<User> user = findByPassport(passport);
        if (user.isPresent() && !users.get(user).contains(account)) {
            users.get(user).add(account);
        }
    }

    /**
     * Данный метод ищет пользователя по номеру паспорта.
     * @param passport данные паспорта.
     * @return зарегистрированный пользователь или null,
     * если пользователь не найден.
     */
    public Optional<User> findByPassport(String passport) {
        Optional<User> passportOptional = Optional.empty();
        passportOptional = users.keySet()
                          .stream()
                          .filter(s -> s.getPassport().equals(passport))
                          .findFirst();
              return passportOptional;
    }

    /**
     * Этот метод ищет счет пользователя по реквизитам.
     * @param passport сначала необходимо найти пользователя по данным паспоррта.
     * @param requisite затем получить список счетов этого пользователя,
     *                 и в нем найти счет.
     * @return номер искомого счета пользователя или null,
     * счет по указанным реквизитам не найден.
     */
    /*
    public Optional<User> findByRequisite(String passport, String requisite) {
        Optional<User> user = findByPassport(passport);
        if (user.isPresent()) {
            user = account.keySet()
                    .stream()
                    .filter(s -> s.getRequisite().equals(requisite))
                    .findFirst();
            return user;
        }

    }*/

    /**
     * Метод для перечисления денег с одного счёта на другой счёт.
     * @param srcPassport номер паспорта пользователя отправителя платежа.
     * @param srcRequisite реквизиты счета пользователя отправителя платежа.
     * @param destPassport номер паспорта получателя перечисления.
     * @param destRequisite реквизиты счета получателя перечисления.
     * @param amount перечисляемая сумма.
     * @return Если счёт не найден или не хватает денег на счёте srcAccount
     * (с которого переводят), то метод должен вернуть false. Если счет найден
     * и средств для перевода достаточно, то метод вернет true.
     */
    public void transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {}}
        /*boolean rsl = false;
        var srcAccount = findByRequisite(srcPassport, srcRequisite);
        var destAccount = findByRequisite(destPassport, destRequisite);
        if (srcAccount != null && destAccount != null && srcAccount.getBalance() >= amount) {
            srcAccount.setBalance(srcAccount.getBalance() - amount);
            destAccount.setBalance(destAccount.getBalance() + amount);
            rsl = true;
        }
        return rsl;
    }*/

    /**
     * Метод создает новый счет, а также добавляет его в список счетов и
     * выводит на экран реквизиты данного счета и его текущий баланс.
     */
    /*
    public static void main(String[] args) {
        List<Account> accounts = new ArrayList<>();
        String requisite = "3fdsbb9";
        accounts.add(new Account("3fdsbb9", 140));
        int index = accounts.indexOf(new Account(requisite, -1));
        Account find = accounts.get(index);
        System.out.println(find.getRequisite() + " -> " + find.getBalance());

}*/