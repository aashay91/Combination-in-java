import java.util.Arrays;


public class Money {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		countCoins(new int[]{1,5,10,20},4,12);
	}

	public static void countCoins(int [] coin,int size,int tofind)
	{
	        int []minCount=new int[tofind+1];
	        		int i,j,mintillnow;
	        		String js="";
	        for(i=0;i<tofind+1;++i)
	                minCount[i]=0;
	 
	        for(i=0;i<size;i++)
	                if(coin[i]<=tofind)
	                        minCount[coin[i]]=1;
	        for(i=1;i<=tofind;i++)
	        {
	                if(0==minCount[i])
	                {
	                        mintillnow=Integer.MAX_VALUE;
	                        for(j=1;j<i;j++)
	                        {
	                                if(minCount[j]+minCount[i-j]<mintillnow)
	                                        mintillnow=minCount[j]+minCount[i-j];
	                                System.out.println(mintillnow);
	                        }
	                        minCount[i]=mintillnow;
	                        js="";
	                        for(int y=0;y<minCount.length;y++)
	                        	js=js.concat(minCount[y]+"-");
	                        System.out.println("----------"+i+"-------------");
	                        System.out.println(js);
	                        
	                }
	        }
	        System.out.println("Minimum number of coins needed is:"+minCount[tofind]);
	       // printf("Minimum number of coins needed is: %d",minCount[tofind]);
	}
}
