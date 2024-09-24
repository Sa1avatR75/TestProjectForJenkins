import org.junit.Assert;
import org.junit.Test;

public class ReverseStringTests {
    @Test
    public void reverseTestWithNull(){
        Assert.assertNull(ReverseString.reverseString(null));
    }

    @Test
    public void reverseStringDigit(){
        Assert.assertEquals("cba321", ReverseString.reverseString("123abc"));
    }

    @Test
    public void reverseString1(){
        Assert.assertEquals("elppa", ReverseString.reverseString("apple"));
    }

    @Test
    public void reverseString2(){
        Assert.assertEquals("elppa", ReverseString.reverseString("apple"));
    }


    @Test
    public void reverseString3(){
        Assert.assertEquals("elppa", ReverseString.reverseString("apple"));
    }


}
