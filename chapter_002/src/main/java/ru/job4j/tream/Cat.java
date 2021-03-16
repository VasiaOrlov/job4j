package ru.job4j.tream;

public class Cat {
    private String name;
    private String breed;
    private int age;
    private double weight;
    private boolean vaccinations;

    public static class Builder {
        private String name;
        private String breed;
        private int age;
        private double weight;
        private boolean vaccinations;

        public Builder buildName(String name) {
            this.name = name;
            return this;
        }

        public Builder buildBreed(String breed) {
            this.breed = breed;
            return this;
        }

        public Builder buildAge(int age) {
            this.age = age;
            return this;
        }

        public Builder buildWeight(double weight) {
            this.weight = weight;
            return this;
        }

        public Builder buildVaccinations(boolean vaccinations) {
            this.vaccinations = vaccinations;
            return this;
        }

        public Cat build() {
            Cat cat = new Cat();
            cat.name = name;
            cat.breed = breed;
            cat.age = age;
            cat.weight = weight;
            cat.vaccinations = vaccinations;
            return cat;
        }
    }

    @Override
    public String toString() {
        return "Cat{"
                + "name = '" + name + '\''
                + ", breed = '" + breed + '\''
                + ", age = " + age
                + ", weight = " + weight
                + ", vaccinations = " + vaccinations
                + '}';
    }

    public static void main(String[] args) {
        Cat cat = new Builder()
                .buildName("Cat")
                .buildBreed("Persian cat")
                .buildAge(5)
                .buildWeight(2.1)
                .buildVaccinations(true)
                .build();
        System.out.println(cat);
    }
}
