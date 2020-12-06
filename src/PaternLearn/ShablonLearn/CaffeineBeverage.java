package PaternLearn.ShablonLearn;

//Шаблонный Метод определяет основные шаги алгоритма и позволяет субклассам предоставить реализацию одного или нескольких шагов.
public abstract class CaffeineBeverage {

    //Бесспорно, это метод. Он служит шаблоном для алгоритма - пАТЕРН шАМБЛОННЫЙ МЕТОД.
    // Теперь для приготовления чая и кофе будет использоваться один метод — prepareRecipe().
    // Этот метод объявлен с ключевым словом final, потому что суперклассы не должны переопределять этот метод!
    // final можно использовать не создавая объект класса.
    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        //addCondiments(); - простой вариант
        //Добавляем условную конструкцию, результат которой определяется вызовом конкретного метода customerWantsCondiments().
        //Только если вызов вернет true, мы вызываем addCondiments().
        if (customerWantsCondiments()) {
            addCondiments();
        }
    }

    // Шаги 2 и 4 заменены обобщенными вызовами brew() и addCondiments().
    // Методы, которые будут изменятся в зависимости от рецепта
    abstract void brew();
    abstract void addCondiments();

    //Неизменные методы, общие для всех рецептов

    //Конкретная операция определяется в абстрактном классе. Эта объявлена с ключевым словом final, чтобы субклассы не могли переопределить ее.
    //Она может использоваться как напрямую шаблонным методом, так и субклассами.
    final void boilWater() {
        System.out.println("Boiling water");
    }

    //Субклассы могут переопределять такие методы, но не обязаны это делать.
    //У метода есть реализация "по умолчанию".
    void pourInCup() {
        System.out.println("Pouring into cup");
    }

    // «Перехватчиком» называется метод, объявленный абстрактным классом, но имеющий пустую реализацию (или реализацию по умолчанию).
    //Он дает возможность субклассу «подключаться» к алгоритму в разных точках. Впрочем, субкласс также может проигнорировать имеющийся перехватчик.
    void hook() {}

    //Метод с (почти) пустой реализацией по умолчанию: просто возвращает true, и не делает ничего более.
    //Перехватчик: субкласс может переопределить этот метод, но не обязан этого делать.
    boolean customerWantsCondiments() {
        return true;
    }
}
