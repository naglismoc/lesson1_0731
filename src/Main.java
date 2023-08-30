import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        NPC npc = new NPC();
        npc.setName("Petras");
        npc.setLvl(150);

        NPC npc2 = new NPC();
        npc2.setName("Jonas");
        npc2.setLvl(12);

        NPC npc3 = new NPC("Joris",40);

//        ArrayList<String> tekstai = new ArrayList();
//        tekstai.add("labas");
//        System.out.println(tekstai.size());
//        tekstai.add("lauke");
//        tekstai.add("lija");
//        System.out.println(tekstai.size());
//        tekstai.remove(1);
//        tekstai.set(0,"ar");
//        tekstai.get(0);

        ArrayList<NPC> npcList = new ArrayList();
        npcList.add(npc);
        npcList.add(npc2);
        npcList.add(npc3);

        System.out.println(npcList);
        for (int i = 0; i < npcList.size(); i++) {
            System.out.println(npcList.get(i).getName() + " " + npcList.get(i).getLvl());
        }

        for (int i = 0; i < npcList.size(); i++) {
            System.out.println(npcList.get(i));
        }

        System.out.println(npc);

        Math.round(5);

    }

    public static void sayHi(){
        System.out.println("hi");
    }

}
