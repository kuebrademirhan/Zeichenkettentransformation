public class EditWithMinOpsNaive extends EditWithMinOps  {
    public EditWithMinOpsNaive(EditOpHelper eoh, String s1, String s2) {
        super(eoh, s1, s2);
    }

    @Override
    protected EditOp[] computeEditOps(int m, int n) {
        EditOp[] result;
        /*if(s1.equals(s2)){
            return result;
        }

        if(m<0 || n<0){
            return result;
        }*/
        if(m==0){
             result=eoh.insertAll(s2,n);
             return result;
        }
       if(n==0){
          result= eoh.deleteAll(s1,m);
           return result;

       }
        if(s1.charAt(m-1)==s2.charAt(n-1)){
            result=computeEditOps(m-1,n-1);
            return result;
        }
        EditOp[] insert=computeEditOps(m,n-1);
        EditOp[] delete =computeEditOps(m-1,n);
        EditOp[] replace=computeEditOps(m-1,n-1);

       //min
        int min=insert.length;
        if(delete.length<min){
            min= delete.length;
        }else if(replace.length<min){
            min= replace.length;
        }

        if(min==insert.length){
            result=eoh.append(insert, new EditOp(EditOpType.INSERT,m,s2.charAt(n-1)));
        }else if(min== delete.length){
            result=eoh.append(delete, new EditOp(EditOpType.DELETE,m-1));
        }else{
            result=eoh.append(replace, new EditOp(EditOpType.REPLACE,m-1,s2.charAt(n-1)));
        }

        return result;
    }
}
