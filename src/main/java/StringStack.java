import java.util.Scanner;

interface StackInterface{
    int length();
    String pop();
    boolean push(String ob);
}
class StringStack implements StackInterface{
    String stack[] = new String[5];
    int top=0;
    public int length(){return stack.length;}
    public String pop(){return stack[top++];}

    @Override
    public boolean push(String ob) {
        stack[++top]=ob;
        return true;
    }
}
public class StringStack {
    public static void main(String[] args){
        StringStack ss = new StringStack();
        Scanner s = new Scanner(System.in);
        for(int i = 0;i<5;i++) ss.push(s.next()); //사용자로 부터 문자열 5개를 입력받아 스택을 저장
        for(int i = 0;i<5;i++) System.out.println(ss.pop());//다시 팝해서 읽은 반대의 순서로

    }

}
