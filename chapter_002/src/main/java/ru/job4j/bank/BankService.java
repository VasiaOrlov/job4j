package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BankService {
    private Map<User, List<Account>> users = new HashMap<>();

    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<>());
    }

    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        List<Account> accounts = users.get(user);
        boolean notExist = true;
        for (Account x : accounts) {
            if (x.equals(account)) {
                notExist = false;
                break;
            }
        }
        if (notExist) {
            accounts.add(account);
            users.put(user, accounts);
        }
    }

    public User findByPassport(String passport) {
        for (User user : users.keySet()) {
            if (user.getPassport().equals(passport)) {
                return user;
            }
        }
        return null;
    }

    public Account findByRequisite(String passport, String requisite) {
        for (User user : users.keySet()) {
            if (user.getPassport().equals(passport)) {
                for (Account account : users.get(user)) {
                    if (account.getRequisite().equals(requisite)) {
                        return account;
                    }
                }
            }
        }
        return null;
    }

    public boolean transferMoney(String srcPassport,
                                 String srcRequisite,
                                 String destPassport,
                                 String destRequisite,
                                 double amount) {
        Account srcAccount = findByRequisite(srcPassport, srcRequisite);
        Account destAccount = findByRequisite(destPassport, destRequisite);
        User srcUser = findByPassport(srcPassport);
        User destUser = findByPassport((destPassport));
        int srcIndex = users.get(srcUser).indexOf(srcAccount);
        int destIndex = users.get(destUser).indexOf(destAccount);
        boolean rsl = users.get(srcUser).contains(srcAccount)
                && srcAccount.getBalance() >= amount
                && users.get(destUser).contains(destAccount);
        if (rsl) {
            srcAccount.setBalance(srcAccount.getBalance() - amount);
            destAccount.setBalance(destAccount.getBalance() + amount);
            users.get(srcUser).set(srcIndex, srcAccount);
            users.get(destUser).set(destIndex, destAccount);
        }
        return rsl;
    }
}