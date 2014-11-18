<script>

//今日の日付データを変数hidukeに格納
var hiduke=new Date(); 

var year = hiduke.getFullYear();
var month = hiduke.getMonth()+1;
var week = hiduke.getDay();
var day = hiduke.getDate();

var yobi= new Array("日","月","火","水","木","金","土");

document.write("西暦"+year+"年"+month+"月"+day+"日 "+yobi[week]+"曜日");

</script>
