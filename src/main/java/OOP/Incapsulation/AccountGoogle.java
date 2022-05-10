package OOP.Incapsulation;

public class AccountGoogle {
   private String email;
   private String password;

   //getteri
   public String getPassword(){
       return password;
   }
//seteri
   public void setPassword(String password){
       this.password=password;
   }

    AccountGoogle(String email, String password){
        this.email=email;
        this.password=password;
    }


}

class TestAccounts{
    public static void main(String[] args) {
        AccountGoogle accountGoogle1 = new AccountGoogle("example@gmail.com", "1234parola");

        accountGoogle1.setPassword("32423543");
        System.out.println(accountGoogle1.getPassword());
    }
}
