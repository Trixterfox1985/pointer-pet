//Написати клас абстрактний Pet , в якому описати абстрактний метод voice(). Створити класи Cow, Cat, Dog , які наслідуються від Pet. Перевизначити в них метод voice(), так,
// щоб викликаючи його в методі main, на консоль виводилось : “Я кіт- Мяууу-Мяууу”, “Я пес- Гаууу-Гаууу”, “Я корова- Мууу-Мууу”.

public class PetExecution {
    public static void main(String[] args) {

        Pet dog = new Dog();
        Pet cat = new Cat();
        Pet cow = new Cow();
        Dog dog1 = new Dog();

        dog.voice();
        dog1.voice();
        cat.voice();
        cow.voice();
    }
}
