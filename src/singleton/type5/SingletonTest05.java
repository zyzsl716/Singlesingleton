package singleton.type5;



public class SingletonTest05 {

        public static void main(String[] args) {
            System.out.println("双重检查");
            Singleton instance = Singleton.getInstance();
            Singleton instance1 =Singleton.getInstance();
            System.out.println(instance == instance1); //true
        }
    }

    //懒汉式（线程安全，同步问题）
    class Singleton{
        private static volatile Singleton instance;

        private Singleton(){ }

        //提供一个静态的共有方法，加入双重检查代码，解决线程安全问题，同时解决懒加载问题
        //推荐使用


        public static synchronized Singleton getInstance(){
            if(instance==null){
                synchronized (Singleton.class){
                    if(instance==null){
                        instance=new Singleton();
                    }
            }

        }
            return instance;
    }
}
