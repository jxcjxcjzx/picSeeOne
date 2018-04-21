var fs = require('fs');
var encoder = require('punycode');

var str = 'a,s,d,d,4,e,e,e';



function  SafeGo(array)
{

var result = [];
for(var i=0;i<array.length;i++)
{
console.log(encoder.encode(array[i]));
result+=encoder.encode(array[i]);
result+='#';
}
return result;

}

function SafeCome(input)
{

// temp string
var str="";
var splitres = input.split('#');
for(var i=0;i<splitres.length;i++)
{
str += encoder.decode(splitres[i]);
}
return str;
}


var one = '大ssd家才是真  的好';
var tem = SafeGo(one);
console.log(SafeCome(tem));
