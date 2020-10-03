function ElectricLamp(){
    this.status = false;
    this.connect =false;
    this.isConnect = function(){
        this.connect=true;
    }
    this.turnOff = function(){
        this.status = false;  
        let lamp = document.getElementById("lamp");
        let switchLamp =lamp.outerHTML.replace("on.png","off.png");
        lamp.outerHTML = switchLamp;
    }
    this.turnOn = function(){
        this.status = false;  
        let lamp = document.getElementById("lamp");
        let switchLamp =lamp.outerHTML.replace("off.png","on.png");
        lamp.outerHTML = switchLamp;
    }
}
function SwitchButton(){

    // Button off
    this.status = false;
    // lamp = lamp input;
    this.lamp =  lamp;

    //method
    this.switchButton= function(){
    
    }
    this.isConnect= function(){
        if (this.status==false) return false;
        else return true;
    }

    this.connectToLamp = function(lamp){
        this.lamp=lamp;
        this.status=true;
        this.lamp.isConnect();
    }
    this.switchOff = function(){
        if(this.isConnect()){
            this.lamp.turnOff();
        }
        else (this.alert("You don't connect Lamp"));
    }
    this.switchOn = function(){
        if(this.isConnect()){
            this.lamp.turnOn();
        }
        else (this.alert("You don't connect Lamp"));
    }
}
let check=0;

    yellowLamp = new  ElectricLamp();
    button = new SwitchButton();
    button.connectToLamp(yellowLamp); 

function switchButton(){
    if (check==0){
        check=1;    

        button.switchOn();// vì sao khi debug nó chạy tới đây thôi? không chạy dòng lệnh check =0
        // check=0;    
    }
    else {
        check=0;
        button.switchOff()
    }
}