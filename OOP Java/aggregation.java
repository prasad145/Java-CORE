class publisher{
	String name;
	int publisherID;
	String city;
	
	publisher(String n, int m, String k)
	{
		this.name = n;
		this.publisherID = m;
		this.city = k;
	}
}

class author{
	String authName;
	int authID;
	String city;
	
	author(String n, int m, String k)
	{
		this.authName = n;
		this.authID = m;
		this.city = k;
	}
}

public class aggregation {
	String name;
	int price;
	author auth;
	publisher pub;
	
	aggregation(String n, int p,author auth, publisher pub)
	{
		this.name = n;
		this.price = p;
		this.auth = auth;
		this.pub = pub;
	}
	
	public static void main(String[] args)
	{
		author auth = new author("Prasad", 1, "Bangalore");
		publisher pub = new publisher("Coders", 2, "Kundapura");
		// book has author and publisher
		//using aggregation feature of java
		//if we don't want to modify any feature of class we are referring then it is better to use aggregation over inheritance
		aggregation book = new aggregation("CP haters", 420, auth, pub);
		System.out.println("Book Name: "+ book.name);
		System.out.println("Book Price: "+ book.price);
		System.out.println("--------------------------");
		System.out.println("Publisher Details: ");
		System.out.println("Publisher name: "+ book.pub.name);
		System.out.println("Publisher id: "+ book.pub.publisherID);
		System.out.println("city: "+ book.pub.city);
		System.out.println("--------------------------");
		System.out.println("Author Details: ");
		System.out.println("Author name: "+ book.auth.authName);
		System.out.println("Author id: "+ book.auth.authID);
		System.out.println("city: "+ book.auth.city);
	}
}
