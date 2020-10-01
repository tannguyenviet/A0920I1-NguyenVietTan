var num1=0;
var num2=0;
var s="";
// Nhấn vào dấu thì lưu num1 bằng gia tri của input
function sign(dau){
     s=dau;
     num1=document.getElementById("result").value;
     document.getElementById("result").value="";
}
function equal(){
    var result=0;
    num2=document.getElementById("result").value;
    switch (sign){
        case "x":
        result = num1*num2;
        break;
        case "-":
        result = num1-num2;
        break;
        case "+":
        result = num1+num2;
        break;
        case "%":
        result = num1%num2;
        break;
        // case "=":
        // result = num1*num2;
    }
    
    document.getElementById("result").value = result;
}