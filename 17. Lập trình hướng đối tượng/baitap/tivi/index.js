function Remote(){
    this.tv =null;
    this.buttonChanel =0;
    this.buttonVolume =69;
    this.powerUpTV=function(tivi){
        tivi.isConnect();
    }
    this.switchChanel = function(num){
        this.tv.onChannel(num);
    }
    this.incVolume = function(){
        this.tv.incVolume();
    }
    this.decVolume = function(){
        this.tv.decVolume();
    }
}

// Mỗi lần 
function Tivi(){
    this.status = false
    this.chanel=0;
    this.volume =69;
    this.isConnect= function(){
       
        this.status=true;
    }
    this.onChannel = function(num){
        if (checkStatus()==true){
            this.chanel = num;
        }
        else alert("You need to powerUp the tivi");
       
    }
    this.incVolume = function(){
        if (checkStatus()==true){
            this.volume++;

        }
        else alert("You need to powerUp the tivi");
       
    }
    this.decVolume = function(){
        if (checkStatus()==true){
            this.volume--;
        }
        else alert("You need to powerUp the tivi");
    }  
    this.displayChanel= function(){
        if (checkStatus()==true){
            alert("Day la kenh " + this.chanel);

        }
        else alert("You need to powerUp the tivi");
    }
    this.checkStatus= function(){
        return this.status;
    }
}

yelloRemote = new Remote();
smartTV = new Tivi();
yelloRemote.connectTV(smartTV);
yelloRemote.switchChanel(3);
yelloRemote.incVolume();
