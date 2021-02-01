public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        ObjectClone original = new ObjectClone(100);

//      clone() - метод класса Object. Создает точную копию объекта, тип возвращаемого объекта Object.
//      для его реализации придется обработать исключение и реализовать интерфейс Cloneable.
        ObjectClone copy= (ObjectClone) original.clone();
        System.out.println(copy+":"+copy.getSize());
        System.out.println(original+":"+original.getSize());
    }
}
