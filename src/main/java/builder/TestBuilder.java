package builder;

public class TestBuilder {
    public static void main(String[] args) {
        Enemy enemy = Enemy.builder()
                .name("Raulongo")
                .type("mage")
                .healt(100)
                .damage(10)
                .endurance(50)
                .build();

        System.out.println(enemy.toString());
    }
}
