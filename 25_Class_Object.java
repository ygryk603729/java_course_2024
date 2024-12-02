class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        // Проверяем, если объекты одинаковые
        if (this == obj) {
            return true;
        }

        // Проверяем, если объект null или не того же типа
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        // Приводим объект к типу Person
        Person person = (Person) obj;

        // Сравниваем значения полей
        return age == person.age && name.equals(person.name);
    }

    public static void main(String[] args) {
        Person p1 = new Person("John", 25);
        Person p2 = new Person("John", 25);
        Person p3 = new Person("Alice", 30);

        System.out.println(p1.equals(p2)); // true
        System.out.println(p1.equals(p3)); // false
    }
}
