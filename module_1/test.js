function kangaroo(x1, v1, x2, v2) {
    //
    let result ="YES";

    if(x1>x2){
        tg = x1;
        x1=x2;
        x2=tg;
        tg=v1;
        v1=v2;
        v2=tg;
    }
    if(v2>v1){
        result="NO";
    }
    //v2<=v1
    else{
        if(v2==v1){
            if(x2==x1){
                result="YES";
            }
            else
            result="NO";
        }
        //v2<v1
        else{
            if((x2-x1)%(v1-v2)==0){
                result="YES";
            }
            else result ="NO";
        }
    }
    return result;
}
