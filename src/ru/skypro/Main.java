package ru.skypro;

public class Main {
    public static void authorization(String login) {
        if (login.length() > 20) {
            System.out.println("длинна больше 20");
        } else if (login.matches("[A-z1-9._]+")){
            System.out.println(login);
        }
    }
    public static void main(String[] args) {
        authorization("privet");
    }
}
