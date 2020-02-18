class Childrens{
	
	String name;
	int age;
	Childrens(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public static void main(String[]ar){
		Childrens child1 = new Childrens(vishwa, 3);
		Childrens child2 = new Childrens(sayam, 15);
		System.out.println(child1.getChildInfo());
		System.out.println(child2.getChildInfo());
	}	

	String getChildInfo(){
		return (name + " age is "+ age);
	}
}