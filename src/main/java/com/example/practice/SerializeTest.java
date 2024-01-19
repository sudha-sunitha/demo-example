package com.example.practice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializeTest {
	public static void main(String[] args) throws IOException, ClassNotFoundException
    { 
		 Person person = new Person();
		    person.setAge(20);
		    person.setName("Joe");
		    person.setHeight(5);
		    
		    FileOutputStream fileOutputStream
		      = new FileOutputStream("yourfile.txt");
		    ObjectOutputStream objectOutputStream 
		      = new ObjectOutputStream(fileOutputStream);
		    objectOutputStream.writeObject(person);
		    objectOutputStream.flush();
		    objectOutputStream.close();
		    
		    FileInputStream fileInputStream
		      = new FileInputStream("yourfile.txt");
		    ObjectInputStream objectInputStream
		      = new ObjectInputStream(fileInputStream);
		    Person p2 = (Person) objectInputStream.readObject();
		    System.out.println(p2.getName()+"   "+p2.getCountry()+"   "+p2.getAge()+"   "+p2.getHeight());
		    objectInputStream.close(); 
    }

}
