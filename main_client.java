import java.util.*;
public class main_client 
{
public static void main(String[] args) 
{
Scanner sc = new Scanner(System.in);
user user1 = new user();
System.out.println("Enter 1 to add friend, 2 to remove friend, 3 to like friend, 4 to unlike friend");
int s = sc.nextInt();
//System.out.println("Enter your username");
//String username = sc.read();    	
String userx="Naman";
String usery="Abhi";
String userz="Rakesh";
int cha=0;
do{

if (s==1){
addingfriend add_friend = new addingfriend(user1);
caller in = new caller(add_friend);
in.execute();

System.out.println("Do you wish to continue to perform further actions? If yes, press 1.");
cha=sc.nextInt();
}
else if (s==2){
removingfriend rem_friend = new removingfriend(user1);
caller in = new caller(rem_friend);
in.execute();

System.out.println("Do you wish to continue to perform further actions? If yes, press 1.");
cha=sc.nextInt();
}
else if (s==3){
like_friend lik = new like_friend(user1);
caller in = new caller(lik);
in.execute();

System.out.println("Do you wish to continue to perform further actions? If yes, press 1.");
cha=sc.nextInt();
}
else if (s==4){
unlike_friend unlik = new unlike_friend(user1);
caller in= new caller(unlik);
in.execute();

System.out.println("Do you wish to continue to perform further actions? If yes, press 1.");
cha=sc.nextInt();
}
}while(cha==1);

}
}

