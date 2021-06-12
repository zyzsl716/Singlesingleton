package singleton.type1;

public class SingletonTest01 {
    public static void main(String args[]){
        //测试
        Singleton instance = Singleton.getInstance();
        Singleton instance1=Singleton.getInstance();
        System.out.println(instance==instance1); //true

    }

}

//饿汉式（静态变量来完成）

class Singleton{
    //1.构造器私有化,外部不能new
    private Singleton(){

    }

    //2.本类内部创建对象实例
    private final static Singleton instance=new Singleton();

    //3.对外提供一个共有静态方法，返回实例对象
    public static Singleton getInstance(){
        return instance;
    }
}
