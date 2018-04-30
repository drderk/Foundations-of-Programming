
public class Dog {
	String breed = "Beagle";
	String name  = "Max";
	Integer weight = 120;
	Integer age = 5;
	String response = "Stop or I will ";

public Dog(String breed, String name, Integer weight, Integer age) {
	this.breed = breed;
	this.name = name;
	this.weight = weight;
	this.age = age;
}

public void bite() {
	this.response = "Stop or I will bite you.";
	System.out.println(this.response);
}
public void fight() {
	this.response = "Stop or I will fight you.";
	System.out.println(this.response);

}
public void drool() {
	this.response = "Stop or I will drool on you.";
	System.out.println(this.response);
}
public String getName() {
	return this.name;
}
public void setName(String name) {
	this.name = name;
}
public String getBreed() {
	return this.name;
}
public Integer getAge() {
	return this.age;
}
public Integer getWeight() {
	return this.weight;
}
}
