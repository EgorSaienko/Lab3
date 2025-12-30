/**

 * Mimics functional empty list.
 * @author Danylo Papizhuk
 * @since JDK1.4
 */
public class Empty extends FunList {

    private static Empty empty;

    public Empty(){}

    public static Empty uniqueInstance(){
        if (empty == null){
            empty = new Empty();
        }
        return empty;
    }
    public int car(){
        throw new java.util.NoSuchElementException("car requires a non Empty Funlist");
    }

    public FunList cdr(){
        throw new java.util.NoSuchElementException("cdr requires a non Empty Funlist");
    }

    public FunList append(FunList other) {
        return new Cons(this.car(), other);
    }


    public FunList insertInOrder(int i) {
        return new Cons(i);
    }


    public FunList sort() {
        return this;
    }

    String toStringHelp(){
        return "";
    }
}
