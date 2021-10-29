public class ReverseLinkedListManual {
    public static void main(String[] args){
        Mobile mobile1 = new Mobile("Samsung", null);
        Mobile mobile2 = new Mobile("OnePlus", null);
        Mobile mobile3 = new Mobile("RealMe", null);

        mobile1.next = mobile2;
        mobile2.next = mobile3;

        Mobile ReversedHead = null;

        for(Mobile m = getReverseList(mobile1) ; m!=null ; m = m.next){
            System.out.println(m.name);
        }
    }
    static Mobile getReverseList(Mobile mobile){
        if(mobile.next == null) {
            return mobile;
        }
        Mobile m = getReverseList(mobile.next);
        mobile.next.next = mobile;
        mobile.next = null;
        return m;
    }
}

