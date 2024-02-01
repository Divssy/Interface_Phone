import java.util.Scanner;
public class Main {
    
    public static void main(String[] args){
        
        //membuat objek HP
        Phone redmiNote8 = new Xiaomi();
        
        //membuat objek user
        PhoneUser dipsy = new PhoneUser(redmiNote8);
        
        //kita coba nyalakan HP-nya
        dipsy.turnOnThePhone();
        
        //biar enak, kita buat dalam program
        Scanner input = new Scanner(System.in);
        String aksi;
        
        while (true){
            System.out.println("====APLIKASI INTERFACE ====");
            System.out.println("[1] Nyalakan HP");
            System.out.println("[2] Matikan HP");
            System.out.println("[3] Pembesar Volume");
            System.out.println("[4] Kecilkan Volume");
            System.out.println("[0] Keluar");
            System.out.println("-----------------------------");
            System.out.println("Pilih aksi>");
            aksi = input.nextLine();
            
            if(aksi.equalsIgnoreCase("1")){
                dipsy.turnOnThePhone();
            }else if(aksi.equalsIgnoreCase("2")){
                dipsy.turnOnThePhone();
            }else if(aksi.equalsIgnoreCase("3")){
                dipsy.makePhoneLounder();
            }else if(aksi.equalsIgnoreCase("4")){
                dipsy.makePhoneSilent();
            }else if(aksi.equalsIgnoreCase("0")){
                System.exit(0);
            }else{
                System.out.println("Kamu memilih aksi yang salah");
            }
        }
    }
    
}
