package review;

public class Main {
    public static void main(String[] args) {

        Dog corgi = new Dog(15, "Corgi");
        Dog poodle = new Dog(5,"poodle");
        Dog boxer = new Dog(7, "Boxer");
       /* Dog[] pets = new Dog[3];
        pets[0] = poodle;
        pets[1] = corgi;
        pets[2] = boxer; */
        corgi.setAge(99);
        int dogsAge = corgi.getAge();
       // System.out.println(dogsAge);
        Dog[] pets = {corgi, poodle,boxer};

        for (int x = 0; x < pets.length; x++) {
            System.out.println(pets[x].getAge());
        }



















    }
}