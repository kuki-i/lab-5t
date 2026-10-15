//тестування для 1 завдання
public class Main1 {
    public static void main(String[] args) {
        TimeSpan first = new TimeSpan();
        System.out.println("Перший проміжок (має бути 0 год 0 хв): " + first.getHours() + " год " + first.getMinutes() + " хв");

        TimeSpan second = new TimeSpan(150);
        System.out.println("Другий проміжок (має бути 2 год 30 хв): " + second.getHours() + " год " + second.getMinutes() + " хв");

        TimeSpan third = new TimeSpan(2, 30);
        third.add(1, 45); // 2:30 + 1:45 = 4:15
        System.out.println("Після add(1, 45) (третій промжок має бути 4 год 15 хв): " + third.getHours() + " год " + third.getMinutes() + " хв");

        third.subtract(1, 30); // 4:15 - 1:30 = 2:45
        System.out.println("Після subtract(1, 30) (має бути 2 год 45 хв): " + third.getHours() + " год " + third.getMinutes() + " хв");

        System.out.println("Сумарні години (має бути 2.75): " + third.getTotalHours());
        System.out.println("Сумарні хвилини (має бути 165): " + third.getTotalMinutes());

        third.scale(2); // 2:45 * 2 = 5:30
        System.out.println("Після scale(2) (має бути 5 год 30 хв): " + third.getHours() + " год " + third.getMinutes() + " хв");
    }
}