package tsk5;


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Post> posts=new ArrayList<>();
       posts.add(new Post(1,1,"title","body"));
        posts.add(new Post(1,2,"title","body"));
        posts.add(new Post(1,3,"title","body"));

        ArrayList<Comment> comments=new ArrayList<>();
        comments.add(new Comment(1,1,"name","email","body"));
        comments.add(new Comment(1,2,"name","email","body"));
        comments.add(new Comment(1,3,"name","email","body"));
        comments.add(new Comment(2,7,"name","email","body"));
        comments.add(new Comment(2,8,"name","email","body"));
        comments.add(new Comment(3,13,"name","email","body"));
        comments.add(new Comment(3,14,"name","email","body"));
        comments.add(new Comment(3,15,"name","email","body"));

        for (Post post:posts){
            for (Comment comment:comments){
                if(post.getId()==comment.getPostId()){
                    System.out.print(post);
                    System.out.println(comment);
                }
            }
        }
    }
}
