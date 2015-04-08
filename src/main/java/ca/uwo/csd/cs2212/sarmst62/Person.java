package ca.uwo.csd.cs2212.sarmst62;

import java.lang.StringBuilder;
import java.util.List;
import java.util.ArrayList;
import java.io.Serializable;

public class Person implements Serializable{

  private String name;
 private String gender; 
private Address address;
  private List<String> phoneNumbers;
private static final long serialVersionID=2L;

  public Person() {
    this.phoneNumbers = new ArrayList<String>();
  }

  public Person(String name, Address address) {
    this();
    this.setName(name);
    this.setAddress(address);
  }

  public void addPhoneNumber(String number) {
    this.phoneNumbers.add(number);
  }

  @Override
  public String toString() {
    StringBuilder msg = new StringBuilder();

    msg.append("Name      : ");
    msg.append(this.getName());
    msg.append("\n");

    if (this.getAddress() != null)
      msg.append(this.getAddress().toString());
    else
      msg.append("Address: null");

    for (String number : this.phoneNumbers) {
      msg.append("Telephone : ");
      msg.append(number);
      msg.append("\n");
    }

    return msg.toString();
  }

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public Address getAddress() {
	return address;
}

public void setAddress(Address address) {
	this.address = address;
}
}
