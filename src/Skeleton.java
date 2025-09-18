public class Skeleton extends  Boss {
    private  int arrows;

    public int getArrows(){
        return arrows;
    }
    public void setArrows(int arrows){
        this.arrows = arrows;
    }
 @Override
    public void printInfo(){
     System.out.println("Skeleton Info: ");
     System.out.println("Name: " + getName());
     System.out.println("Health: " + getHealth());
     System.out.println("Damage: " + getDamage());
     System.out.println("Weapon: " + getWeapon());
     System.out.println("Arrows: " + arrows);
        }
    }



