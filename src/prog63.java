import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

//📔 1. Продумайте структуру класса Кот. Какие поля и методы будут актуальны для
//  приложения, которое является
// а) информационной системой ветеринарной клиники

// Можно записать в текстовом виде, не обязательно реализовывать в java.

// 1. Реализуйте 1 из вариантов класса Cat из предыдущего задания, 
// можно использовать не все придуманные поля и методы. 
// Создайте несколько экземпляров этого класса, выведите их в консоль.

// 2. Добейтесь того, чтобы при выводе в консоль объекта типа Cat, выводилась его кличка, 
// цвет и возраст (или другие параметры на ваше усмотрение).

// 1. Создайте множество, в котором будут храниться экземпляры класса Cat - HashSet<Cat>. 
// Поместите в него некоторое количество объектов.

// 2. Создайте 2 или более котов с одинаковыми параметрами в полях. Поместите их во множество.
// Убедитесь, что все они сохранились во множество.

// 3. Создайте метод

// **public boolean**
// equals(Object o)
// Пропишите в нём логику сравнения котов по параметрам, хранимым в полях. 
// То есть, метод должен возвращать true, только если значения во всех полях сравниваемых объектов равны.

// 4. Создайте метод
// **public int hashCode()**
// который будет возвращать hash, вычисленный на основе полей класса Cat. (Можно использовать Objects.hash(...))
// 5. Выведите снова содержимое множества из пункта 2, убедитесь, что дубликаты удалились.

//public class prog63 {
//    public static void main(String[] args) {
//        Cat cat = new Cat();
//        cat.id = 0001;
//        cat.name = "Барсик";
//        cat.breed = "сибирский";
//        cat.age = 1;
//        cat.color = "серый";
//        cat.ownerName = "Сергей";
//
//        Cat cat2 = new Cat();
//        cat2.id = 0001;
//        cat2.name = "Барсик";
//        cat2.breed = "сибирский";
//        cat2.age = 1;
//        cat2.color = "серый";
//        cat2.ownerName = "Сергей";
//
//        Cat cat3 = new Cat();
//        cat3.id = 0003;
//        cat3.name = "Васька";
//        cat3.breed = "дворовый";
//        cat3.age = 7;
//        cat3.color = "рыжий";
//        cat3.ownerName = "Анна Петровна";
//
//        Cat cat4 = new Cat();
//        cat4.id = 0003;
//        cat4.name = "Васька";
//        cat4.breed = "дворовый";
//        cat4.age = 7;
//        cat4.color = "рыжий";
//        cat4.ownerName = "Анна Петровна";
//
//        //System.out.println(cat.toString());
//        //System.out.println(cat2.toString());
//
//        HashSet<Cat> cats = new HashSet<>();
//        cats = new HashSet<Cat>(Arrays.asList(cat, cat2, cat3, cat4 ));
//        //cats.add(cat);
//
//
//        System.out.println(cat.equals(cat2));
//        System.out.println(cat.equals(cat3));
//        System.out.println(cat2.equals(cat4));
//
//        System.out.println(cat.hashCode());
//        System.out.println(cat2.hashCode());
//        System.out.println(cat3.hashCode());
//        System.out.println(cat4.hashCode());
//
//
//        System.out.println(cats);
//    }
//
//}


