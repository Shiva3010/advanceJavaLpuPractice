import java.util.*;
import java.util.stream.*;
import java.util.List;
import java.util.Arrays;
import java.util.stream.IntStream;

class student {
    String name;
    int score;
    student(String name, int score) {
        this.name = name;
        this.score = score;
    }
    public String getName() {
        return name;
    }
    public int getScore() {
        return this.score;
    }
}

class streamclass{
    public static void main (String[] args) {
        System.out.println("Sequeencial stream");
        IntStream s = IntStream.rangeClosed(1, 10);
        s.forEach(System.out::println);

        System.out.println("Parallel stream");
        IntStream s1 = IntStream.rangeClosed(1, 10);
        s1.parallel().forEach(System.out::println);

        List<student> l = Arrays.asList(
            new student("Shivkumar", 30),
            new student("rohan", 27),
            new student("mahesh", 25),
            new student("manish", 36),
            new student("nikhil", 50),
            new student("neha", 44),
            new student("shivansh", 36),
            new student("ramesh", 47)
        );
        System.out.println("Sequential colletion stream");
        Stream<student> str = l.stream().filter(e -> e.getScore()> 50);
        str.forEach(y -> System.out.println(y.getName()+"\t"+ y.getScore()));

        System.out.println("Parallel colletion stream");
        Stream<student> str1 = l.stream().filter(e -> e.getScore()> 50);
        str1.forEach(t -> System.out.println(t.getName()+"\t"+ t.getScore()));

        System.out.println("conversation for seq. to parallel colletion stream");
        Stream<student> str2 = l.stream().filter(e -> e.getScore()> 50).limit(3);
        str2.forEach(u -> System.out.println(u.getName()+"\t"+ u.getScore()));
    }
}
