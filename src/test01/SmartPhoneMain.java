package test01;

import java.util.Scanner;

public class SmartPhoneMain {
    public static void main(String[] args) {
        SmartPhone smartPhone = new SmartPhone(); 
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("#데이터 2개를 입력합니다");
        smartPhone.printAll(); 
      


        String name, phone, email, address, group;
      
       
        while (true) {
            System.out.println("주소 관리 메뉴");
            System.out.println("1. 연락처 추가(회사)");
            System.out.println("2. 연락처 추가(거래처)");
            System.out.println("3. 모든 연락처 출력");
            System.out.println("4. 연락처 검색");
            System.out.println("5. 연락처 삭제");
            System.out.println("6. 연락처 수정");
            System.out.println("7. 종료");
           

            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("이름: ");
                     name = scanner.nextLine();
                    System.out.print("전화번호: ");
                     phone = scanner.nextLine();
                    System.out.print("이메일: ");
                     email = scanner.nextLine();
                    System.out.print("주소: ");
                     address = scanner.nextLine();
                    System.out.print("그룹: ");
                     group = scanner.nextLine();
                    System.out.print("회사이름: ");
                    String companyName = scanner.nextLine();
                    System.out.print("부서이름: ");
                    String departName = scanner.nextLine();
                    System.out.print("직급: ");
                    String position = scanner.nextLine();
                    
                    
                    Addr newAddr = new CompanyAddr(name, phone, email, address, group, companyName, departName, position);
                    smartPhone.addAddr(newAddr);
                    System.out.println("회사 연락처가 추가되었습니다.");
                    break;

                  
                    
                case 2:
                    System.out.print("이름: ");
                     name = scanner.nextLine();
                    System.out.print("전화번호: ");
                     phone = scanner.nextLine();
                    System.out.print("이메일: ");
                     email = scanner.nextLine();
                    System.out.print("주소: ");
                     address = scanner.nextLine();
                    System.out.print("그룹: ");
                     group = scanner.nextLine();
                    System.out.print("거래처이름: ");
                    String clientName = scanner.nextLine();
                    System.out.print("품목이름: ");
                    String transacItem = scanner.nextLine();
                    System.out.print("직급: ");
                    String clientPosition = scanner.nextLine();
                    
                    
                    Addr newAddr1 = new CustomerAddr(name, phone, email, address, group, clientName, transacItem, clientPosition);
                    smartPhone.addAddr(newAddr1);
                    System.out.println("거래처 연락처가 추가되었습니다.");
                    break;

                   

                case 3: 
                    System.out.println("<연락처 목록>");
                    smartPhone.printAll();
                    break;

                case 4: 
                    System.out.print("검색할 이름 입력: ");
                    String searchName = scanner.nextLine();
                    smartPhone.searchAddr(searchName);
                    break;

                case 5:
                    System.out.print("삭제할 이름 입력: ");
                    String deleteName = scanner.nextLine();
                    smartPhone.deleteAddr(deleteName);
                    break;

                case 6: 
                    System.out.print("수정할 이름 입력: ");
                    String updateName = scanner.nextLine();
                    smartPhone.editAddr(updateName);
                    break;

                case 7: 
                    System.out.println("프로그램을 종료합니다.");
                    scanner.close();
                    return;

                default:
                    System.out.println(" 올바른 번호를 입력해주세요.");
            }
        }
       
    }
    
}

          

           
 
        

  
	
		


				 
	
	


