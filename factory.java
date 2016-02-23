/*************************************
*******Factory Design Pattern  *******
*************************************/

public class JavaFactoryPatternExample {
	public static void main(String[] args) {
	
		Dog dog = DogFactory.getDog("khokon");
		dog.speak();
		
		dog = DogFactory.getDog("sajib");
		dog.speak();
		
		dog = DogFactory.getDog("shahin");
		dog.speak();
		
	} 
}


// factory class
class DogFactory {
	public static Dog getDog(String criteria) {
	
		if (criteria.equals("khokon"))
		return new Khokon();
		else if (criteria.equals("sajib"))
		return new Sajib();
		else if (criteria.equals("shahin"))
		return new Shahin();
	}
}

interface Dog {
	public void speak();
}


class Khokon implements Dog{
	public void speak() {
		System.out.println("Khokon dog speak");
	}
} 
class Sajib implements Dog{
	public void speak() {
		System.out.println("Sajib dog speak");
	}
}
class Shahin implements Dog{
	public void speak() {
		System.out.println("Shahin dog speak");
	}
}

http://filesflash.net/bpgv0ofs
http://filesflash.net/lz42aimu
http://filesflash.net/ghbohwp3
http://filesflash.net/heemn6oa
http://filesflash.net/7wvky60s
http://filesflash.net/yqcjyllr
http://mediafree.co/92fnk1u9b4xt/B33_amaderforum.com.flv.html


REXposed Episode 3: Singer Shakib - Prank 