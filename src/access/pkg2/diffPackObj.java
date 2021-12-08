package access.pkg2;

import access.pkg1.Parent;

public class diffPackObj {
    public static void main(String[] args) {
        Parent obj=new Parent();
//        System.out.println("Different class different pack via obj -->>  "+obj.sprivate); //not accessable
        System.out.println("Different class different pack via obj -->>  "+obj.spublic);
//        System.out.println("Different class different pack via obj -->>  "+obj.sprotected); //no access
//        System.out.println("Different class different pack via obj -->>  "+obj.sdef);     //no access
    }
}
