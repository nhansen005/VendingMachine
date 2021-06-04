import com.techelevator.Candy;
import org.junit.Assert;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.math.BigDecimal;

public class TestForCandy {

    Candy candyTestMessage = new Candy("Snickers", 1.50 , 5, "F6","Candy" );

    @Test
    public void get_Correct_Message(){
        Assert.assertEquals("Munch Munch, Yum!", candyTestMessage.getMessage());
    }

    Candy candyTestQuantity5 = new Candy("Snickers", 1.50 , 5, "F6","Candy");
    Candy candyTestQuantity4 = new Candy("Snickers", 1.50 , 4, "F6","Candy");
    Candy candyTestQuantity3 = new Candy("Snickers", 1.50 , 3, "F6","Candy");
    Candy candyTestQuantity2 = new Candy("Snickers", 1.50 , 2, "F6","Candy");
    Candy candyTestQuantity1 = new Candy("Snickers", 1.50 , 1, "F6","Candy");
    Candy candyTestQuantity0 = new Candy("Snickers", 1.50 , 0, "F6","Candy");

    @Test
    public void set_Candy_Test_Result_5(){
        Assert.assertEquals(4, candyTestQuantity5.decrement());
    }

    @Test
    public void set_Candy_Test_Result_4(){
        Assert.assertEquals(3, candyTestQuantity4.decrement());
    }

    @Test
    public void set_Candy_Test_Result_3(){
        Assert.assertEquals(2, candyTestQuantity3.decrement());
    }

    @Test
    public void set_Candy_Test_Result_2(){
        Assert.assertEquals(1, candyTestQuantity2.decrement());
    }

    @Test
    public void set_Candy_Test_Result_1(){
        Assert.assertEquals(0, candyTestQuantity1.decrement());
    }

    @Test
    public void set_Candy_Test_Result_0(){
        Assert.assertEquals(0, candyTestQuantity0.decrement());
    }


}


