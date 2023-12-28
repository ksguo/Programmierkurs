package VOB10_a2;

import java.util.Arrays;

public class A2_main {

    public static int[][] grid = new int[3][3];


    public static void main(String[] args) {
        //设置3个单元格为-1
        grid[0][1] = -1;
        grid[1][2] = -1;
        grid[2][2] = -1;

        printGrid();
        System.out.println("---------------------------");
        updateGrid();
        printGrid();

    }

    //更新计算和处理后的新的二维数组
        public static void updateGrid(){
            for (int i = 0; i < grid.length; i++) {
                for (int j = 0; j < grid[i].length; j++) {
                        if(grid[i][j] != -1){
                            grid[i][j] = countAdjMines(i,j);//把不是-1的元素变成需要的值

                        }
                }

            }
        }

    //计算当前元素周边有多少个-1
        public static int countAdjMines(int zeile, int spalte){
            int count = 0 ;
            //两个for循环检查四周所有单元格
            for(int i = -1 ;i <= 1 ; i++ ){
                for(int j = -1; j <= 1 ;j++){

                    //确保检查当前元素的周边时不超出矩阵的边界
                    if(zeile + i >=0 && zeile + i < grid.length && spalte +j >=0 && spalte +j < grid[zeile].length ){
                        if(grid[zeile + i][spalte + j ] == -1){
                            count ++;
                        }
                    }
                }
            }
            return count;
        }

    public static void printGrid() {
        for (int[] zeile : grid) {
            for (int cell : zeile) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }





    }


