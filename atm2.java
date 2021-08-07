import java.util.Scanner;
public class atm2 {
    public static void main(String[] args) {
        String userName, password;
        Scanner input = new Scanner(System.in);
        int denemehakki = 3;
        int bakiye = 1500;
        int miktar;
        int islem;
        while (denemehakki > 0) {
            System.out.print("Kullanıcı Adınız :");
            userName = input.nextLine();
            System.out.print("Parolanız : ");
            password = input.nextLine();

            if (userName.equals("arif") && password.equals("123")) {
                System.out.println("Merhaba, Kodluyoruz Bankasına Hoşgeldiniz!");
                do {
                    System.out.println(
                                    "1-Bakiye Sorgula\n" +
                                    "2-Para Yatırma\n" +
                                    "3-Para Çekme\n" +
                                    "4-Çıkış Yap");
                    System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz : ");
                    islem = input.nextInt();
                    switch (islem){
                        case 1:
                            System.out.println("bakiyeniz : " + bakiye + "tl");
                            break;
                        case 2:
                            System.out.println("Ne kadar yatıracaksınız?");
                            miktar = input.nextInt();
                            bakiye += miktar;
                            System.out.println("bakiyeniz : " + bakiye + "tl");
                            break;
                        case 3:
                            System.out.println("Ne kadar çekeceksiniz?");
                            miktar = input.nextInt();
                            if(miktar > bakiye){
                                System.out.println("Bakiyeniz yetersiz!!");
                            }else {
                                bakiye -= miktar;
                                System.out.println("bakiyeniz : " + bakiye + "tl");
                            }
                            break;
                        case 4:
                            System.out.println("sistemden çıkılıyor");
                            break;
                        default:
                            System.out.println("geçersiz işlem");
                    }
                }while (islem != 4);
            } else {
                denemehakki--;
                System.out.println("Hatalı kullanıcı adı veya şifre. Tekrar deneyiniz.");
                if (denemehakki == 0) {
                    System.out.println("Hesabınız bloke olmuştur lütfen banka ile iletişime geçiniz.");
                } else {
                    System.out.println("Kalan Hakkınız : " + denemehakki);
                }
            }
        }
    }
}
