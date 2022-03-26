package javatest;

import com.sun.source.tree.Tree;

import java.io.*;
import java.util.*;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

//点名器 从文件中读取全班同学的姓名 储存到集合中 并随机点名
//public class Test {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br=new BufferedReader(new FileReader("D:\\java\\test\\java.txt"));
//        ArrayList<String>array=new ArrayList<>();
//        String line;
//        while((line=br.readLine())!=null){
//            array.add(line);
//        }
//        Random index= new Random();
//        int i = index.nextInt(array.size());
//        System.out.println("幸运者是："+array.get(i));
//        br.close();
//    }
//}


//文件到集合改进版：这里集合中的对象是student类型
//class student{
//    private String name;
//    private int age;
//    private String address;
//
//    public student() {
//    }
//
//    public student(String name, int age, String address) {
//        this.name = name;
//        this.age = age;
//        this.address = address;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    public String getAddress() {
//        return address;
//    }
//
//    public void setAddress(String address) {
//        this.address = address;
//    }
//}
//public class Test {
//    public static void main(String[] args) throws IOException{
//        BufferedReader br=new BufferedReader(new FileReader("D:\\java\\test\\java.txt"));
//        ArrayList<student>array=new ArrayList<>();
//        String line;
//        while((line=br.readLine())!=null){
//            String[] sp = line.split(",");//用split分割
//            student s=new student();
//            s.setName(sp[0]);
//            s.setAge(Integer.parseInt(sp[1]));
//            s.setAddress(sp[2]);
//            array.add(s);
//        }
//        for(student s:array){
//            System.out.println(s.getName()+","+s.getAge()+","+s.getAddress());
//        }
//        br.close();
//    }
//}

/*
集合到文件数据排序改进版
按学生总分排序
 */
//class student {
//    private String name;
//    private int c;
//    private int m;
//    private int e;
//
//    public student() {
//    }
//
//    public student(String name, int c, int m, int e) {
//        this.name = name;
//        this.c = c;
//        this.m = m;
//        this.e = e;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getC() {
//        return c;
//    }
//
//    public void setC(int c) {
//        this.c = c;
//    }
//
//    public int getM() {
//        return m;
//    }
//
//    public void setM(int m) {
//        this.m = m;
//    }
//
//    public int getE() {
//        return e;
//    }
//
//    public void setE(int e) {
//        this.e = e;
//    }
//
//    public int getsum() {
//        return this.c + this.m + this.e;
//    }
//}
//
//public class Test {
//    public static void main(String[] args) throws IOException {
//        TreeSet<student> ts = new TreeSet<>(new Comparator<student>() {
//            @Override
//            public int compare(student s1, student s2) {
//                int num1 = s2.getsum() - s1.getsum();
//                int num2 = num1 == 0 ? s2.getC() - s1.getC() : num1;
//                int num3 = num2 == 0 ? s2.getM() - s1.getM() : num2;
//                int num4 = num3 == 0 ? s2.getName().compareTo(s1.getName()) : num3;
//                return num4;
//            }
//        });
//        for (int i = 1; i <= 3; i++) {
//            Scanner sc = new Scanner(System.in);
//            System.out.println("请输入第" + i + "个学生的信息");
//            System.out.println("姓名：");
//            String name = sc.nextLine();
//            System.out.println("语文成绩：");
//            int c = sc.nextInt();
//            System.out.println("数学成绩：");
//            int m = sc.nextInt();
//            System.out.println("英语成绩：");
//            int e = sc.nextInt();
//            student s = new student();
//            s.setName(name);
//            s.setC(c);
//            s.setM(m);
//            s.setE(e);
//            ts.add(s);
//        }
//        BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\java\\test\\java.txt"));
//        for(student s:ts){
//            StringBuilder sb=new StringBuilder();
//            sb.append(s.getName()).append(",").append(s.getC()).append(",").append(s.getM()).append(",").append(s.getE()).append(",").append(s.getsum());
//            bw.write(sb.toString());
//            bw.newLine();
//            bw.flush();
//        }
//        bw.close();
//    }
//}


//复制单级文件夹：即该文件夹下没有文件夹 我们这里以D:\\java\\test\\javacc文件夹举例
//public class Test {
//    public static void main(String[] args) throws IOException {
//        File file = new File("D:\\java\\test\\javacc");
//        String name = file.getName();
//        File file1 = new File("D:\\java\\test", "javaee");
//        if (!file1.exists()) {
//            file1.mkdir();
//        }
//        File[] files = file.listFiles();
//        for (File sourcefile : files) {//源文件
//            String name1 = sourcefile.getName();
//            File desfile = new File(file1, name1);//复制文件
//            copyfile(sourcefile, desfile);
//        }
//
//    }
//
//    private static void copyfile(File sourcefile, File desfile) throws IOException {
//        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(sourcefile));
//        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(desfile));
//        byte[] by = new byte[1024];
//        int len;
//        while ((len = bis.read(by)) != -1) {
//            bos.write(by);
//        }
//        bis.close();
//        bos.close();
//    }
//}

//标准输入输出流
//标准输入流：
//public class Test {
//    public static void main(String[] args) throws IOException{
//        // public static final InputStream in:标准输入流
//        InputStream is = System.in;//字节流输入
////        int by;
////        while((by=is.read())!=-1){
////            System.out.print((char)by);//输入一个打印一个 不过不能打印汉字
////        }
//
//        //那么可不可以将字节流输入转换为字符流输入呢
////        InputStreamReader isr=new InputStreamReader(is);
////        char[] c=new char[1024];
////        int len;
////        while((len = isr.read(c))!=-1){
////            System.out.print(new String(c,0,len));//可以了
////        }
//
//        //可不可以用readline呢  可以
//        BufferedReader bis=new BufferedReader(new InputStreamReader(System.in));
//        System.out.println("请输入一个字符串：");
//        String line=bis.readLine();
//        System.out.println("你输入的字符串为："+line);
//        System.out.println("请输入一个整数：");
//        int i = Integer.parseInt(bis.readLine());
//        System.out.println("你输入的整数为："+i);
//    }
//}

//标准输出流
/*
System类中有两个静态成员变量
public static InputStream in:标准输入流，
public static PrintStream out:标准输出流
输出语句的本质：是一个标准输出流
PrintStream ps=System.out;
PrintStream类中的方法，System.out都可以使用
 */
//public class Test {
//    public static void main(String[] args) {
//        PrintStream ps = System.out;
//        ps.println("hello");//效果和System.out.println()效果完全相同
//        ps.println("world");
//
//    }
//}

//字节打印流
//PrintStream
//public class Test {
//    public static void main(String[] args) throws IOException{
//        PrintStream ps=new PrintStream("D:\\java\\test\\java.txt");//如果没有java.txt文件 函数会自动创建
//        //使用继承自父类中的write 方法向文件中添加数据 系统将对其自动转码
//      //  ps.write(97);//java.txt中出现'a'
//         使用ps中的特有方法print
////        ps.print(97);//java.txt中9798不换行
////        ps.print(98);
////        ps.println(97); //java.txt中97 98换行
////        ps.println(98);
////        ps.close();//别忘了
//
//    }
//}

//字符打印流
/*
PrintWriter(File file)	使用指定的文件创建新的 PrintWriter，而不进行自动行刷新。
PrintWriter(Writer out, boolean autoFlush)	创建新的 PrintWriter(只要autoFlush为true 文件将自动刷新)
注：字节流创建文件不用刷新 而字符流创建文件要刷新才行
 */
//public class Test {
//    public static void main(String[] args) throws IOException{
//        //PrintWriter(File file)	使用指定的文件创建新的 PrintWriter，而不进行自动行刷新。
//        //PrintWriter pw=new PrintWriter("D:\\java\\test\\java.txt");
//        //使用从父类中继承的方法write
////        pw.write("hello");
////        pw.flush();
////        pw.write("world");
////        pw.flush();//world没有换行
//
////        pw.write("hello");
////        pw.write("\r\n");//手动添加换行符
////        pw.flush();
////        pw.write("world");
////        pw.write("\r\n");
////        pw.flush();//world没有换行
//
//        //使用其特有方法 print或println
////        pw.println("hello");//自动换行  不过这样也很麻烦  可不可以实现自动更新呢？
////        pw.println("world");
////        pw.flush();
//
//
//        //PrintWriter(Writer out, boolean autoFlush)	创建新的 PrintWriter(只要autoFlush为true 文件将自动刷新)
//        PrintWriter pw=new PrintWriter(new FileWriter("D:\\java\\test\\java.txt"),true);
//        pw.println("hello");//自动刷新了 哈哈
//        pw.println("world");
//    }
//}


//对象序列化流
/*
对象序列化：就是将对象保存到磁盘中，或者在网络中传输对象（ObjectOutputStream）
1.这种机制就是使用一个字节序列表示一个对象，该字节序列包含:对象的类型、
对象的数据和对象中存储的属性等信息 字节序列写到文件之后，相当于文件中持久保存了一个对象的信息
2.反之，该字节序列还可以从文件中读取回来，重构对象，对它进行反序列化
 */


//class student implements Serializable{//Serializable接口没有要实现的方法  实现这个接口相当于一种标识 标志这个类可以被序列化和反序列化
//    private String name;
//    private int age;
//
//    public student() {
//    }
//
//    public student(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//}
//
//
//public class Test {
//    public static void main(String[] args) throws IOException{
//        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("D:\\java\\test\\java.txt"));
//        student s=new student("林青霞",18);
//        oos.writeObject(s);//其中s需要能被序列化和反序列化
//        oos.close();
//        //�� sr javatest.student�
//        // ��'ioo I ageL namet Ljava/lang/String;xp
//        // t 	林青霞    被序列化了  看不懂
//
//
//    }
//}

//ObjectInputStream 反序列化基元数据和以前使用 ObjectOutputStream 写入的对象。

//public class Test {
//    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        ObjectInputStream ois=new ObjectInputStream(new FileInputStream("D:\\java\\test\\java.txt"));
//        Object obj = ois.readObject();
//        student s=(student) obj;
//        System.out.println(s.getName()+","+s.getAge());//林青霞,18
//    }
//}

//serialVersionUID和transient:短暂的临时的
/*
用对象序列化流序列化了一个对象后，假如我们修改了对象所属的类文件，读取数据会不会出问题呢?
会出问题，抛出InvalidClassException异常
如果出问题了，如何辫决呢?
给对象所属的类加一个serialVersionUID(序列化ID)  每次改动类是序列化ID将被改变
private static final long serialVersionUID = 42L; 每次给类的序列化ID赋值
如果一个对象中的某个成员变量的值不想被序列化，又该如何实现呢?
给该成员变量加transient（短暂的，临时的）关键文修饰，该关键字标记的成员变量不参与序列化过程
 */

//class student implements Serializable{//Serializable接口没有要实现的方法  实现这个接口相当于一种标识 标志这个类可以被序列化和反序列化
//    private String name;
////    private int age;
//    private transient int age;
//    private int aaa;
////    private int bbb;
//    private static final long serialVersionUID =42L;
//    public student() {
//    }
//
//    public student(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//}
//public class Test {
//    public static void main(String[] args) throws IOException, ClassNotFoundException {
////        Write();
//        Read();//林青霞,18  没改动student类之前
//        //在student中添加一个aaa元素后 有异常：InvalidClassException
//        //添加了 private static final long serialVersionUID =42L;后即便改动也没异常
//        //在age中添加了transient后 林青霞,0 年龄并没有被录进去 以0替代
//    }
//
//    private static void Read() throws IOException, ClassNotFoundException {
//        ObjectInputStream ois=new ObjectInputStream(new FileInputStream("D:\\java\\test\\java.txt"));
//        Object obj = ois.readObject();
//        student s=(student)obj;
//        System.out.println(s.getName()+","+s.getAge());
//        ois.close();
//    }
//
//    private static void Write() throws IOException{
//        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("D:\\java\\test\\java.txt"));
//        student s=new student("林青霞",18);
//        oos.writeObject(s);
//        oos.close();
//    }
//}
//class a{
//    private  transient int a;
//    public void setA(int a){
//        this.a=a;
//    }
//    public int getA(){
//        return a;
//    }
//}
//public class Test {
//    public static void main(String[] args) {
//      a a=new a();
//      a.setA(10);
//        System.out.println(a.getA());//10 说明 即使将a申明为transient类型 也是可以被修改 不过不会被序列化
//
//    }
//}

//进程和线程
/*
进程：正在运行的程序
是系统进行资源分配和调用的独立单位
每个进程都尤有其独立的内存空间和系统资源
线程：进程的单个顺序控制流，是一条执行路径
单线程：一个进程如果只有一条执行路径，则为单线程程序
多线程：一个进程如果有多条执行路径，则称为多线程程序
 */


//有两种方法可以创建新的线程：1.重写一个子类继承Thread方法（要重写run()方法）
// 2.实现类的接口Runnable
/*
方式一：继承Thread类
两个小问题：
1.为什么要重写Run()方法：因为Run()方法是用来封装被线程执行的代码
2.Run方法和start()方法的区别
Run():直接调用被线程封装的代码 直接调用 相当于普通调用 即上一个执行完下一个才开始执行
start():启动线程，然后VM(java虚拟机)调用此线程的Run()方法 多进程调用  上一个没有执行完下一个就可以调用
 */

//class student extends Thread{
//    @Override
//    public void run() {
//        for(int i=0;i<500;i++){
//            System.out.println(i);
//        }
//    }
//}
//
//public class Test {
//    public static void main(String[] args) {
//        student s1=new student();
//        student s2=new student();
////        s1.run();
////        s2.run();//s1的Run执行完后 s2的Run开始执行
//        s1.start();
//        s2.start();//s1的Run还未执行完s2的Run方法已经开始了
//    }
//}

// 设置和获取线程名称
/*
void setName(String name):更改此线程名称为name
String getName();返回此线程的名称
也可以通过构造方法设置线程名称

如何获取当前正在线程的名称
currentThread()	返回对当前正在执行的线程对象的引用。
 */

//class student extends Thread{
//    @Override
//    public void run() {
//        for(int i=0;i<100;i++) {
//            System.out.println(getName() + ":" + i);//默认名字为：Thread-num(num从0到n)
//        }
//    }
//  public student(){}
//  public student(String name){
//        super.setName(name);//调用父类setName方法
//  }
//}
//
//public class Test {
//    public static void main(String[] args) {
////        student s1=new student();
////        student s2=new student();//使用默认线程名称
////        student s1=new student();
////        student s2=new student();
////        s1.setName("高铁");//更改线程名称
////        s2.setName("飞机");
////        student s1=new student("高铁");
////        student s2=new student("飞机");
////        s1.start();
////        s2.start();
//
//        System.out.println(Thread.currentThread().getName());//main 代表我们当前为main线程
//    }
//}


/*
线程优先级：
线程调度：线程有两种调度方式：
1.分时调度模型：所有线程轮流使用cpu使用权 平均分配cpu的时间片
2.抢占式调度模型：优先让优先级高的线程使用cpu 如果优先级相同 则随机选择一个 注:优先级高的线程不一定可以一直占用
cpu的时间片  只是占用的几率高而已

Thread类中设置和获取线程优先级的方法
public final int getPriority():返回此线程的优先级
public final void setPriority():更改此线程的优先级

线程默认优先级为5 优先级范围：1-10
 */
//class student extends Thread{
//    @Override
//    public void run() {
//        for(int i=0;i<500;i++){
//            System.out.println(getName()+":"+i);
//        }
//    }
//}
//
//public class Test {
//    public static void main(String[] args) {
//        student s1=new student();
//        student s2=new student();
//        student s3=new student();
//        s1.setName("高铁");
//        s2.setName("飞机");
//        s3.setName("汽车");
////        System.out.println(s1.getPriority());//5
////        System.out.println(s2.getPriority());//5
////        System.out.println(s3.getPriority());//5  默认值为5
////        s1.setPriority(10);//设置优先级
////        s2.setPriority(5);
////        s3.setPriority(1);
////        s1.start();
////        s2.start();
////        s3.start();
//        System.out.println(Thread.MAX_PRIORITY);//10  最大优先级
//        System.out.println(Thread.MIN_PRIORITY);//5   默认优先级
//        System.out.println(Thread.NORM_PRIORITY);//1  最小优先级
//
//    }
//}

//线程控制
/*
static void sleep(long millis):使当前正在执行的线程停留指定毫秒数
void join()等待这个线程死亡
void setDaemon(boolean on):将此线程标记为守护线程，当运行的线程全是守护线程时 java虚拟机将退出执行
 */

//class student extends Thread {
//    @Override
//    public void run() {
//        for (int i = 0; i < 100; i++) {
//            System.out.println(getName() + ":" + i);
////            try {
////                Thread.sleep(1000);
////            } catch (InterruptedException e) {
////                e.printStackTrace();
////            }
//        }
//    }
//}
//
//public class Test {
//    public static void main(String[] args) {
//        student s1 = new student();
//        student s2 = new student();
//        student s3 = new student();
////        s1.setName("刘备");
////        s2.setName("孙权");
////        s3.setName("曹操");
////        s1.start();
////        s2.start();
////        s3.start();//不加sleep() s1,s2,s3互相争夺cpu时间片
//
////        s1.start();
////        s2.start();
////        s3.start();//使用sleep()  曹操  刘备 孙权 三个依次出现 并且每次出现时间相隔为1s
//
//        //如果我想让刘备先输出完  然后曹操和孙权相怎 使用join
////        s1.start();
////        try {
////            s1.join();
////        } catch (InterruptedException e) {
////            e.printStackTrace();
////        }
////        s2.start();
////        s3.start();
//
//        //如果我想让刘备输出完后曹操和孙权也停止呢  使用setDaemon  （deamon:虚拟光驱  守护进程 恶魔）
//        //将刘备设置为主线程（这里主线程为main）  曹操和孙权设置为守护线程
//        s2.setName("曹操");
//        s3.setName("孙权");
//        //设置主线程为刘备
//        Thread.currentThread().setName("刘备");
//        //设置守护线程
//        s2.setDaemon(true);
//        s3.setDaemon(true);
//        s2.start();
//        s3.start();
//        for (int i = 0; i <= 10; i++) {
//            System.out.println(Thread.currentThread().getName() + ":" + i);
//        }//设置守护线程后 刘备输出完后 曹操和孙权相继停止
//
//    }
//}


//利用实现Runnable接口的方式实现多线程
/*
相比于继承Thread类 实现Runnable 接口的好处
因为MyThread中只是实现了一个Runnable接口  还可以继承其他类 避免了java单继承的局限性
适合多个相同程序的代码去处理同一个资源的情况 把线程和程序的代码，数据有效分离 较好的体现了面向对象的设计思想
 */
//class MyThread implements Runnable {
//    @Override
//    public void run() {
//        for (int i = 0; i < 100; i++) {
//            System.out.println(Thread.currentThread().getName() + ":" + i);
//        }
//    }
//}
//public class Test {
//    public static void main(String[] args) {
//        /*
//        Thread(Runnable target)	分配新对象。Thread
//        Thread(Runnable target, String name)	分配新对象。Thread
//         */
//        MyThread my=new MyThread();
//        Thread s1=new Thread(my,"高铁");
//        Thread s2=new Thread(my,"飞机");//这里会将my中的name修改
//        s1.start();
//        s2.start();
//    }
//}


//买票：共有100张票 有三个窗口同时买票  要求打印出第几个窗口买了第几张票
//class sellTicket implements Runnable {
//    private int ticketnum = 100;
//    @Override
//    public void run() {
//        while(true){
//            if(ticketnum>0){
//                try {
//                    Thread.sleep(100);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                System.out.println(Thread.currentThread().getName()+"正在出售第"+ticketnum+"张票");
//                ticketnum--;
//            }
//        }
//    }
//}
//public class Test {
//    public static void main(String[] args) {
//        sellTicket st=new sellTicket();
//        Thread t1=new Thread(st,"窗口1");
//        Thread t2=new Thread(st,"窗口2");
//        Thread t3=new Thread(st,"窗口3");
//        t1.start();
//        t2.start();
//        t3.start();
//
//    }
//}


//同步代码块解决数据安全问题  就像我们上面的案例中一张票被多次售卖的情况
//synchronized:v.同步 对准 相符

//class sellTicket implements Runnable {
//    private int ticketnum = 100;
//    Object obj=new Object();
//    @Override
//    public void run() {
//        while(true){
//            synchronized (obj) {//同步代码块
//                if (ticketnum > 0) {
////                    try {
////                        Thread.sleep(100);
////                    } catch (InterruptedException e) {
////                        e.printStackTrace();
////                    }
//                    System.out.println(Thread.currentThread().getName() + "正在出售第" + ticketnum + "张票");
//                    ticketnum--;
//                }
//            }
//        }
//    }
//}
//public class Test {
//    public static void main(String[] args) {
//        sellTicket st=new sellTicket();
//        Thread t1=new Thread(st,"窗口1");
//        Thread t3=new Thread(st,"窗口3");
//        Thread t2=new Thread(st,"窗口2");
////        t2.setPriority(8);
////        t1.setPriority(1);
//        t1.start();
//        t2.start();
//        t3.start();
//
//    }
//}

//通过同步方法来同步线程
/*
同步方法：
就是将synchronized关键字加到方法上
格式：修饰符+synchronized+返回值类型+方法名
同步方法的锁的对象：this

同步静态方法：
就是将synchronized关键字加到静态方法上
格式：修饰符+static+synchronized+返回值类型+方法名(注：静态方法中引用的成员变量必须为静态成员变量)
同步静态方法的锁对象：类名.class
 */

//class sellTicket implements Runnable {
//   // private int ticketnum = 100;
//    private static int ticketnum=100;
//    Object obj = new Object();
//    private int x = 0;
//
//    @Override
//    public void run() {
//        while (true) {
//            if (x % 2 == 0) {
//                //synchronized (obj) {//同步代码块 直接锁定锁的对象为obj
//               // synchronized (this) {//同步代码块  同步方法锁定的对象为this
//                synchronized (sellTicket.class) {//静态同步方法锁定的对象为类名.class
//                    if (ticketnum > 0) {
//                        try {
//                            Thread.sleep(100);
//                        } catch (InterruptedException e) {
//                            e.printStackTrace();
//                        }
//                        System.out.println(Thread.currentThread().getName() + "正在出售第" + ticketnum + "张票");
//                        ticketnum--;
//                    }
//                }
//            } else {
////                synchronized (obj) {//同步代码块
////                    if (ticketnum > 0) {
//////                    try {
//////                        Thread.sleep(100);
//////                    } catch (InterruptedException e) {
//////                        e.printStackTrace();
//////                    }
////                        System.out.println(Thread.currentThread().getName() + "正在出售第" + ticketnum + "张票");
////                        ticketnum--;
////                    }
////                }
//                slt();
//            }
//            x++;
//        }
//    }
//
////    public synchronized void slt() {
//////        synchronized (obj) {//同步代码块
//////            if (ticketnum > 0) {
//////                try {
//////                    Thread.sleep(100);
//////                } catch (InterruptedException e) {
//////                    e.printStackTrace();
//////                }
//////                System.out.println(Thread.currentThread().getName() + "正在出售第" + ticketnum + "张票");
//////                ticketnum--;
//////            }
//////        }
////        if (ticketnum > 0) {
////            try {
////                Thread.sleep(100);
////            } catch (InterruptedException e) {
////                e.printStackTrace();
////            }
////            System.out.println(Thread.currentThread().getName() + "正在出售第" + ticketnum + "张票");
////            ticketnum--;
////        }
////    }
//    public static synchronized void slt() {
//        if (ticketnum > 0) {
//            try {
//                Thread.sleep(100);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            System.out.println(Thread.currentThread().getName() + "正在出售第" + ticketnum + "张票");
//            ticketnum--;
//        }
//    }
//}
//
//
//public class Test {
//    public static void main(String[] args) {
//        sellTicket st = new sellTicket();
//        Thread t1 = new Thread(st, "窗口1");
//        Thread t3 = new Thread(st, "窗口3");
//        Thread t2 = new Thread(st, "窗口2");
////        t2.setPriority(8);
////        t1.setPriority(1);
//        t1.start();
//        t2.start();
//        t3.start();
//
//    }
//}

//线程安全的类
/*
StringBuffer
被StringBuilder替代，通常使用StringBuilder类，因为他们的支持相同的操作但StringBuilder更快，因为她不需要同步
Vector  (里面的成员方法被synchronized修饰)，但是如果不需要实现线程安全，建议使用ArrayList代替Vector
实现线程安全）
Hashtable
如果被需要使用对线程，建议使用HashMap代替Hashtable
 */


//Lock锁  接口锁

//class sellTicket implements Runnable {
//    private int ticketnum = 100;
//    Object obj = new Object();
//    Lock lock = new ReentrantLock();
//
//    @Override
//    public void run() {
//        while (true) {
////            lock.lock();
////            if (ticketnum > 0) {
////                try {
////                    Thread.sleep(100);
////                } catch (InterruptedException e) {
////                    e.printStackTrace();
////                }
////                System.out.println(Thread.currentThread().getName() + "正在出售第" + ticketnum + "张票");
////                ticketnum--;
////            }
////            lock.unlock();//但是一般不这样 这样可能导致锁没有被释放
//            try{
//                lock.lock();
//                if (ticketnum > 0) {
//                    try {
//                        Thread.sleep(100);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                    System.out.println(Thread.currentThread().getName() + "正在出售第" + ticketnum + "张票");
//                    ticketnum--;
//                }
//            }finally {
//                lock.unlock();
//            }
//        }
//    }
//}
//
//public class Test {
//    public static void main(String[] args) {
//        sellTicket st = new sellTicket();
//        Thread t1 = new Thread(st, "窗口1");
//        Thread t3 = new Thread(st, "窗口3");
//        Thread t2 = new Thread(st, "窗口2");
//        t1.start();
//        t2.start();
//        t3.start();
//
//    }
//}


//生产者和消费者案例（送牛奶）
//需要达到的目标：送奶工送一瓶奶 用户取一瓶奶
//class Box {//储奶箱
//    private boolean status = false;
//    int milk;
//    public synchronized void  put(int i) {
//        //放奶
//        //如果有奶 等待
//        if(status){
//            try {
//                wait();
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//        this.milk = i;
//        System.out.println("送奶工将第" + milk + "瓶奶放入奶箱");
//        //放完后 改变奶箱状态
//        status=true;
//        //唤醒线程
//        notifyAll();
//    }
//
//    public synchronized void get() {//这里一定要同步化
//        //取奶
//        //如果没有奶  等待
//        if(!status){
//            try {
//                wait();
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//        System.out.println("用户取出第" + milk + "瓶奶");
//        //取完奶后 修改奶箱状态
//        status=false;
//        //唤醒线程
//        notifyAll();
//    }
//
//}
//
//class producer implements Runnable {
//    Box b = new Box();
//
//    public producer(Box b) {
//        this.b = b;
//    }
//    @Override
//    public  void run() {
//        for(int i=1;i<=5;i++){
//            b.put(i);
//        }
//    }
//}
//
//class customer implements Runnable {
//    Box b = new Box();
//
//    public customer(Box b) {
//        this.b = b;
//    }
//    @Override
//    public  void run() {//同步化
//        while(true){
//            b.get();
//        }
//    }
//}
//
//public class Test {
//    public static void main(String[] args) {
//        Box b=new Box();
//        producer p=new producer(b);
//        customer c=new customer(b);
//        Thread t1=new Thread(p);
//        Thread t2=new Thread(c);
//        t1.start();
//        t2.start();
//
//    }
//}




















