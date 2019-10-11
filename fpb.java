public class fpb{

  public static void main(String[] args){
    int[] arr = new int[]{4, 3, 12, 144, 288};
    System.out.print(cariFpb(arr));
  }

  public static int fpb(int a, int b){
    if (a == 0){
      return b;
    } 
    else{
    return fpb(b%a, a);
   }
  }

  public static int cariFpb(int[] x){
    int mulai = x[0];

    for (int i = 1; i < x.length; i++){
      mulai = fpb(mulai, x[i]);
    }
    return mulai;
  }
}
