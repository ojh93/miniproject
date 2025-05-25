package test01;

import java.util.Scanner;

public class SmartPhoneMain {
    public static void main(String[] args) {
        SmartPhone smartPhone = new SmartPhone(); 
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("#������ 2���� �Է��մϴ�");
        smartPhone.printAll(); 
      


        String name, phone, email, address, group;
      
       
        while (true) {
            System.out.println("�ּ� ���� �޴�");
            System.out.println("1. ����ó �߰�(ȸ��)");
            System.out.println("2. ����ó �߰�(�ŷ�ó)");
            System.out.println("3. ��� ����ó ���");
            System.out.println("4. ����ó �˻�");
            System.out.println("5. ����ó ����");
            System.out.println("6. ����ó ����");
            System.out.println("7. ����");
           

            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("�̸�: ");
                     name = scanner.nextLine();
                    System.out.print("��ȭ��ȣ: ");
                     phone = scanner.nextLine();
                    System.out.print("�̸���: ");
                     email = scanner.nextLine();
                    System.out.print("�ּ�: ");
                     address = scanner.nextLine();
                    System.out.print("�׷�: ");
                     group = scanner.nextLine();
                    System.out.print("ȸ���̸�: ");
                    String companyName = scanner.nextLine();
                    System.out.print("�μ��̸�: ");
                    String departName = scanner.nextLine();
                    System.out.print("����: ");
                    String position = scanner.nextLine();
                    
                    
                    Addr newAddr = new CompanyAddr(name, phone, email, address, group, companyName, departName, position);
                    smartPhone.addAddr(newAddr);
                    System.out.println("ȸ�� ����ó�� �߰��Ǿ����ϴ�.");
                    break;

                  
                    
                case 2:
                    System.out.print("�̸�: ");
                     name = scanner.nextLine();
                    System.out.print("��ȭ��ȣ: ");
                     phone = scanner.nextLine();
                    System.out.print("�̸���: ");
                     email = scanner.nextLine();
                    System.out.print("�ּ�: ");
                     address = scanner.nextLine();
                    System.out.print("�׷�: ");
                     group = scanner.nextLine();
                    System.out.print("�ŷ�ó�̸�: ");
                    String clientName = scanner.nextLine();
                    System.out.print("ǰ���̸�: ");
                    String transacItem = scanner.nextLine();
                    System.out.print("����: ");
                    String clientPosition = scanner.nextLine();
                    
                    
                    Addr newAddr1 = new CustomerAddr(name, phone, email, address, group, clientName, transacItem, clientPosition);
                    smartPhone.addAddr(newAddr1);
                    System.out.println("�ŷ�ó ����ó�� �߰��Ǿ����ϴ�.");
                    break;

                   

                case 3: 
                    System.out.println("<����ó ���>");
                    smartPhone.printAll();
                    break;

                case 4: 
                    System.out.print("�˻��� �̸� �Է�: ");
                    String searchName = scanner.nextLine();
                    smartPhone.searchAddr(searchName);
                    break;

                case 5:
                    System.out.print("������ �̸� �Է�: ");
                    String deleteName = scanner.nextLine();
                    smartPhone.deleteAddr(deleteName);
                    break;

                case 6: 
                    System.out.print("������ �̸� �Է�: ");
                    String updateName = scanner.nextLine();
                    smartPhone.editAddr(updateName);
                    break;

                case 7: 
                    System.out.println("���α׷��� �����մϴ�.");
                    scanner.close();
                    return;

                default:
                    System.out.println(" �ùٸ� ��ȣ�� �Է����ּ���.");
            }
        }
       
    }
    
}

          

           
 
        

  
	
		


				 
	
	


