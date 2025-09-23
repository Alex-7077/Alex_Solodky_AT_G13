package homework.day5.cycletask;

public class ForClass {
    public void forMethod() {
        for (int i = 0; i < 20; i++) {
            if(i % 2 == 0){
                continue;
            }else{
                System.out.println(i);
            }
        }
    }
}