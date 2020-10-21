function Human(name,gender,weight){
    this.name  = name;
    this.gender =gender;
    this.weight= weight;

    this.isMale =function(){
        if (this.gender=="man" ) return (true)
        else return false;
    }
    this.setGender = function(gen){
        this.gender=gen;
    }
    this.checkApple = function(apple){
        if (apple.isEmpty()==false )return true;
        else return false;
    }
    this.eat = function(apple){
        apple.decrese();
        this.weight++;
    }
    this.getName = function(){
        return this.name;
    }
    this.getWeight = function(){
        return this.weight;
    }
}
function Apple(){
    this.weight=10;

    // method Apple
    this.decrese = function(){
        this.weight--;
    }
    this.isEmpty = function(){
        if (this.weight==0){
            return true;
        
        }
        else return false;
    }
    this.getWeight = function(){
        return this.getWeight;
    }
}

adam = new Human("Adam","Male","50");
eva = new Human("Eva","Female","40");
greenApple = new Apple();

adam.eat(greenApple);
console.log(adam);
console.log(greenApple);

