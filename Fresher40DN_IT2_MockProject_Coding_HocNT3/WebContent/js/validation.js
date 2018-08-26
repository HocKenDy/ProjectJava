 var dateObj = new Date();
    var month = ('0' + (dateObj.getMonth() + 1)).slice(-2);
    var date = ('0' + dateObj.getDate()).slice(-2);
    var year = dateObj.getFullYear();
 
    document.getElementById("y").innerHTML = year;
    document.getElementById("m").innerHTML = month;
    document.getElementById("d").innerHTML = date;