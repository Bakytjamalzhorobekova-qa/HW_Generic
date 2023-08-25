public class Main {
    public static void main(String[] args) {
       Box<Integer,String> box1 = new Box<>(150,215,"Broun");
       Box<Integer,String> box2 = new Box<>(180,220,"White");
       Box<Integer,String> box3 = new Box<>(220,295,"Black");
       Box<Integer,String> box4 = new Box<>(240,315,"Orange");
       method(box4);
    }
    public static <M> void method(M arg){
        System.out.println(arg);
    }
}