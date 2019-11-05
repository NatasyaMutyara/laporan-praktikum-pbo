package Tugas;

public class Tester1841720026NTSY {
    public static void main(String[] args) {
        WalkingZombie1841720026NTSY wz = new WalkingZombie1841720026NTSY(100,1);
        JumpingZombie1841720026NTSY jz = new JumpingZombie1841720026NTSY(100,2);
        Barrier1841720026NTSY b = new Barrier1841720026NTSY(100);
        Plant1841720026NTSY p = new Plant1841720026NTSY();
        
        System.out.println(""+ wz.getZombieInfo());
        System.out.println(""+ jz.getZombieInfo());
        System.out.println(""+ b.getBarrierInfo());
        System.out.println("-------------------------");
        
        for(int i = 0; i < 4; i++){
            p.doDestroy(wz);
            p.doDestroy(jz);
            p.doDestroy(b);
        }
         
        System.out.println(""+ wz.getZombieInfo());
        System.out.println(""+ jz.getZombieInfo());
        System.out.println(""+ b.getBarrierInfo());
    }
}
