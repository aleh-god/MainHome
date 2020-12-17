package GenericLearn;

// на момент написания класса мы можем точно не знать, что лучше выбрать для хранения идентификатора - строки или числа.
// Либо, возможно, этот класс будет использоваться другими разработчиками, которые могут иметь свое мнение по данной проблеме.
// Например, в качестве типа id они захотят использовать какой-то свой класс.
// Обобщения позволяют не указывать конкретный тип, который будет использоваться.

//С помощью буквы T в определении класса class Account<T> мы указываем, что данный тип T будет использоваться этим классом.
//Например ArrayList будет использовать <double> в своей коллекции.
//Параметр T в угловых скобках называется универсальным параметром, так как вместо него можно подставить любой тип
class Account<T>{

    private T id;
    private int sum;

    Account(T id, int sum){
        this.id = id;
        this.sum = sum;
    }

    public T getId() { return id; }
    public int getSum() { return sum; }
    public void setSum(int sum) { this.sum = sum; }
}
