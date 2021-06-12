package singleton.type4;

public class SingletonTest04 {
    public static void main(String[] args) {
        System.out.println("懒汉式2：线程安全~");
        Singleton instance = Singleton.getInstance();
        Singleton instance1 = Singleton.getInstance();
        System.out.println(instance == instance1); //true
    }
}

//懒汉式（线程安全，同步问题）
class Singleton{
    private static Singleton instance;

    private Singleton(){

    }

    //提供一个静态的共有方法，加入同步处理的代码，解决线程安全问题
    //效率低下，每个线程字啊获取实例时都要进行同步
    //即懒汉式

    public static synchronized Singleton getInstance(){
        if(instance==null){
            instance=new Singleton();
        }
        return instance;
    }
}