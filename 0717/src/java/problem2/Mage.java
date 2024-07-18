package problem2;

public class Mage implements Character {

    private int health;

    // 마법사 체력은 80
    public Mage() {
        this.health = 80;
    }

    // 마법사 파이어볼 공격은 20 데미지
    @Override
    public void attack(Character target) {
        // TODO 구현
    	System.out.println("마법사가 파이어볼을 던짐");
    	target.takeDamage(20);
    }

    @Override
    public void defend() {
        // TODO 구현
    	System.out.println("마법사가 보호 버프 사용");
    }

    @Override
    public int getHealth() {
        return health;
    }

    @Override
    public void takeDamage(int damage) {
        // TODO 구현
    	health-=damage;//방어하지 못했으면, 체력감소
    	System.out.println("마법사가 "+damage+"피해를 받았습니다, 남은체력: "+getHealth());
    }
}

