package problem2;

public class Warrior implements Character {

    private int health;

    // 전사 체력은 100
    public Warrior() {
        this.health = 100;
    }

    // 전사 검 공격은 15데미지
    @Override
    public void attack(Character target) {
        System.out.println("전사가 검으로 공격함");
        target.takeDamage(15);
    }

    @Override
    public void defend() {
        System.out.println("전사가 방패로 방어");

    }

    @Override
    public int getHealth() {
        return health;
    }

    @Override
    public void takeDamage(int damage) {
        health -= damage;// 방어하지 못했으면, 체력감소
        System.out.println("전사가 " + damage + "피해를 받았습니다, 남은체력: " + getHealth());
    }
}
