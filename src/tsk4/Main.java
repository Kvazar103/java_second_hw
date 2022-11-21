package tsk4;


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        User user=new User(
                1,"Vasya","Pupkin","pupkin@gmail.com",
                21,Gender.MALE,
                Arrays.asList(new Skills("dfsdf",2),new Skills("dsfsdfdfds",5)),
                new Car("BMW",2016,450));

        System.out.println(user);
    }
}
