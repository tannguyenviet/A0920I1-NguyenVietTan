function bai1_fibo(){
    var a1=1;
    var a2=1;
    var a3
    for (var i =1;i<=50;i++){
        a3=a1+a2;
        console.log(a3+" ");
        a1=a2;
        a2=a3;
    }
}
function bai2_giaithua(num){
    var result=1;
    for(var i=num;i>=1;i--){
        result*=i;
    }
    return result
}
function bai3_intamgiac(n){
    for(var i=1;i<=n;i++){
        for(var j=1;i<=i;i++){
            document.write("*")
        }
        document.write("<br>")
    }
}