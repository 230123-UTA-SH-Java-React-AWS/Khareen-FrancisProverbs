console.log("this is similar to sysout method in java");

let someVar = "Hello";

console.log(someVar);

console.log("=====undefined vs null=========");

let y;
let x;

x = null; //lack of value

console.log(x);
console.log(y); // will print undefined becauase the value was not set value was not set

//---------References--------------
//Objects
//this is just a js object not json.
//must json.stringify() to convert to json
let pokeObj = {
  name: "Pikachu",
  level: 10,
  health: 100,
  damage: 120,

  talk() {
    console.log("pikapika");
  },
};
console.log(po);

//Functions
//Arrays
