public class Medic extends Hero{
    private int healPoints= 20;
    @Override
    public void applySuperAbility() {
        System.out.println("Medic применил суперспособность REPLENISH HEALTH");
    }
    public void increaseExperience(){
        System.out.println(((healPoints*10)/100)+healPoints);
    }

}
