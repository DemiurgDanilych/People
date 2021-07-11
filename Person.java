import java.util.Objects;

public class Person {
	
	protected final String name;
	protected final String surname;
	protected int age;
	protected String address;
	
	public Person(String name, String surname) {
		this.name = name;
		this.surname = surname;
	}
	
	public Person(String name, String surname, int age) {
		this.name = name;
		this.surname = surname;
		this.age = age;
	}
	
	Person(PersonBuilder personBuilder) {
		this.name = personBuilder.name;
		this.surname = personBuilder.surname;
		this.age = personBuilder.age;
		this.address = personBuilder.address;
	}
	
	public boolean hasAge() {
		if (age == 0) {
			return false;
		}
		return true;
	}
	
	public boolean hasAddress() {
		if (address.equals(null)) {
			return false;
		}
		return true;
	}
	
	public String getName() {
		return name;
	}
	
	public String getSurname() {
		return surname;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public void happyBirthday() {
		this.age++;
	}
	
	public PersonBuilder newChildBuilder() {
		return new PersonBuilder()
				.setSurname(getSurname())
				.setAge(1)
				.setAddress(getAddress());
		
	}
	
	@Override
	public String toString() {
		return " Name = " + name  +
				", Surname = " + surname +
				", Age = " + age +
				", Address = " + address;
	}
	
	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Person person = (Person) o;
		return age == person.age && name.equals(person.name) && surname.equals(person.surname) && Objects.equals(address, person.address);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(name, surname, age, address);
	}
}