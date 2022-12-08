class MyEmployee{
    private int id;
    private String name;

    public String getName(){
        return name;
    }
    public void setName(String n){
        this.name = n;
    }
    public void setId(int i){
        this.id = i;
    }
    public int getId(){
        return id;
    }
}
public class SetterGetter {
    public static void main(String[] args) {
         MyEmployee e= new MyEmployee();
        e.setName("CodeWithMyEmployee");
        System.out.println(e.getName());
        e.setId(234);
        System.out.println(e.getId());
    }
}
