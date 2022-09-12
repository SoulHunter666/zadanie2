public class Horse extends Animal{
    boolean podkovi;
    public Horse(String food, String location, boolean podkovi) {
        super(food, location);
        this.podkovi = podkovi;
    }

    @Override
    public void makeNoise() {
        System.out.println("Лошадь ржёт");
    }

    @Override
    public void eat() {
        System.out.println("Лошадка кушает");
    }

    @Override
    public void sleep() {
        System.out.println("Лошадь спит стоя!");
    }
}
