// the following ip maybe changed anytime, use 
// bash to get or env to get it and put it
// into the setting file.good luck!
var myip = "192.168.43.133";

var fs = require('fs');
// for chinese transmition especially
var encoder = require('punycode');

// simply generate the html for user
function GenerateHead(des)
{

fs.writeFileSync(des,'<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">\n');
// actually it writes all contents from the beginning
// and I didn't find a good way to solve this, 
// use a really stupid method instead, hope to make a change
fs.writeFileSync(des,fs.readFileSync(des)+'<html xmlns="http://www.w3.org/1999/xhtml">\n');
// write title here
fs.writeFileSync(des,fs.readFileSync(des)+'<title>');
fs.writeFileSync(des,fs.readFileSync(des)+'Book List for Jxc');
fs.writeFileSync(des,fs.readFileSync(des)+'</title>\n');

fs.writeFileSync(des,fs.readFileSync(des)+'<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">\n');

}

function GenerateBody(htmldes,bookdes)
{

//write body here 
fs.writeFileSync(htmldes,fs.readFileSync(htmldes)+'<body>\n');
// this is the main content, the books
travel_and_write(bookdes,htmldes);
// end of all 
fs.writeFileSync(htmldes,fs.readFileSync(htmldes)+'</body>\n');

}

function GenerateTail(des)
{

//write body here 
fs.writeFileSync(des,fs.readFileSync(des)+'</html>\n');

}

var path = require('path');
// simple file travel operation
// we do a safe transmition as a result of 
// chinese character transmition, do not be surprised
// it really cost me a lot of time, indeed, danteng!
// variable used by this module
var replace_times = 0;
function  SafeGo(array)
{
replace_times = 0;
var result = [];
for(var i=0;i<array.length;i++)
{
result+=encoder.encode(array[i]);
// the spliter for each character, especially chinese ones.
result+='@';
}
return result;

}

function travel_and_write(dir,htmldes)
{
fs.readdirSync(dir).forEach(function(bookname){

// for safe transmition only
var safego = SafeGo(bookname);
// we do not have a replace all function, so we have to do more it for times.
// safego.replace(/-/g,'$');
var name = '<li><a href="http://'+myip+':1337/?'+safego+'">'+bookname+'</a></li>\n';
var pathname = path.join(dir,bookname);
if(fs.statSync(pathname).isDirectory())
{
 travel_and_write(pathname,htmldes);
}
else
{
// write the bookname into html for choose
fs.writeFileSync(htmldes,fs.readFileSync(htmldes)+name);
}
});
}

// export area
exports.GenerateHead = GenerateHead;
exports.GenerateBody = GenerateBody;
exports.GenerateTail = GenerateTail;

// this js file can be only used by other js files, expecially for server.js file
