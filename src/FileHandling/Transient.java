package FileHandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;

// Transient is a keyword in java for skipping in serialization
// to stop sending over network or save into db
// fro security not a encryption

class Book implements Serializable {
	int id;
	transient String Bookname;
	transient double price;
	
	Book (int id,String bkname,double bp){
		 this.id=id;
		 this.Bookname=bkname;
		 this.price=bp;
	}
}

public class Transient {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		// first create object
		Book bk=new Book(11,"Lord",456.00);
		
	// Serialization
		
		// second create one file 
		// Creates a file where the serialized object will be stored.
		// .ser is a common convention for serialized files.
		
		FileOutputStream oof=new FileOutputStream("data.ser");
		
		// create objectoutputstream and pass file where is object stored
		// Converts the object into byte stream.
		// Writes metadata + object data.
		ObjectOutputStream oos =new ObjectOutputStream(oof);
		
		// This is the actual serialization step.
		// JVM converts bk into bytes and saves it to data.ser.
		oos.writeObject(bk);
		
		// Releases system resources.
		// Finalizes the file write.
		oos.close();
		
		System.out.println(bk.Bookname);

	// DeSerialization
		
		// 1. open file by fileinput
		FileInputStream ifs=new FileInputStream("data.ser");
		
		// 2.create stream object for read
		ObjectInputStream ois=new ObjectInputStream(ifs);
		
		// 3. read stream and convert into object
		Book bk1=(Book) ois.readObject();
		System.out.println(bk1.id);
		System.out.println(bk1.Bookname);
		System.out.println(bk1.price);
		System.out.println("Succesfull !");

	}

}
