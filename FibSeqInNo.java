
public class FibSeqInNo {
static int count;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int range1=11212;    
	    int range2=11312;
	    for(int k=range1;k<=range2;k++)
	    {
	        String f = Integer.toString(k);
	        int n = f.length()/2;
	        for(int i=0;i<n;i++)
	        {
	                for(int j=i+1;j<n+i+1;j++)
	                {
	                    int num1 = Integer.parseInt(f.substring(0, i+1));
	                    int num2 = Integer.parseInt(f.substring(i+1, j+1));
	                    int num3 = Integer.parseInt(f.substring(j+1,f.length()));
	                    int temp = check(num1,num2,num3);
	                    if(temp == 0)
	                           continue;
	                    else
	                        break;
	                }
	        }
	    }
	}

	
	public static int check(int n1,int n2,int n3)
	{
	    count++;
	    if(n1+n2==n3)
	    {
	        //System.out.println(n1+"+"+n2+"="+n3);
	        System.out.println(n1+""+n2+""+n3);
	        return 1;
	    }
	    else
	    return 0;
	}
}
