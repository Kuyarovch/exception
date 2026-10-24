void main() {
    int balance = 35;
    try{
        proverka(balance);
    }
    catch (BaseMinimum e){
        System.out.println("что такое?"+e.getMessage());
    }
}
public void proverka(int balance) throws BaseMinimum {
    if (balance < 100) {
        throw new BaseMinimum(" Ты нищий: " + balance);
    }
}