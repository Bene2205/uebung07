package ueb07;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
	@Test
	void testStudent() {
		Student s1 = new Student(123, "Hans");
		Student s2 = new Student(120, "Andi");
		Student s3 = new Student(119, "Andi");
		Student s4 = new Student(122, "Amra");
		Student[] students = {s1, s2, s3, s4};
		Student[] studentsRight = {s4, s3, s2, s1};

		System.out.println("Unsortiert " + Arrays.toString(students));

		Sortieren.bubbleSort(students, new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				if (o1.getName().equals(o2.getName())){
					if (o1.getMatrikel() < o2.getMatrikel()) {
						return -1;
					} else {
						return 1;
					}
				}
				return o1.getName().compareTo(o2.getName());
			}
		});

		System.out.println(Arrays.toString(students));
		System.out.println(Arrays.toString(studentsRight));

		assertEquals(Arrays.toString(students), Arrays.toString(studentsRight));

		assertThrows(IllegalArgumentException.class, () -> s1.setName(null));
		assertThrows(IllegalArgumentException.class, () -> s1.setMatrikel(-3));
	}
}