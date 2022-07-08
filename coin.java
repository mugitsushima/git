class coin{

    public static void main(String[] args){

	int heads=0;
	int tails=0;

	for(int i=1;i<=3;i++){
	    int coin = (int)(Math.random()*2);
	    if(coin==1)heads++;
	    else tails++;
	}
	System.out.println("Heads: "+heads+", Tails: "+tails);
    }
}
