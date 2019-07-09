
public class Main {

	public static void main(String[] args) {	
	
		BankAccount[] BankAccounts = new BankAccount[5];
		BankAccounts[0] = new BankAccount();
		BankAccounts[1] = new BankAccount();
		BankAccounts[2] = new BankAccount();
		BankAccounts[3] = new BankAccount();
		BankAccounts[4] = new BankAccount();
		
		//BankAccounts[0]
		BankAccounts[0].addcustomerName("ACCOUNT 1:");
		BankAccounts[0].addaccountNumber(10001);
		System.out.println("AccountNumber1 : "+BankAccounts[0].accountNumber);
		BankAccounts[0].deposit(1000);
		System.out.println(BankAccounts[0].customerName + " " + BankAccounts[0].showBalance());
		BankAccounts[0].deposit(1000);
		System.out.println(BankAccounts[0].customerName + " " + BankAccounts[0].showBalance());
		BankAccounts[0].addinterest(0.5);
		BankAccounts[0].deposit(1000);
		System.out.println(BankAccounts[0].customerName + " " + BankAccounts[0].showBalance());
		BankAccounts[0].withdraw(500);
		System.out.println(BankAccounts[0].customerName + " " + BankAccounts[0].showBalance());
		System.out.println();
		//BankAccounts[1]
		BankAccounts[1].addcustomerName("ACCOUNT 2:");
		BankAccounts[1].addaccountNumber(10002);
		System.out.println("AccountNumber2 : "+BankAccounts[1].accountNumber);
		BankAccounts[1].deposit(10000);
		System.out.println(BankAccounts[1].customerName + " " + BankAccounts[1].showBalance());
		BankAccounts[1].deposit(10000);
		System.out.println(BankAccounts[1].customerName + " " + BankAccounts[1].showBalance());
		BankAccounts[1].addinterest(0.5);
		BankAccounts[1].deposit(10000);
		System.out.println(BankAccounts[1].customerName + " " + BankAccounts[1].showBalance());
		BankAccounts[1].withdraw(5000);
		System.out.println(BankAccounts[1].customerName + " " + BankAccounts[1].showBalance());
		System.out.println();		

		//BankAccounts[2]
		BankAccounts[2].addcustomerName("ACCOUNT 3:");
		BankAccounts[2].addaccountNumber(10003);
		System.out.println("AccountNumber3 : "+BankAccounts[2].accountNumber);
		BankAccounts[2].deposit(100000);
		System.out.println( BankAccounts[2].customerName + " " + BankAccounts[2].showBalance());
		BankAccounts[2].deposit(100000);
		System.out.println(BankAccounts[2].customerName + " " + BankAccounts[2].showBalance());
		BankAccounts[2].addinterest(0.5);
		BankAccounts[2].deposit(7000000);
		System.out.println(BankAccounts[2].customerName + " " + BankAccounts[2].showBalance());
		BankAccounts[2].withdraw(50000);
		System.out.println(BankAccounts[2].customerName + " " + BankAccounts[2].showBalance());
		System.out.println();
		
		//BankAccounts[3]
		BankAccounts[3].addcustomerName("ACCOUNT 4:");
		BankAccounts[3].addaccountNumber(10004);
		System.out.println("AccountNumber4 : "+BankAccounts[3].accountNumber);
		BankAccounts[3].deposit(20000);
		System.out.println(BankAccounts[3].customerName + " " + BankAccounts[3].showBalance());
		BankAccounts[3].deposit(20000);
		System.out.println(BankAccounts[3].customerName + " " + BankAccounts[3].showBalance());
		BankAccounts[3].addinterest(0.5);
		BankAccounts[3].deposit(2000000);
		System.out.println(BankAccounts[3].customerName + " " + BankAccounts[3].showBalance());
		BankAccounts[3].withdraw(6000);
		System.out.println(BankAccounts[3].customerName + " " + BankAccounts[3].showBalance());
		System.out.println();
		
		//BankAccounts[4]
		BankAccounts[4].addcustomerName("ACCOUNT 5:");
		BankAccounts[4].addaccountNumber(10005);
		System.out.println("AccountNumber5 : "+BankAccounts[4].accountNumber);
		BankAccounts[4].deposit(30000);
		System.out.println(BankAccounts[4].customerName + " " + BankAccounts[4].showBalance());
		BankAccounts[4].deposit(30000);
		System.out.println(BankAccounts[4].customerName + " " + BankAccounts[4].showBalance());
		BankAccounts[4].addinterest(0.5);
		BankAccounts[4].deposit(30000);
		System.out.println(BankAccounts[4].customerName + " " + BankAccounts[4].showBalance());
		BankAccounts[4].withdraw(90000);
		System.out.println(BankAccounts[4].customerName + " " + BankAccounts[4].showBalance());
		System.out.println();
		
		int positionMin=0,positionMax=0;
		double min = BankAccounts[0].showBalance();
		double max = BankAccounts[0].showBalance();
		for(int i=0;i<BankAccounts.length;i++){
			if(min > BankAccounts[i].showBalance()) {
				positionMin = i;
				min = BankAccounts[i].showBalance();
			}
				
			if(max < BankAccounts[i].showBalance()) {
				positionMax = i;
				max = BankAccounts[i].showBalance();
			}
				
		}
		System.out.println();
		System.out.println("The person with highest account balance is " + BankAccounts[positionMin].customerName + "($"+BankAccounts[positionMin].showBalance()+")");
		System.out.println("The person with highest account balance is " + BankAccounts[positionMax].customerName + "($"+BankAccounts[positionMax].showBalance()+")");
		System.out.println();
		
		BankAccounts[0].transactions = "DWWDDWWWWWWWWDDDD";
		BankAccounts[1].transactions = "DWDDDW";
		BankAccounts[2].transactions = "DWWWWDWW";
		BankAccounts[3].transactions = "DDDDWWW";
		BankAccounts[4].transactions = "WWDWDDDD";		
		
		int maxCol = 20;
		char charTransactions[][] = new char[BankAccounts.length][maxCol];		
		for(int i=0;i<BankAccounts.length;i++) {
			for(int j = 0;j<BankAccounts[i].transactions.length();j++) {
				charTransactions[i][j] = BankAccounts[i].transactions.charAt(j);
				//System.out.print(charTransactions[i][j] + " ");
			} 
			//System.out.println();
		}
		int[][] countTransactionsD = new int[BankAccounts.length][maxCol];
		int[][] countTransactionsW = new int[BankAccounts.length][maxCol];
		int[] countD = new int[5];
		int[] countW = new int[5];

		for(int i=0;i<5;i++) {
			countD[i] = 0;
			countW[i] = 0;
		}
		
		for(int i=0;i<BankAccounts.length;i++) {
			for(int j = 0;j<BankAccounts[0].transactions.length();j++) {			
				if(charTransactions[i][j] == 'D') {		//Find D
					countTransactionsD[i][countD[i]]+=1;	
					//System.out.println("countD[i] = " + countD[0]);				
				}else {
					if(countD[i]==0 && charTransactions[i][j+1] == 'D')
						countD[i]=1;
					else if(countD[i]==1 && charTransactions[i][j+1] == 'D')
						countD[i]=2;
					else if(countD[i]==2 && charTransactions[i][j+1] == 'D')
						countD[i]=3;
					else if(countD[i]==3 && charTransactions[i][j+1] == 'D')
						countD[i]=4;
					else if(countD[i]==4 && charTransactions[i][j+1] == 'D')
						countD[i]=5;
					else if(countD[i]==5 && charTransactions[i][j+1] == 'D')
						countD[i]=6;
				}
			
			
				if(charTransactions[i][j] == 'W') {		//Find W
					countTransactionsW[i][countW[i]]+=1;				
				}else {
					if(countW[i]==0 && charTransactions[i][j+1] == 'W')
						countW[i]=1;
					else if(countW[i]==1 && charTransactions[i][j+1] == 'W')
						countW[i]=2;
					else if(countW[i]==2 && charTransactions[i][j+1] == 'W')
						countW[i]=3;
					else if(countW[i]==3 && charTransactions[i][j+1] == 'W')
						countW[i]=4;
					else if(countW[i]==4 && charTransactions[i][j+1] == 'W')
						countW[i]=5;
					else if(countW[i]==5 && charTransactions[i][j+1] == 'W')
						countW[i]=6;
				}			
			}
		}
		
		int[] maxD = new int[5];
		int[] maxW = new int[5];
		for(int i=0;i<5;i++) {
			maxD[i] = 0;
			maxW[i] = 0;
		}
		for(int i=0;i<BankAccounts.length;i++) { //Find Max
			for(int j=0;j<BankAccounts[i].transactions.length();j++) {
				if(countTransactionsD[i][j] > maxD[i]) {
					maxD[i] = countTransactionsD[i][j];
				}
				if(countTransactionsW[i][j] > maxW[i]) {
					maxW[i] = countTransactionsW[i][j];
				}
			}
		}
		
		for(int i=0;i<BankAccounts.length;i++) { //Display
			if(maxD[i] > maxW[i]) {
				System.out.println(BankAccounts[i].customerName+" : Longest repeating activity: Deposit ("+ maxD[i] +" times)");
			}
			if(maxW[i] > maxD[i]) {
				System.out.println(BankAccounts[i].customerName+" : Longest repeating activity: Withdraw ("+ maxW[i] +" times)");
			}
		}
		
	}
}