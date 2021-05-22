package exercises.chapter11;

public class Farm {

    public static void main(String[] args) {

        Pig hereford = new Pig();
        hereford.makeSound();
        hereford.eat();

        Duck mallard = new Duck();
        mallard.makeSound();
        mallard.eat();

        Animal tibetan = new Pig();
        tibetan.makeSound();
        tibetan.eat();

        Animal eider = new Duck();
        eider.makeSound();
        eider.eat();
    }
}