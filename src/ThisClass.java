class OneClass{
    int a;
    public int getA() {
        return a;
    }
    OneClass(int a){
        this.a = a;
    }
    public int returnone(){
        return 1;
    }
}
class TwoClass extends OneClass{

    TwoClass(int c)
    { super(c);
    System.out.println("I am a constructor");
    }
}
public class ThisClass {
    public static void main(String[] args) {
        OneClass e = new OneClass(65);
        TwoClass d = new TwoClass(5);
        System.out.println(e.getA()); } }
