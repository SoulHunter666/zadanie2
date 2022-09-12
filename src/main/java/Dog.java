public class Dog extends Animal{
    String poroda;
    public Dog(String food, String location, String poroda) {
        super(food, location);
        this.poroda = poroda;
    }

    @Override
    public void makeNoise() {
        System.out.println("Гав");
    }

    @Override
    public void eat() {
        System.out.println("Собака ест");
    }

    @Override
    public void sleep() {
        System.out.println("Собака спит");
    }
}
