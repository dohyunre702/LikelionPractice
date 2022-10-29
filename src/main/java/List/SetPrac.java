package List;

import interfaceDi.RandomCalculator;

//random number 50개를 생성하고 중복되지 않는 숫자만 남기기

public class SetPrac {
    public static void main(String[] args) {
        //RandomCalculator에서 인스턴스 생성
        RandomCalculator randomCalculator = new RandomCalculator();
        for(int i = 0; i < 50; i++) {
            int r = randomCalculator.generate(10);
            System.out.println(r);
        }
    }
}
