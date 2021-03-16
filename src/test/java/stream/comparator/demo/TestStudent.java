package stream.comparator.demo;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Stream;

import compare.demo.Student;

public class TestStudent {

	public static void main(String[] args) {
		
		Student a= new Student("Adam",80,170);
		Student b= new Student("Bob",90,160);
		Student c= new Student("Carl",75,138);

		
		Optional<Student> minScore=	Stream.of(a,b,c)
								.min(Comparator.comparing(s->s.getScore()));
		
		Optional<Student> maxScore=	Stream.of(a,b,c)
				.max(Comparator.comparing(s->s.getScore()));
		
		Optional<Student> maxHeight=	Stream.of(a,b,c)
				.max(Comparator.comparing(s->s.getHeight()));
		
		System.out.println("min score student ::" + minScore.get());
		System.out.println("max score student ::" + maxScore.get());
		System.out.println("max height student ::" + maxHeight.get());
	}

}
