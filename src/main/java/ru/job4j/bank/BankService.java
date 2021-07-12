package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BankService {
    private Map<User, List<Account>> users = new HashMap<>();

    public void addUser(User user) {
    if (!users.containsValue(user)) {
        addUser(user, new ArrayList<Account>());
    }
    }

    public void addAccount(String passport, Account account) {
        if (!users.containsKey(passport)) {
            addAccount(passport, account);
        }
    }

    public User findByPassport(String passport) {
        for (User user : users.keySet()) {
            if (passport == user.getPassport()) {
                addAccount(passport);
            }
        }
        return user;
    }

    public Account findByRequisite(String passport, String requisite) {

            }
            
        }
        return null;
    }

    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean rsl = false;
        return rsl;
    }
}
