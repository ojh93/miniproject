package test01;

public class Addr {
	
	

	
				private String name;
				private String phone;
				private String email;
				private String address;
				private String group;
	
	public Addr(String name,String phone,String email,String address,String group) {
		this.name= name;
		this.phone= phone;
		this.email= email;
		this.address= address;
		this.group= group;
	}
		

	public String getName(){
		return name;
		}
	public void setName(String name) {
		this.name = name;
	}

	public String getPhone(){
		return phone;
		}	
	public void setPhone(String phone) {
		this.phone = phone;
	}			

	public String getEmail(){
		return email;
		}
	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress(){
		return address;
		}
	public void setAddress(String address) {
		this.address = address;
	}

	public String getGroup(){
		return group;
		}
	
	public void setGroup(String group) {
		this.group = group;
	}
		public void printinfo() {
				System.out.println("이름:"+name);
				System.out.println("전화번호:"+phone);
				System.out.println("이메일:"+email);
				System.out.println("주소:"+address);
				System.out.println("그룹:"+group);
			}

	}


