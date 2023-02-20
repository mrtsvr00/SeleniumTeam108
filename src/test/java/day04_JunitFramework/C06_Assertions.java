package day04_JunitFramework;

import org.junit.Assert;
import org.junit.Test;

public class C06_Assertions {

    /*
    JUnit testlerin passed veya failed olduguna
    kodlari calistirirken sorun olusup olusmamasina gore karar verir
     */

    String str1 = "Ali";
    String str2 = "ali";

    @Test
    public void Test01(){
        // str1'in str2'e esit oldugunu test edin

        Assert.assertEquals("karsilastirilan degerler farkli",str1,str2);


            //        if (str1.equals(str2)){
            //            System.out.println("Esitlik Testi PASSED");
            //        }else{
            //            System.out.println("Esitlik Testi FAILED");
            //        }
    }
    @Test
    public void test02(){
        // str1'in A harfini icerdigini test edin

        Assert.assertTrue("str1 istenen harfi icermiyor",str1.contains("A"));
            //        if (str1.contains("A")){
            //            System.out.println("olumlu test passed");
            //        }else{
            //            System.out.println("olumlu test failed");
            //        }
    }
    @Test
    public void Test03(){

        Assert.assertFalse("str2 istenmeyen harfi iceriyor",str2.contains("c"));
            //        if (!str2.contains("c")){
            //            System.out.println("negatif test passed");
            //        }else{
            //            System.out.println("negatif test failed");
            //        }

    }

}
