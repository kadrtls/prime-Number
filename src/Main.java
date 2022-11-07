public class Main {
    public static void main(String[] args) {
        int bölenleri = 0;

        for (double i=2.0;i<=100;i++){
          for (double j=2;j<i;j++){
              if (i%j==0){
                  bölenleri  +=1;
              }
          }

          if(bölenleri==0){
              System.out.println(i);
          }

          bölenleri =0;



      }
    }
}