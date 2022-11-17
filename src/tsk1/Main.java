package tsk1;

public class Main {
    public static void main(String[] args) {
        User user=new User(1,"vasya","pupkin","pupkingmail.com",
                new Address("pupkin street","Apt Pupkin","Pupkin city","123456",
                        new Geo("-1","1")),"12213321","pupkin.org",
                new Company("Pupkin company","Ya Vasya Pupkin","Vasya Pupkin"));

        System.out.println(user);
    }

}
