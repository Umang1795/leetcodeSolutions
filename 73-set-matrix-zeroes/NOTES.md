int dummyRowArray[] = new int[row];
int dummyColumnArray[] = new int[column];
Arrays.fill(dummyRowArray,-1);
Arrays.fill(dummyColumnArray,-1);
a\
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
​
**//3.optimalApproach(for qs: setMatrixZeros)**
​
​