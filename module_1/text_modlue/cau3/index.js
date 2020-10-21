function Book(mss, name, year, quantity) {
    this.masosach = mss;
    this.name = name;
    this.year = year;
    this.quantity = quantity;
    this.status = true;

    this.setMss=function(mss){
        this.Masosach=mss;
    }
    this.setName=function(name){
        this.name =name; 
    }
    this.setYear=function(){
        this.Year = year;
    }
    this.setQuantity=function(num){
        this.quantity =num;
    }
    this.getMss=function(){
        return this.Masosach;
    }
    this.getName=function(){
        return this.name;
    }
    this.getYear =function(){
        return this.year; 
    }
    this.getQuantity= function(){
        return this.quantity;
    }

}
le;
let content="";
function displayarrBook(){
    let content="";
    for(let i =0;i<arrBook.length;i++){
        content += "<tr id='table'>" + "<td>" + arrBook[i].masosach + "</td>"
                    +"<td>" + arrBook[i].name + "</td>"
                    +"<td>" + arrBook[i].year + "</td>"
                    +"<td>" + arrBook[i].quantity + "</td>"
                    +"<td>" + arrBook[i].status + "</td>" + "</tr>";
    }
    console.log(content);
    document.getElementById("table").outerHTML=content;
    
}
function HireBook(){
    var a =prompt("Nhập mã số sách muốn mượn:");
}
function addNewBook() {
    let mss=0;
    
    do {
         mss = parseInt(prompt("Nhập Mã số sách:  "));

    } while (mss <= 10000 || mss >= 99999);

    let year = 0;
    do {
         year = parseInt(prompt("Nhập Số năm:  "));
    } while (year <= 1000 || year >= 9999);

    let name ="";
    name = (prompt("Nhập tên sách:  "));
    let quantity=0;
    do {
        quantity = parseInt(prompt("Nhập Số quyển:  "));
    } while (quantity <= 0 || isNaN(quantity) );

    let newBook = new Book(mss,name,year,quantity);
    arrBook.push(newBook);
displayarrBook();

}