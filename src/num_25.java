import java.util.Scanner;
import static java.lang.System.*;

//class phone {
//    private String name, tel;
//    public phone(String name, String tel){
//        this.name = name;
//        this.tel=tel;
//    }
//    public String getName() {return name;}
//    public String getTel() {return tel;}
//}
public class num_25 {
    Scanner scn = new Scanner(in);
    static phone[] phonebook;

    void create(){
        out.print("인원수>>");
        int index = scn.nextInt();
        phonebook = new phone[index];
    }
    void set(){
        for(int i = 0; i<phonebook.length; i++) {
            out.print("이름과 전화번호 입력 >>");
            String name = scn.next();
            String tel = scn.next();
            phonebook[i] = new phone(name,tel);
        }
        out.println("저장되었습니다...");
    }
    void search(){
        while (true) {
            int n = 0;
            out.print("검색할 이름>>");
            String search_name = scn.next();
            for(int i = 0; i< phonebook.length; i++) {
                if (search_name.equals(phonebook[i].getName())) {
                    n++;
                    out.println(search_name + "의 번호는 " + phonebook[i].getTel() + " 입니다.");
                } else if (search_name.equals("exit")) {
                    return;
                }
            }
            if ( n == 0) out.println(search_name + " 이 없습니다.");
        }
    }

    public static void main(String args[]){
        num_25 a = new num_25();
        a.create();
        a.set();
        a.search();
    }
}
