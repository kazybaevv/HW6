public class HW6 {
    public static void main(String[] args) {
 Boss boss = new Boss();
 boss.setName("DOOM");
 boss.setHealth(648);
 boss.setDamage(44);

 Weapon bossWeapon = new Weapon();
 bossWeapon.setName("Doom Sword");
 bossWeapon.setType(WeaponType.SWORD);

 boss.setWeapon(bossWeapon);
 boss.printInfo();

        System.out.println("---------");

        Skeleton skeleton1 = new Skeleton();
        skeleton1.setName("Skeleton Archer 1");
        skeleton1.setHealth(100);
        skeleton1.setDamage(20);

        Weapon skeletonWeapon1 = new Weapon();
        skeletonWeapon1.setName("Fire Bow");
        skeletonWeapon1.setType(WeaponType.BOW);

        skeleton1.setWeapon(skeletonWeapon1);
        skeleton1.setArrows(25);

        skeleton1.printInfo();
        System.out.println("----------");

        Skeleton skeleton2 = new Skeleton();
        skeleton2.setName("Skeleton Archer 2");
        skeleton2.setHealth(120);
        skeleton2.setDamage(25);

        Weapon skeletonWeapon2 = new Weapon();
        skeletonWeapon2.setName("Ice Bow");
        skeletonWeapon2.setType(WeaponType.BOW);

        skeleton2.setWeapon(skeletonWeapon2);
        skeleton2.setArrows(40);

      
        skeleton2.printInfo();
    }
}