public class Cat extends Animal{
    boolean vislouhiy;
    public Cat(String food, String location, boolean vislouhiy) {
        super(food, location);
        this.vislouhiy = vislouhiy;
    }

    @Override
    public void makeNoise() {
        System.out.println("Мяу");
    }

    @Override
    public void eat() {
        System.out.println("Кошка ест");
    }

    @Override
    public void sleep() {
        System.out.println("Кошка спит");
    }
}
