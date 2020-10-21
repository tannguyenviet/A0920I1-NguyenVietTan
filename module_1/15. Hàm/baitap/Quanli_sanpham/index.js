let arrProduct = ["Iphone", "Samsung", "Oppo"];
function displayProduct() {
    document.body.innerHTML = "";
    let temp = "<h2> Add new product</h2><br>" +
        "<input type='text' id='newProduct'>" +
        "<input type='button' value='Add new product' onclick='addNewProduct()'>";
    temp += "<table>";
    for (let i = 0; i < arrProduct.length; i++) {
        temp += "<tr><td>" + arrProduct[i] + "</td>" +
            "<td><input type='button' value='Edit' onclick='displayFormEditProduct("+ i +")'></td>"+
            "<td><input type='button' value='Delete' onclick='deleteProduct("+ i +")'></td>" +
            "</tr>";
    }
    temp += "</table>";
    document.write(temp);
}
displayProduct();
// Add
function addNewProduct() {
    let newProduct = document.getElementById("newProduct").value;
    arrProduct.push(newProduct);
    displayProduct();
}
// Edit
function displayFormEditProduct(index) {
    let temp = "<h2> Edit Product </h2>" +
        "<input type='text' value='" + arrProduct[index] +"' id='product'>" +
        "<input type='button' value='Edit Product' onclick='editProduct("+ index +")'>";
    displayProduct();
    document.write(temp);
}
function editProduct(index) {
    let newProduct = document.getElementById("product").value;
    arrProduct[index] = newProduct;
    displayProduct();
}
// Delete
function deleteProduct(index) {
    if (confirm("Bạn có chắc chắn xóa" + arrProduct[index] + " này không?")) {
        arrProduct.splice(index, 1);
    }
    displayProduct();
}



// let products=["Pen","Ruler","Book"];
// function displayProduct(){
//     let temp="";
//     for (let i =0;i<products.length;i++){
//         temp = temp + "<label id='"+i+"'>"+ products[i] + "</label>"
//              + "<button id='hello' onclick='displayEditProduct(" +i+ ")'"+">Edit</button>" 
//              + "<button id='hello' onclick='deleteProduct(" +i+ ")'"+">Delete</button>" 
//              +"</br>"
//     }
//     // Hiển thị danh sách sp
//     document.getElementById("listProduct").innerHTML=temp;  
// }
// function deleteProduct(index){
//     if (confirm("Bạn có chắc chắn xóa" + products[index] + " này không?")) {
//                 products.splice(index, 1);
//             }
//     displayProduct();
// }
// function editProduct(index){
//     let newProduct = document.getElementById("product").value;
//     products[index]= newProduct;
//     displayProduct();
// }
// function displayEditProduct(index){
//     let temp = "<h2> Edit Product </h2>" +
//         "<input type='text' value='" + products[index] +"' id='product'>" +
//         "<input type='button' value='Edit Product' onclick='editProduct("+ index +")'>";
//     document.getElementById("editProduct").innerHTML=temp;
// }
// displayProduct();

