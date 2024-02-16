package PBL08_a1;

public class A1_main {

    public static void main(String[] args){

        int[][] test =new int[][]{{1,2}, {3,4,5,6,7}, {3}};
        System.out.println(countLongestRow(test));
        System.out.println(countLongestCol(test));

        int[][] testRegular = new int [][] {{1,2}, {8}, {0,0}};
        System.out.println(isRegular(testRegular));

        int[][] testQua = new int[][]{{1,2}, {8,9}, {0,0}};
        System.out.println(isQuadratic(testQua));




    }

    public static int countLongestRow(int[][] a){
        int rowLength = 0 ;
       for(int i = 0;i<a.length ;i++){
            if(a[i].length > rowLength){
                rowLength = a[i].length;

            }

       }
    return rowLength;
    }

    public static int countLongestCol(int[][] a){
        int maxColLength = a.length;
        return maxColLength;
    }

    public static boolean isRegular(int[][] a){

        if(a.length == 0) {
            return true;
        }
        for(int i = 0;i<a.length ;i++){
            if(a[0].length != a[i].length){
                return false;
            }
        }
        return true;
    }



    public static boolean isQuadratic(int[][] a){

        int numRows = a.length;
        if (numRows == 0) {
            return false;
        }
        int numCols = a[0].length;

        if (numRows != numCols) {
            return false;
        }
        for(int i = 0; i <a.length;i++){
            if(a.length != a[i].length){
                return false;
            }
        }
        return true;
    }







}
