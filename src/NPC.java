public class NPC {
    private String name;
    private int lvl;

    public NPC() {
    }

    public NPC(String name) {
        this.name = name;
    }
    public NPC(String name, int lvl) {
        this.name = name;
        this.lvl = lvl;
    }
    public NPC(int lvl, String name) {
        this.name = name;
        this.lvl = lvl;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLvl(int lvl) {
        this.lvl = lvl;
    }

    public int getLvl() {
        return this.lvl;
    }

    public static void classIntro(){
        System.out.println("si klase yra skirta {...}");
    }

    @Override
    public String toString() {
        return "Sveiki, mano vardas " + name + ", mano lygis " + lvl + ".";
    }
}
