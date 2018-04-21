var http = require('http');
var url = require('url');
var fs = require('fs');
http.createServer(function (req, res) {
  //res.writeHead(200, {'Content-Type': 'text/plain'});
  var tmp = req.url;
  var params = url.parse(tmp);
  console.log(params.query);
  res.write(fs.readFileSync('./AJAX_tech.htm'));
  res.end('Hello World\n');
}).listen(1337);
console.log('Server running at http://127.0.0.1:1337/');
