public class Eagle {

  public void eagleMethodOne()
  {
             int [][] a = new int[2][2];

             a [0][0] = 5;
             a [0][1] = 10;
             a [1][0] = 15;
             a [1][1] = 20;


             for(int i=0;i<a.length;i++)
             {
                 for(int j=0;j<a.length;j++)
                 {
                     System.out.println(a[i][j]);
                 }

             }
  }
    public static void main(String[] args)
    {
          Eagle ee = new Eagle();
          ee.eagleMethodOne();

    }


}
