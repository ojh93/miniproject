package test01;

import java.util.Scanner;



public class SmartPhone {
	private Addr[] addr1;
	private int count;
	
public SmartPhone() {
	addr1 = new Addr[10];
	count =2;
	addr1[0] = new CompanyAddr("김성호", "010-5466-5720", "shkim@naver.com", "삼송", "회사", "네이버", "개발팀", "팀장"+"\n>>>데이터가 저장되었습니다(1)");
	addr1[1] = new CustomerAddr("김정호", "010-5466-5720", "shkimzebra@naver.com", "서울", "거래처", "네이버부동산", "부동산", "대리"+"\n>>>데이터가 저장되었습니다(2)");

}



public void inputAddrData(Scanner scanner) {
	
			
		
	System.out.print("이름:");
	String name =scanner.nextLine();

	System.out.print("전화번호:");
	String phone =scanner.nextLine();

	System.out.print("이메일:");
	String email =scanner.nextLine();

	System.out.print("주소:");
	String address =scanner.nextLine();

	System.out.print("그룹:");
	String group =scanner.nextLine();

		
	

	Addr newAddr = new Addr(name, phone, email, address, group);
	addAddr(newAddr);

	}
public void addAddr(Addr Addr) {
    if (count < addr1.length) {
        addr1[count] = Addr;
        count++;
    } else {
    	System.out.println("주소록이 가득 찼습니다. 더 이상 추가할 수 없습니다.");
    }
}

public void printAddr(Addr Addr) {
   
        for (int i = 0; i < count; i++) {
           System.out.println(addr1[i]);
        }
    }

public void printAll() {
	
    for (int i = 0; i < count; i++) {
     
        addr1[i].printinfo();  
 
    }
}
	
public void searchAddr(String searchName) {
    boolean found = false;
    
    for (int i = 0; i < count; i++) {
        if (addr1[i].getName().equalsIgnoreCase(searchName)) { 
            addr1[i].printinfo(); 
            found = true;
            break; 
        }
    }

    if (!found) {
    	System.out.println("검색된 주소가 없습니다.");
    }
}
public void deleteAddr(String name) {
    boolean found = false;
    
    for (int i = 0; i < count; i++) {
        if (addr1[i].getName().equalsIgnoreCase(name)) { 
            
            for (int j = i; j < count - 1; j++) {
                addr1[j] = addr1[j + 1];
            }
            addr1[count - 1] = null; 
            count--; 
            found = true;
            System.out.println(name + "이 삭제 되었습니다");
            break; 
        }
    }

    if (!found) {
        System.out.println("삭제할 이름이 없습니다.");
    }
}

public void editAddr(String name) {
    boolean found = false;
    Scanner scanner = new Scanner(System.in);

    for (int i = 0; i < count; i++) {
        if (addr1[i].getName().equalsIgnoreCase(name)) { 
            System.out.println(name + "저장된 연락처 입니다");
            addr1[i].printinfo(); 
            
            System.out.println("수정할 내용 입니다");

            System.out.print("새 연락처: ");
            String newPhone = scanner.nextLine();
            System.out.print("새 이메일: ");
            String newEmail = scanner.nextLine();
            System.out.print("새 주소: ");
            String newAddress = scanner.nextLine();
            System.out.print("새 그룹: ");
            String newGroup = scanner.nextLine();
          
            
            addr1[i].setPhone(newPhone);
            addr1[i].setEmail(newEmail);
            addr1[i].setAddress(newAddress);
            addr1[i].setGroup(newGroup);
          
           
            if (addr1[i] instanceof CompanyAddr) {
                CompanyAddr companyAddr = (CompanyAddr) addr1[i];

                System.out.print("새 회사이름: ");
                String newCompanyName = scanner.nextLine();
                System.out.print("새 부서 이름: ");
                String newDepartName = scanner.nextLine();
                System.out.print("새 직급: ");
                String newPosition = scanner.nextLine();

                companyAddr.setCompanyName(newCompanyName);
                companyAddr.setDepartName(newDepartName);
                companyAddr.setPosition(newPosition);
            }

          
            else if (addr1[i] instanceof CustomerAddr) {
                CustomerAddr customerAddr = (CustomerAddr) addr1[i];

                System.out.print("새 거래처 이름: ");
                String newClientName = scanner.nextLine();
                System.out.print("새 품목 이름: ");
                String newTransacItem = scanner.nextLine();
                System.out.print("새 직급: ");
                String newClientPosition = scanner.nextLine();

                customerAddr.setClientName(newClientName);
                customerAddr.setTransacItem(newTransacItem);
                customerAddr.setClientPosition(newClientPosition);
            }


            System.out.println("수정이 완료되었습니다.");
            found = true;
            break; 
        }
    }

    if (!found) {
        System.out.println("수정할 이름이 없습니.");
    }

   scanner.close();
}	
	

	
}

 	


	



