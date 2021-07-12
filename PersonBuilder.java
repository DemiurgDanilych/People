public class PersonBuilder {
	
	protected String name;
	protected String surname;
	protected Integer age;
	protected String address;
	
	public PersonBuilder setName(String name) {
		this.name = name;
		return this;
	}
	
	public PersonBuilder setSurname(String surname) {
		this.surname = surname;
		return this;
	}
	
	public PersonBuilder setAge(Integer age) {
		this.age = age;
		return this;
	}
	
	public PersonBuilder setAddress(String address) {
		this.address = address;
		return this;
	}
	
	public Person build() throws IllegalStateException {
		
		if (name == null | surname == null) {
			throw new IllegalStateException("Не введено имя или фамилия!");
		}
		if (age < 0) {
			throw new IllegalArgumentException("Ввведен некорректный возраст!");
		}
		
		return new Person(name,surname,age,address);
	}
}