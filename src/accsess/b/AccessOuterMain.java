package accsess.b;

import accsess.a.AccessData;

public class AccessOuterMain {
    public static void main(String[] args) {
        AccessData accessData = new AccessData();

        accessData.publicField = 1;
        accessData.publicMethod();      //public 호출가능!
    /*
        accessData.defaultField = 2;
        accessData.defaultMethod();    //default 호출불가능!

        accessData.privateField = 3;   //private 호출불가능!
        accessData.privateMethod();
    */
        accessData.innerAccess();
    }
}
