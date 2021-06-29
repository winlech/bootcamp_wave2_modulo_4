package Aula_2.TM;

public class TestStringUtil {

    public static void main(String[] args) {
        System.out.println("-------------Rpad");
        String testeRpad = StringUtil.rpad("teste", 'Y', 10);
        System.out.println(testeRpad);

        System.out.println("-------------Ltrim");
        System.out.println(StringUtil.ltrim("       teste"));

        System.out.println("-------------Rtrim");
        System.out.println(StringUtil.rtrim("teste        "));

        System.out.println("-------------Trim");
        System.out.println(StringUtil.trim("       teste        "));

        System.out.println("-------------indexOfN");
        System.out.println(StringUtil.indexOfN("John | Paul | George | Ringo", '|', 2));
        System.out.println(StringUtil.indexOfN("John | Paul | George | Ringo", '|', 1));
        System.out.println(StringUtil.indexOfN("John | Paul | George | Ringo", 'w', 1));



    }

}
