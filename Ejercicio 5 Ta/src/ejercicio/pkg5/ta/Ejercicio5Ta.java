package ejercicio.pkg5.ta;

public class Ejercicio5Ta {

    public static void main(String[] args) {
    
     int matriz[][] =new int [10][10];
    int f=1,c=0;                        
    
 //columna
    for(int i=0; i<=matriz.length; i++){
        System.out.print(c);
        c++;
    }
    System.out.println();
     //fila
        for(int i=0; i<=matriz.length; i++){
            System.out.print(f);
            f++;
            //relleno
           for(int j=0; j<=matriz.length; j++){
           System.out.print("0"); 
           
           }
          System.out.println( );
          
        } 
    System.out.println("\n");
      for(int i=1; i<=matriz.length; i++){
    for(int j=1; j<=matriz.length; j++){
        int multi=i*j;
        System.out.print(multi+"  ");
        if(multi<=10){
            System.out.print(" ");
        }
    }
System.out.println();
    }
    
      
    }
    
    
}
