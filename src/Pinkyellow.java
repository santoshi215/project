public class Pinkyellow {
    
    public static void main(String[] args)
            {
                int count=0;int ycount=0;int bcount=0;
                for(int i=33;i<=999;i++)
                {
                if(i%3==0 && i%5==0)
                    {
                        System.out.println("yellow and pink");
                        bcount++;
                    }
                    else if (i%5==0)
                            {
                               System.out.println("yellow");  
                               ycount++;
                            }
                    if(i%3==0)
                    {
                      System.out.println("pink");  
                      count++;
                    }
                    else
                    {
                        System.out.println(i); 
                    }
                  
            }
                System.out.println("no of pinks are:"+count);
                    System.out.println("no of yellows are:"+ycount);
                    System.out.println("no of yellows and pinks are:"+bcount);
                }
    
    
}
