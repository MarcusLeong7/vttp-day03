package game;

// Java doesnt support multiple inheritance
public class Godzilla extends Monster{

    public Godzilla() {
        setName("Godzilla");
        setHitPoints(1000);
    }
    
    @Override
    public void damage(int damage){
        int hitPoints= getHitPoints();
        setHitPoints(hitPoints - damage + 1);
    }
}
