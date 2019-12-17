package ru.job4j.stragery;

public class Square implements Shape {

    @Override
    public String draw() {
        StringBuilder sb = new StringBuilder();
        sb.append("+++" + System.lineSeparator());
        sb.append("+ +" + System.lineSeparator());
        sb.append("+++" + System.lineSeparator());
        return sb.toString();
    }
}
