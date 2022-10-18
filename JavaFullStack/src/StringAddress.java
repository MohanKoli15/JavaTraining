
public class StringAddress {

	public static void main(String[] args) {
		
		String name=new String("Yash");
		
		String newName="Yash";
		
        System.out.println("Content Camparision"+name==newName);
        
        System.out.println("Using Equals :"+name.equals(newName));
        
        System.out.println("Using CampareTo :"+name.compareTo(newName));
        
        System.out.println("Object1"+name.hashCode());
        
        System.out.println("Object2"+newName.hashCode());
        
        String str="";
        System.out.println(str.hashCode());
        
        System.out.println(str.length());
        
        System.out.println(name.length());
        System.out.println(name.charAt(3));
        
        System.out.println(""+name.concat("Technology"));
        
        StringBuilder s = new StringBuilder("Yash Technology");
        System.out.println(s.append(" MagarPatta"));
        
	}
	

}
