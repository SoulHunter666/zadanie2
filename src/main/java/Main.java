public class Main {
    public static void main(String[] args) {
        veterinar  veterinar = new veterinar();
        Animal a1  = new Animal("Ягоды", "Нора");
        a1.makeNoise();
        a1.eat();
        a1.sleep();
        System.out.println();
        Dog d1  = new Dog("Мясо","Бутка","Немецкая овчарка");
        System.out.println("Собака ест: " + d1.food + "; Местоположение собаки: "+ d1.location + "; Порода: " + d1.poroda);
        d1.makeNoise();
        d1.eat();
        d1.sleep();
        System.out.println();
        Cat c1 = new Cat("Корм","Дом", true);
        if(c1.vislouhiy == true)
        System.out.println("Кошка ест: " + c1.food + "; Местоположение кошки: "+ c1.location + "; Кошка вислоухая");
        else
            System.out.println("Собака ест: " + d1.food + "; Местоположение собаки: "+ d1.location + "; Кошка не вислоухая");
        c1.makeNoise();
        c1.eat();
        c1.sleep();
        System.out.println();
        Horse h1 = new Horse("Сено","Сеновал", false);
        if(h1.podkovi == true)
        System.out.println("Лошадь ест: " + d1.food + "; Местоположение лошади: "+ d1.location + "; У лошади есть подковы");
        else
            System.out.println("Собака ест: " + d1.food + "; Местоположение собаки: "+ d1.location + "; У лошади нет подков");
        h1.makeNoise();
        h1.eat();
        h1.sleep();
        Animal[]allAnimals = {d1,c1,h1};
        for(int i = 0; i<allAnimals.length;i++){
            veterinar.treatAnimal(allAnimals[i]);
        }

    }
}
