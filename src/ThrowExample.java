//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ThrowExample {
    public void divide(int a, int b){
        if(b == 0){
            throw new ArithmeticException("Деление на ноль невозможно.");
        }
        System.out.println("Результат: " + (a / b));
    }
    public static void main(String[] args){
        ThrowExample example = new ThrowExample();
        example.divide(10, 2);
        example.divide(10, 0);
    }
}