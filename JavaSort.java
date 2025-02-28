import java.util.*;

class JavaSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        List<Person> people = new ArrayList<>();

        while (n-- > 0) {
            Person person = new Person();
            person.setId(sc.nextInt());
            person.setName(sc.next());
            person.setCgpa(sc.nextDouble());
            people.add(person);
        }
        sc.close();

        people.sort(new PersonComparator());

        for (Person person : people) {
            System.out.println(person.getName());
        }
    }
}

class Person {
    private String name;
    private Integer id;
    private Double cgpa;

    public void setName(String name) {
        this.name = name;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setCgpa(Double cgpa) {
        this.cgpa = cgpa;
    }

    public String getName() {
        return name;
    }

    public Integer getId() {
        return id;
    }

    public Double getCgpa() {
        return cgpa;
    }
}

class PersonComparator implements Comparator<Person> {

    @Override
    public int compare(Person person1, Person person2) {
        int comp1 = person2.getCgpa().compareTo(person1.getCgpa());
        if (comp1 != 0) {
            return comp1;
        }

        int comp2 = person1.getName().compareTo(person2.getName());
        if (comp2 != 0) {
            return comp2;
        }

        return person1.getId().compareTo(person2.getId());
    }
}
