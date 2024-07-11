function fetchData() {
    var xhr = new XMLHttpRequest();
    xhr.open("GET", "home", true);
    xhr.onreadystatechange = function () {
        if (xhr.readyState === 4 && xhr.status === 200) {
            document.getElementById("dados").innerHTML = xhr.responseText;
        }
    };
    xhr.send();
}
