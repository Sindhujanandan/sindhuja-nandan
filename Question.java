import java.util.Comparator;
import java.util.PriorityQueue;
public class Question {
    static class Student  implements Comparable<Student>{
        String name;
        int rank;
        public Student(String name,int rank)
        {
            this.name=name;
            this.rank=rank;
        }
        @Override
        public int compareTo(Student s2)
        {
            return this.rank-s2.rank;   
             }
        
    }
    public static void main(String[] args) {
        // ascending order
        //PriorityQueue<Integer>p=new PriorityQueue<>();
        // decending order
        //PriorityQueue<Integer>p=new PriorityQueue<>(Comparator.reverseOrder());
        PriorityQueue<Student>p=new PriorityQueue<>();
        //p.add(3);
        p.add(new Student("Sandhya", 1));
        p.add(new Student("Sindhuja", 2));
        p.add(new Student("Ishan", 3));
        p.add(new Student("Mishan", 4));
        //p.add(4);
        //p.add(7);
        //p.add(1);
        while(!p.isEmpty())
        {
            //System.out.println(p.peek());
            System.out.println(p.peek().name+"->"+p.peek().rank);
            p.remove();
        }
    }
}
