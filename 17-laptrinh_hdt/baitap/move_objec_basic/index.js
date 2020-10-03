function Hero(img,size,top,left){
    this.img=img;
    this.size = size;
    this.top = top;
    this.left=left;
    // Lấy vị trí mới khi di chuyển
    this.getPosition= function(){
    
        var content='<img width="'+ this.size + '"' +
        ' height="'+ this.size + '"' +
        ' src="' + this.img +'"' +
        ' style="top: '+this.top+'px; left:'+this.left+'px;position:absolute;" />';
        return content;
    }
    this.move = function(){
        this.left+=20;
}
}
var pikachu = new Hero("pikachu.png",200,0,0);

function start(){
    if(pikachu.left < window.innerWidth - pikachu.size){
        pikachu.move();
      }
      console.log(pikachu)
      document.getElementById('hero').innerHTML = pikachu.getPosition();
      setTimeout(start, 200)
}
start();