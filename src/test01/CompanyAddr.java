package test01;

public class CompanyAddr extends Addr {
	private String companyName;
	private String departName;
	private String position;
	
	public CompanyAddr(String name, String phone, String email, String address, String group, String companyName, String departName, String position) {
		super(name, phone, email, address, group);
		this.companyName = companyName;
		this.departName = departName;
		this.position = position;
	}
	public String getCompanyName(){
		return companyName;
		}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	
	public String getDepartName(){
		return departName;
		}
	public void setDepartName(String departName) {
		this.departName = departName;
	}
	
	public String getPosition(){
		return  position;
		}
	public void setPosition(String  position) {
		this.position =  position;
	}
	
	@Override
	public void printinfo() {
	    super.printinfo(); 
	    System.out.println("회사이름: " + companyName);
	    System.out.println("부서이름: " + departName);
	    System.out.println("직급: " + position);
	}
	
}













	




