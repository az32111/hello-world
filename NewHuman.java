package com.company;

public class NewHuman {
    private  String name;
    private int age;
    private int height;
    private int weight;
    //private으로 클래스 내에서만 사용 가능한 객체를 생성 => 다른 클래스에서 이 객체를 사용하려면 이 클래스의 허용이 있어야 함

    /*생성자*/
    NewHuman(String n, int a, int h, int w){
        name = n;
        age = a;
        height = h;
        weight = w;
    }

    String getName() {return  name;}`
    int getAg() {return  age;}
    int getHeight() {return  height;}
    int getWeight() {return  weight;}

   void addHeight(int h){height +=h;} // addHeight(키가 커짐) 라는 메서드를 생성.
     void reduceweight(int w){weight -=w;} // 살이 빠짐
    void addAge(int a){age +=a;} //나이증가
}

class Hucls{
    public static void main(String[] args) {
        NewHuman human = new NewHuman("장지훈",19,180,70);
        human.addHeight(5);
        human.reduceweight(3);
        human.addAge(1);
        System.out.println("이름 :"+human.getName());
        System.out.println("나이 :"+human.getAg());
        System.out.println("키 :"+human.getHeight());
        System.out.println("몸무게 :"+human.getWeight());
    }
}
//초기화와 관련된 위험성 :
//인스턴스의 각 필드에 설정하는 것을 까먹은 경우 에러가 발생할 위험이 있으므로
//초기화 해야 할 필드는 초기화를 강제로 해야한다.
//데이터 보호와 관련된 위험성 :
//기본적으로 public 혹은 private 혹은 protected 등을 설정하지 않은 객체는
//기본 타입이 publiv으로 설정되기 때문에 다른 클래스에서 해당 값을 변경할 수 있다.
//따라서 클래스 내부에서만 사용할 객체는 private등을 설정해 주면 좀 더 안전한 코드가 된다.

//카멜기법 => MainActivity
//스네이크 기법 => main_activity
//..