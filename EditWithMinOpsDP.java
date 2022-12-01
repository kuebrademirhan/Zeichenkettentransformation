public class EditWithMinOpsDP extends EditWithMinOps {
    public EditWithMinOpsDP(EditOpHelper eoh, String s1, String s2) {
        super(eoh, s1, s2);
    }

    @Override
    protected EditOp[] computeEditOps(int m, int n) {
        EditOp[][][] result=new EditOp[m+1][n+1][];

        for(int i=0;i<=n;i++){ //if m==0
            result[0][i]=eoh.insertAll(s2,i);
        }
        for(int j=0;j<=m;j++){ //if n==0

            result[j][0]=eoh.deleteAll(s1,j);
        }
        int insertarr;
        int replacearr;
        int deletearr;

        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
              if(s1.charAt(i-1)== s2.charAt(j-1)){
                    result[i][j]=result[i-1][j-1];
                }else{
                  if(result[i][j-1]==null){
                      insertarr=0;
                  }else{
                      insertarr=result[i][j-1].length;
                  }
                  if(result[i-1][j]==null){
                      deletearr=0;
                  }else{
                      deletearr=result[i-1][j].length;
                  }if(result[i-1][j-1]==null){
                      replacearr=0;
                  }else{
                     replacearr=result[i-1][j-1].length;
                  }
                    if(insertarr<=deletearr && insertarr<=replacearr){
                        result[i][j]=eoh.append(result[i][j-1], new EditOp(EditOpType.INSERT,i,s2.charAt(j-1)));
                    }else if(deletearr<=insertarr && deletearr<=replacearr){
                        result[i][j]=eoh.append(result[i-1][j], new EditOp(EditOpType.DELETE,i-1));
                    }else if(replacearr<=insertarr && replacearr<=deletearr){
                    result[i][j]=eoh.append(result[i-1][j-1], new EditOp(EditOpType.REPLACE,i-1,s2.charAt(j-1)));}
                }
            }
        }

        return result[m][n];
    }
}
