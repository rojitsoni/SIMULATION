public class soni {

    
    public static void main(String[] args) {
        /*Co-ordinates of the bomber*/
        double[] xb={80,90,99,108,116,125,133,141,151,160,169,179,180};
        double[] yb={0,-2,-5,-9,-15,-18,-23,-29,-28,-25,-21,-20,-17};
        
        /*Co_ordinates of fighter to be determined*/
        double[] xf=new double[13];
        double[] yf=new double[13];
        xf[0]=0;
        yf[0]=50;
        
        double vf=20;   //speed of fighter
        boolean status=true;
        double dist;
        
        for (int t=0;t<12;t++)
        {
           dist=Math.sqrt((xb[t]-xf[t])*(xb[t]-xf[t])+(yb[t]-yf[t])*(yb[t]-yf[t]));
           if(dist<=10)
           {
                status=false;
                
                for(int i=0;i<13;i++)
                {
                    System.out.println(xf[i]+" "+yf[i]);
                }
                System.out.println("Target Destroyed at time t="+t);
                
                break;
           }
           yf[t+1]=yf[t]+vf*((yb[t]-yf[t])/dist);
           xf[t+1]=xf[t]+vf*((xb[t]-xf[t])/dist);
        }
        
        if(status)
        {
            for(int i=0;i<13;i++)
            {
                System.out.println(xf[i]+" "+yf[i]);
            }
            System.out.println("Target escaped!");
        }
    }
    
}