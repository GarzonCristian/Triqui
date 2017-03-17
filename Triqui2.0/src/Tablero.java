

public class Tablero {
    
char[][]fichas=new char[3][3]; 

int CalcularTriqui(){
   //Calculo Para Filas 
 for (int i=0;i<3;i++){  
     
     if(fichas[i][0]==fichas[i][1]&&fichas[i][0]==fichas[i][2]){
         return 1;
     }
  }
   //Calculo Para columnas 
 for (int j=0;j<3;j++){  
     
     if(fichas[0][j]==fichas[1][j]&&fichas[0][j]==fichas[2][j]){
         return 1;
     }
  }
 
 //Calculo para diagonales
 
}
}