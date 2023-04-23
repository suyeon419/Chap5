interface AdderInterface{
    int add(int x, int y); //x+y
    int add(int n); //시그마 n
}
public class MyAdder implements AdderInterface{
    public int add(int x, int y){return x+y;}
    public int add(int n){
        if(n>0) return n+add(n-1);
        else return 0;
    }
    public static void main(String[] args){
        MyAdder adder = new MyAdder();
        System.out.println(adder.add(5,10));
        System.out.println(adder.add(10));
    }
}
//출력 : 15 55
