package access.pkg2;

import access.pkg1.Parent;

public class diffPackExtend extends Parent {
    public static void main(String[] args) {
        diffPackExtend obj=new diffPackExtend();
//        System.out.println("Different class different pack via extends -->>  "+obj.sprivate); //not accessable
        System.out.println("Different class different pack via extends -->>  "+obj.spublic);
        System.out.println("Different class different pack via extends -->>  "+obj.sprotected);
//        System.out.println("Different class different pack via extends -->>  "+obj.sdef);     //no access
    }
}
