function convert(){
    var input = document.getElementById("input_money").value;
    var cur_fr=document.getElementById("from_currency").selectedIndex;
    var cur_to=document.getElementById("to_currency").selectedIndex;
    // Chuyển sang tiền default là tiền việt
    var def_cur=0;
    switch (cur_fr){
        case 0:
            // nếu là tiền Việt giữ nguyên giá trị
            def_cur = input;
        break;
        case 1:
            // USD
            def_cur = input*23000;
        break;

        case 2:
            // Rupt
            def_cur = input*5000;
        break;
    }
    switch (cur_to){
        case 0: 
            // tiền việt giữ nguyên
        break;
        case 1:
            // USD --> chia
            def_cur =def_cur/23000;
        break;
        case 2:
            // Rupt --> chia
            def_cur = def_cur/5000;
        break;
    }
    document.getElementById("result").innerHTML=def_cur  ;
    

}

