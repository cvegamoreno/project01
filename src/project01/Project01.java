package project01;

public class Project01 {
    public static void main(String[] args) {
        int may =-1000,men=1000;  
         String res="";
         int Num[]=new int[10];
            Num[0]=10;
            Num[1]=15;
            Num[2]=1;
            Num[3]=-2;
            Num[4]=5;
            Num[5]=7;
            Num[6]=-489;
            Num[7]=3;
            Num[8]=-98;
            Num[9]=456;
         for(int i=0;i<10;i++){
           if(Num[i]>may){  
               may=Num[i];  
           }  
           if(Num[i]<men){  
               men=Num[i];  
           }
           res=res+" "+Num[i];
         }  
          System.out.println(res);  
          System.out.println("El mayor es:"+may);
          System.out.println("El menor es:"+men);
    }
    
}
