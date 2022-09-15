public class ReplaceMethod {
    public static void main(String[] args) {
        String x=new String("Mississippi");
        x=x.replace("i","ii");//Miissiissiippii
        System.out.println(x.length());
        x=x.replace("ss","s");//Miisiisiippii
        System.out.println(x.length());
    }
}
