import com.mv2016.cafe.*;

/**
 * Created by Matthieu on 10/09/2016.
 */
public class TestCafe {
    public static void main(String[] args){
        Boisson deca = new Deca();
        deca = new BoissonCreme(new BoissonChantilly(new BoissonChantilly(deca)));
        System.out.println(deca);
    }
}
