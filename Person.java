import java.util.Objects;

public class Person {
	
	protected final String name;
	protected final String surname;
	protected Integer age;
	protected String address;
	
	public Person(String name, String surname, Integer age, String address) {
		this.name = name;
		this.surname = surname;
	}
	
	public Person(String name, String surname, Integer age) {
		this.name = name;
		this.surname = surname;
		this.age = age;
	}
	
	
	public boolean hasAge() {
		return age != 0;
	}
	
	public boolean hasAddress() {
		return address != null;
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