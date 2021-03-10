public class Utility {

    //This method has a hard coded return value so it is not dynamic
    public static  Boolean returnBool() {
        return true;
    }

    //this method has the ability to return different values so it is dynamic
    public static Boolean isLarger(int x, int y){
        return x > y;
    }

    public static int addInts(int x, int y){
        return x + y;
    }

    public static void main(String[] args){
        System.out.println(isLarger(8,3));
    }
}
