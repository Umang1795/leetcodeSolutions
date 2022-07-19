class Solution {
    public void setZeroes(int[][] matrix) {
        int row = matrix.length;
        int column = matrix[0].length;
        int dummyRowArray[] = new int[row];
        int dummyColumnArray[] = new int[column];
        Arrays.fill(dummyRowArray,-1);
        Arrays.fill(dummyColumnArray,-1);
       
        
        //initialize dummy arrays
         for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
               if(matrix[i][j]==0){
                   dummyRowArray[i]=0;
                   dummyColumnArray[j]=0;
               }
        }
         }
       //place zeros if dummy array is zero at that position
        for (int i =0;i<row;i++){
            for(int j=0;j<column;j++){
                if(dummyRowArray[i]==0 || dummyColumnArray[j]==0){
                    matrix[i][j]=0;
                }
            }
        }
        
        
    }

}