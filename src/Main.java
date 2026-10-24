void main() {
    int balance = 35; //переменная для теста
    try{
        proverka(balance); //тест
    }
    catch (BaseMinimum e){ //наше исключение
        System.out.println("что такое?"+e.getMessage());
    }
}
public void proverka(int balance) throws BaseMinimum { //тестовый метод
    if (balance < 100) {
        throw new BaseMinimum(" Ты нищий: " + balance);
    }
}
