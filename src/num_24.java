import java.util.Scanner;

import static java.lang.System.*;

class phone {
    private String name, tel;
    public phone(String name, String tel){
        this.name = name;
        this.tel=tel;
    }
    public String getName() {return name;}
    public String getTel() {return tel;}
}
public class num_24 {
    Scanner scn = new Scanner(in);
    static phone[] phonebook = new phone[2];

    void set(){
        for(int i = 0; i<phonebook.length; i++) {
            out.print("이름과 전화번호 입력 >>");
            String name = scn.next();
            String tel = scn.next();
            phonebook[i] = new phone(name,tel);
        }
    }
    void show(){
        for(int i = 0; i<phonebook.length; i++) {
            out.println(phonebook[i].getName() + phonebook[i].getTel());
        }
    }

    public static void main(String args[]){
        num_24 a = new num_24();
        a.set();
        a.show();
        }
}
