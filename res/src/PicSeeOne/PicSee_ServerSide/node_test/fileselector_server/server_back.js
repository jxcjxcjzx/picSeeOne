// the settings for file directory, you can change this, write it into 
// setting files
var bookdir = '/media/Elements/BookStore/中文Kindle电子书/B/';
var copydestination = '/media/OPPO/books_mobi/';

// simple file copy operation
var fs = require('fs');
// for chinese transmition especially
var encoder = require('punycode');

function copy(src,dst)
{
 fs.writeFileSync(dst,fs.readFileSync(src));
}


var child_process = require('child_process');
var util = require('util');

// the following function is suggested to be used 
function copy_proto(source,target)
{

child_process.exec(util.format('cp %s %s',source,target));

} 

var path = require('path');
// simple file travel operation
function travel(dir,callback)
{
fs.readdirSync(dir).forEach(function(file){

var pathname = path.join(dir,file);
if(fs.statSync(pathname).isDirectory())
{
 travel(pathname,callback);
}
else
{
callback(pathname);
}
});
}


var HtmlWriter = require('./htmlgenerator.js');

// server function, the main process
// here we also import safe transmition 
// cause of chinese characters... do not forget

function SafeCome(input)
{

 // console.log(input);
// temp string
// input.replace()
var str="";
var splitres = input.split('@');
for(var i=0;i<splitres.length;i++)
{
str += encoder.decode(splitres[i]);
}
 console.log(str);
return str;

}

var http = require('http');
var url = require('url');
function fileselect_server(src,des){
http.createServer(function (req, res) {

  var tmp = req.url;
  var params = url.parse(tmp);
// if is the first time, push the index page
  if(params.query=='index')
  {
 	res.write(fs.readFileSync('./index.html'));
  }
  else{
  var iwantyou = SafeCome(params.query);

  // do the file move operation here
  // when the file name matches, do the move operation
  copy_proto(src+iwantyou,des);
  
  // tell user the operation sucesses
  res.writeHead(200,{'Content-Type':'text/plain'});
  res.end('file Successfully copied! Have a good day!');
 }

}).listen(1337);
console.log('Server running at http://you know the ip:1337/');
}


function main(argv)
{
 HtmlWriter.GenerateHead(argv[0]);
 HtmlWriter.GenerateBody(argv[0],bookdir);
 HtmlWriter.GenerateTail(argv[0]);

 fileselect_server(bookdir,copydestination);

} main(process.argv.slice(2));
