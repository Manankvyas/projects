package typesofsearches;
import java.util.*;
class details
{
	String enter;
	String emailid;
	
	String enter()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter your name");
		enter = scan.next();
		return enter;
		
	}
	String emailid()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter your email");
		emailid = scan.next();
		return emailid;
		
	}
}

class player
{
	int guessNum1;
	int guessNum2;
	int guessNum3;
	
	
	int guessNum1()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("player1  kindly guess the number");
		guessNum1=scan.nextInt();
		return guessNum1;
	}
	int guessNum2()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("player2  kindly guess the number");
		guessNum2=scan.nextInt();
		return guessNum2;
	}
	int guessNum3()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("player3  kindly guess the number");
		guessNum3=scan.nextInt();
		return guessNum3;
	}	
}

class gusser
{
	int guessNum;
	
	int guessNum()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("guesser kindly guess the number");
		guessNum=scan.nextInt();
		return guessNum;
	}
}

class Umpire
{
	String nameoftheplayer;
	String emailoftheplayer;
	int numFromGuesser;
	int numFromPlayer1;
	int numFromPlayer2;
	int numFromPlayer3;
	
	
	void collectNumFromplayers()
	{
		player p1=new player();
		player p2=new player();
		player p3=new player();
		numFromPlayer1=p1.guessNum1();
		numFromPlayer2=p2.guessNum2();
		numFromPlayer3=p3.guessNum3();
	}
	void collectNumFromguesser()
	{
		gusser g = new gusser();
		numFromGuesser=g.guessNum();
		
	}
	void nameoftheplayer()
	{
		details g=new details();
		nameoftheplayer=g.enter();
	}
	void emailoftheplayer()
	{
		details g=new details();
		emailoftheplayer=g.emailid();
	}
	void compare()
	{
		if(numFromGuesser==numFromPlayer1)
		{
			if(numFromGuesser==numFromPlayer2 && numFromGuesser==numFromPlayer3)
			{
				System.out.println(   "player 1 won the game");
			}
			else if(numFromGuesser==numFromPlayer2 )
			{
				System.out.println("Player 1 & Player2 won");
			}
			else if(numFromGuesser==numFromPlayer3)
			{
				System.out.println("Player 1 & Player3 won");
			}
			else
			{
			System.out.println("Player 1 won the game");
			}
		}
		else if(numFromGuesser==numFromPlayer2)
		{
			if(numFromGuesser==numFromPlayer3)
			{
				System.out.println("Player 2 & Player3 won");
			}
			else
			{
			System.out.println("Player 2 won the game");
			}
		}
		else if(numFromGuesser==numFromPlayer3)
		{
			System.out.println("Player 3 won the game");
		}
		else
		{
			System.out.println("Game lost Try Again!");
		}
		
	}
	
}





public class gussergame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Umpire u=new Umpire();
		u.nameoftheplayer();
		u.emailoftheplayer();
		u.collectNumFromguesser();
		u.collectNumFromplayers();
		u.compare();


	}

}
