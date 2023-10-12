public class BankProfiling {
   private String name;
    private int age;
    private long accountnumber;
    private double balance;
    

   public int getAge() {
      return age;
   }

   public String getName() {
      return name;
   }

   public long getAccountnumber() {
      return accountnumber;
   }

   public double getBalance() {
      return balance;
   }
   
   //set your variable here
   public void setAge( int newAge) {
      age = newAge;
   }

   public void setName(String newName) {
      name = newName;
   }

   public void setAccountnumber( long newAccountnumber) {
      accountnumber = newAccountnumber;
   }
   
   public void setBalance(double newBalance) {
        balance = newBalance;
    }
   
   }

