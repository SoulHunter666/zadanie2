public class Animal {
    String food;
    String location;
    public Animal(String food, String location){
        this.food = food;
        this.location = location;
    }
    public void makeNoise(){
        System.out.println("Животное издаёт звуки");
    }
    public  void eat(){
        System.out.println("Животное ест еду");
    }
    public void sleep(){
        System.out.println("Животное спит");
    }
}
