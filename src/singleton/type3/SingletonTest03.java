package singleton.type3;

public class SingletonTest03 {
    public static void main(String[] args) {
        System.out.println("懒汉式1：线程不安全~");
        Singleton instance = Singleton.getInstance();
        Singleton instance1= Singleton.getInstance();
        System.out.println(instance==instance1); //true
    }
}

class Singleton{
    private static Singleton instance;

    private Singleton(){

    }

    //提供一个静态的共有方法，当使用到该方法时，采取创建instance
    //即懒汉式
    //只能在单线程下使用，多线程下不可使用
    public static Singleton getInstance(){
        if(instance==null){
            instance=new Singleton();
        }
        return instance;
    }
}