import com.mv2016.logo.*;

public class TestLogo
{
   
    public static void main(String args[])
    {
        Logo l = new ReneLaTaupe();
        l = new Chapeau(l);
        l = new Lunette(l);
        l = new Smiley(l);
        l = new CanneSucre(l);
        l = new Message(l, "Je suis un logo de René la taupe", 220, 350);
        l.getLogo().display();

        // Affiche dans la console le prix du logo avec tous les accesoires
        System.out.println("Le prix de ce logo vaut : " + l.combienCaCoute() + "€");

    }
        
}
