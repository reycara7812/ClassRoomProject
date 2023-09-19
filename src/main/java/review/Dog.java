package review;

public class Dog {
    private int age;
    public String breed;
    public Dog(int dogsAge, String breed){
        this.age = dogsAge;
        this.breed = breed;
    }

    public Dog(int dogsAge){
        this.age = dogsAge;
    }

    public void setAge(int dogsAge){

        if (dogsAge < 0){
            System.out.println("Dogs age cannot be less than 0");
        }else {
            this.age = dogsAge;
        }
    }
    public int getAge(){
        return age;
    }
    public void eat(){
        System.out.println("Dogs eat bones");
    }

    public String getBreed() {
        return breed;
    }
}