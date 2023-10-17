package com.company;

class Donut {
    String type;
    int calories;
    double price;
    String description;

    Donut() {
        type = "glazed";
        calories = 200;
        price = 1.99;
        description = "a glazed donut";
    }

    public Donut(String type, int calories, double price, String description) {
        this.type = type;
        this.calories = calories;
        this.price = price;
        this.description = description;
    }


    @Override
    public String toString() {
        return "Donut{" +
                "type='" + type + '\'' +
                ", calories=" + calories +
                ", price=" + price +
                ", description='" + description + '\'' +
                '}';
    }
}
    public class Main {

        public static void main(String[] args) {
            Donut d = new Donut();
            System.out.println(d);

            Donut a = new Donut("cake",300,1.00,"its chocolate");
            System.out.println(a);

            Donut c = new Donut("chocolate",100,1.50,"its double the flavor");
            System.out.println(c);

            Donut b = new Donut("jelly",150,1.09,"it has a jelly filling");
            System.out.println(b);

            Donut g = new Donut("munchkins",300,3.00,"comes in different flavors");
            System.out.println(g);

            Donut j = new Donut("powdered",170,1.30,"it has a powdered outside");
            System.out.println(j);
        }


    }
