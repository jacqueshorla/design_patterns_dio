package Patterns.singleton;

public class TesteSingleton {
    public static void main(String[] args) {
        SingletonLazy sl = SingletonLazy.getInstancia();
        System.out.println(sl);
        SingletonLazy sl2 = SingletonLazy.getInstancia();
        System.out.println(sl2);

        SingletonLazyHolder sll = SingletonLazyHolder.getInstancia();
        System.out.println(sll);
        SingletonLazyHolder sl2l = SingletonLazyHolder.getInstancia();
        System.out.println(sl2l);
    }
}
